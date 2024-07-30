import java.util.*;
class bankacc 
{
    String name;
    String account_type;
    long account_number;
    double account_balance;
    void accdetail(String name,String account_type,long account_number,double account_balance)
    {
        name=this.name;
        account_type=this.account_type;
        account_number=this.account_number;
        account_balance=this.account_balance;
    }
    void deposit(double amount) 
    {
        if(amount>0) 
        {
            account_balance=account_balance+amount;
            System.out.println("Deposit successful.\nNew balance: Rs"+account_balance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) 
    {
        if (amount>0&&amount<=account_balance) 
        {
            account_balance=account_balance-amount;
            System.out.println("Withdrawal successful.\nNew balance: Rs"+account_balance);
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    void displayDetails() 
    {
        System.out.println("Depositor Name: "+name);
        System.out.println("Account Type: "+account_type);
        System.out.println("Account Number: "+account_number);
        System.out.println("Balance: Rs"+account_balance);
    }
    public static void main(String args[]) 
    {
        long da,wa;
        Scanner sc=new Scanner(System.in);
        bankacc myAccount = new bankacc();
        myAccount.accdetail("John Doe", "Savings", 123456789, 1000.0);
        System.out.println("Enter the amount to be deposited :");
        da=sc.nextLong();
        myAccount.deposit(da);
        System.out.println("Enter the amount to be withdrwed :");
        wa=sc.nextLong();
        myAccount.withdraw(wa);
        System.out.println();
        myAccount.displayDetails();
        sc.close();
    }
}
