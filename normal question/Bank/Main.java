import java.util.Scanner;

public class Main {
    private int balance=10000000;
    void withdrawal(int amount) throws LowBalanceException
    {
        if(balance<amount)
        {
            throw new LowBalanceException("Amount exceeds Balance");
        }
        else
        {
            balance=balance-amount;
            System.out.println("Remaining balance: "+balance);
        }
    }
    public static void main(String args[]) throws LowBalanceException
    {
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        int amount;
        System.out.println("Enter withdrawal amount: ");
        amount=sc.nextInt();
        m.withdrawal(amount);
    }
}
