package java_package;

class InsufficientBalaceException extends Exception {
    public InsufficientBalaceException(String msg){
        super(msg);
    }
}

class Account {
    private int balance;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws InsufficientBalaceException {
        if(balance < money){
            throw new InsufficientBalaceException("잔고 부족 : " + (money - balance));
        }
        balance -= money;
    }
}

public class practice {
    public static void main(String[] args){

        Account act = new Account();

        act.deposit(1000000);
        System.out.println("예금액 : " + act.getBalance());

        try {
            act.withdraw(1500000);
        } catch (InsufficientBalaceException e){
            System.out.println(e.getMessage());
            System.out.println();
            e.printStackTrace();
        }
    }
}







