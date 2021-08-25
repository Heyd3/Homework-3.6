public class SavingsAccount extends Account {

    public SavingsAccount (int totalAmount, String name){
        super (totalAmount, name);
    }

    @Override
    public int pay(int amount){
        System.out.println("Эта операция не доступна для данного счета");
        showBalance();
        return totalAmount;
    }

    @Override
    public int transfer(Account account, int amount){
        if(totalAmount > amount){
            if (operationCheck (account, amount)){
                account.totalAmount = account.totalAmount + amount;
                totalAmount = totalAmount - amount;
                showBalance();
                return totalAmount;
            }
            else {
                System.out.println("На данный счет нельзя перевести указанную сумму");
                showBalance();
                return totalAmount;
            }
        }
        else {
            System.out.println("На вашем счете недостаточно средств для данной операции");
            showBalance();
            return totalAmount;
        }
    }

    @Override
    public int addMoney(int amount){
        totalAmount = totalAmount + amount;
        showBalance();
        return totalAmount;
    }
}
