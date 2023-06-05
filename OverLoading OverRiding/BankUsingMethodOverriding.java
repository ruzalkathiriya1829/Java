//overriding
import java.util.Scanner;

public class BankUsingMethodOverriding {

            void getRateOfInterest(double rate)
            {
                System.out.println("getRateOfInterest function of class BankUsingMethodOverriding");
            }

            void displayInterest()
            {
                System.out.println("Display function of class BankUsingMethodOverriding");
            }
    
    }
    
    class SBIBank extends BankUsingMethodOverriding {
    
        Scanner sc = new Scanner(System.in);
    
        double p, r, t, interest;
    
        void getRateOfInterest(double rate) {
            r = rate;
        }
    
        void displayInterest() {
    
            System.out.println("_____________________SBI BANK__________________");
            
            System.out.println("please enter value of Principle amount:");
            p = sc.nextFloat();
    
            System.out.println("please enter value of time:");
            t = sc.nextFloat();
    
            interest = ((p * r * t) / 100);
            System.out.println("Interest with SBI bank = " + interest);
        }
    }
    
    class HDFCBank extends BankUsingMethodOverriding {
    
        Scanner sc = new Scanner(System.in);
    
        double p, r, t, interest;
    
        void getRateOfInterest(double rate) {
            r = rate;
        }
    
        void displayInterest() {
    
            System.out.println("_____________________HDFC BANK__________________");
    
            System.out.println("please enter value of Principle amount:");
            p = sc.nextFloat();
    
            System.out.println("please enter value of time:");
            t = sc.nextFloat();
    
            interest = ((p * r * t) / 100);
            System.out.println("Interest with SBI bank = " + interest);
        }
    }
    
    class BOBBank extends BankUsingMethodOverriding {
    
        Scanner sc = new Scanner(System.in);
    
        double p, r, t, interest;
    
        void getRateOfInterest(double rate) {
            r = rate;
        }
    
        void displayInterest() {
    
            System.out.println("_____________________BOB BANK__________________");
    
            System.out.println("please enter value of Principle amount:");
            p = sc.nextFloat();
    
            System.out.println("please enter value of time:");
            t = sc.nextFloat();
    
            interest = ((p * r * t) / 100);
            System.out.println("Interest with SBI bank = " + interest);
        }
    
        public static void main(String[] args) {
    
            BankUsingMethodOverriding b = new SBIBank();
            b.getRateOfInterest(1.5);
            b.displayInterest();
           
            BankUsingMethodOverriding b1 = new HDFCBank();
            b1.getRateOfInterest(2);
            b1.displayInterest();
    
            BankUsingMethodOverriding b2 = new BOBBank();
            b2.getRateOfInterest(2.5);
            b2.displayInterest();
        }
    } 


