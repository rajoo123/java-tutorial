
import java.util.Scanner;

class ATM1 {

    float Balance;
    int pin = 4674;

    public void checkpin() {
        System.out.println("Enter Your Pin : ");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin == pin) {
            menu();

        } else {
            System.out.println("Enter a valid pin");
        }
    }

    public void menu() {

        System.out.println("Enter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdrw Money");
        System.out.println("3. Deposite Money ");
        System.out.println("4. Exit ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1){
            checkBelence();
        } else if (opt == 2) {
            withdraw();
        } else if (opt == 3) {
            Deposite();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Please Enter a valid choice");
        }

    }

    public void checkBelence() {
        System.out.println("Your Belence is " + Balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter Amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        if (Amount > Balance) {
            System.out.println("insufficient Balance");
        } else {
            Balance = Balance - Amount;
            System.out.println("Money Withdraw Successful");
        }
        menu();
    }

    public void Deposite() {
        System.out.println("Enter to Deposite Balance");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        Balance += Amount;
        System.out.println("Belance Depsite Successful");
        menu();

    }

}

class Atm {
    public static void main(String[] args) {
    ATM1  at = new   ATM1();
    at.checkpin();

    }
}
