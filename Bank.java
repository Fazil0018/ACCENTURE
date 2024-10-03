import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }
}
class ATM{
    private BankAccount account;
    public ATM(BankAccount bankAccount){
        account = bankAccount;
    }
    public void displayMenu(){
        System.out.println("ATM Menu:");
        System.out.println("1.check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.withdraw");
        System.out.println("4.Exit");
        }
        public void run(){
            Scanner sc=new Scanner(System.in);
            while(true){
                displayMenu();
                System.out.print("select an opton:");
                int choice = sc.nextInt();

                switch(choice){
                    case 1:
                    System.out.println("your balance:RS."+account.getBalance());
                    break;

                    case 2:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful.your balance :RS."+account.getBalance());
                    break;

                    case 3:
                    System.out.print("enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    if(account.withdraw(withdrawAmount)){
                        System.out.println("withsraw sucessful.your balance:RS."+account.getBalance());
                    }else{
                        System.out.println("Insufficient balance");
                    }
                    break;

                    case 4 :
                    System.out.println("Thank you for using the ATM!");
                    sc.close();
                    return;
                    default:
                    System.out.println("Invalid option.please select a valid option");
                }
                }
            }
        }
public class Bank {
    public static void main(String[] args){
        BankAccount useAccount = new BankAccount(1000);
        ATM atm=new ATM (useAccount);
        atm.run();
    }
}
