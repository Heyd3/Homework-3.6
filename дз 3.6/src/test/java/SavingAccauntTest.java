import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;


public class SavingAccauntTest {
    SavingsAccount sut;
    SavingsAccount sut2;

    @BeforeEach
    public void init(){
        sut = new SavingsAccount(1000, "Accaunt1");
        sut2 = new SavingsAccount(2000, "Accaunt2");
    }

   @Test
    public void payTest (){
       int amount = 500, expected = sut.totalAmount;
       int result = sut.pay(amount);
       assertEquals(result, expected);
   }

    @Test
    public void transferTest (){
        int amount = 500, expected = sut.totalAmount - amount;
        int result = sut.transfer(sut2, amount);
        assertEquals(result, expected);
    }

    @Test
    public void addMoneyTest () {
        int amount = 500, expected = sut.totalAmount + amount;
        int result = sut.addMoney(amount);
        assertEquals(result, expected);
    }

    @Test
    public void addMoneyTest1 () {
        int amount = 500, expected = sut.totalAmount + amount;
        int result = sut.addMoney(amount);
        assertThat(result, lessThanOrEqualTo(expected));
    }

    @Test
    public void transferTest1 (){
        int amount = 2500, expected = sut.totalAmount;
        int result = sut.transfer(sut2, amount);
        assertThat(result, lessThanOrEqualTo(expected));
    }


}
