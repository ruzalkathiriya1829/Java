import java.util.Scanner;

abstract class Bank {

    abstract void getRateOfInterest(double rate);
    abstract void displayInterest();

}

class SBIBank extends Bank {

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

class HDFCBank extends Bank {

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

class BOBBank extends Bank {

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

        Bank b = new SBIBank();
        b.getRateOfInterest(1.5);
        b.displayInterest();
       
        Bank b1 = new HDFCBank();
        b1.getRateOfInterest(2);
        b1.displayInterest();

        Bank b2 = new BOBBank();
        b2.getRateOfInterest(2.5);
        b2.displayInterest();
    }
}