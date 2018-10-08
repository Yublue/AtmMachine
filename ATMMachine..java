import java.util.Scanner;
import java.io.IOException;
import java.awt.*;


public class ATMMachine {
    int pin;
    int withdraw;
    int deposit;
    int transfer;
    int checkBalance;
    String accountName;
   static String check = "Y";
    
    public int getpin(){return pin;}
    public void setpin(int pin){this.pin = pin;}
    


        public static void main(String[] args){
            
            int pin;
            
            ATMMachine ATMMachine = new ATMMachine();
            ATMMachine.setpin(1759);
            
            int balance = 5000, withdraw, deposit;
            
            Scanner setpin = new Scanner(System.in);
            System.out.println("Enter your pin");
            pin = setpin.nextInt();
            
            if (pin == ATMMachine.pin)
                System.out.println("#Proceed with your transaction");
            else {
                System.out.println("Invalid pin try again");
                System.exit(0);
            }
            Scanner s = new Scanner(System.in);
            while(check == "Y")
            {
                
                System.out.println("Automated Teller Machine");
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for EXIT");
                System.out.print("Choose the operation you want to perform:");
                int n = s.nextInt();
                switch(n)
                {
                    case 1:
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = s.nextInt();
                        if(balance >= withdraw)
                        {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Enter money to be deposited:");
                        deposit = s.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Balance : "+balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.exit(0);
                }
            }
       
        }
}

