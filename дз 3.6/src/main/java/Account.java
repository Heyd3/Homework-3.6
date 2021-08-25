public class Account {
    int totalAmount;
    String name;

    public Account (int totalAmount, String name){
        this.totalAmount = totalAmount;
        this.name = name;
    }

    public int pay(int amount){
        return totalAmount;
    }

    public int transfer(Account account, int amount){
        return totalAmount;
    }

    public int addMoney(int amount){
        return totalAmount;
    }

    public void showBalance(){
        System.out.println(name + " баланс: " + totalAmount);
    }

    public boolean operationCheck (Account account, int amount){

        if (account.totalAmount < 1){
            if (account.totalAmount + amount < 1){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }
    }
}
