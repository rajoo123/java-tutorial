
class Account1 {
    int accNumber;
    String AccHolder_name;
    double belence;

    public Account1(int accNumber, String AccHolder_name, double belence) {

        this.accNumber = accNumber;
        this.AccHolder_name = AccHolder_name;
        this.belence = belence;
    }

    public void Accountinformation() {

        System.out.println("Account No " + accNumber + " AccountHolderName " + AccHolder_name);

    }

    public void desposite(double Amount) {

        if (Amount >= belence) {

            System.out.println("your have Desposit Your Amount " + Amount);

            System.out.println("your are Belence after Deposite " + (belence += Amount));

            

        } else {
            System.out.println("Please Deposite Greater than 0");
        }

    }

    public void withdraw(double Amount) {
        if (Amount >= 0) {
            System.out.println("you have withdraw Belence" + Amount);
            System.out.println("you are belence after withdraw " + (belence + -Amount));
        } else {
            System.out.println("InSufficient Belence");
        }

    }

    public void CheckcurrentBelene() {
        System.err.println("Your Current Belence is " + belence);
    }

}

class Accountdetails extends Account1 {

    double interestRate;

    public Accountdetails(int accNumber, String AccHolder_name, double belence, double interestRat) {

        super(accNumber, AccHolder_name, belence);

        this.interestRate = interestRat;

    }

    public void interestRat(double interestRat) {
        System.out.println("your interest rate is " + interestRat);
    }

    public void checkBelence() {

        System.out.println("Your Total Belence with interestRate " + (belence += interestRate));

    }

}

class Account {

    public static void main(String args[]) {
//    System.out.println("Sant Rampal Ji Maharaj jee Blessing me");

        Accountdetails Ac = new Accountdetails(2244, "Rajesh Dass", 5000, 4);
        Ac.Accountinformation();
        Ac.desposite(0);
        Ac.withdraw(500);
        Ac.CheckcurrentBelene();
        Ac.checkBelence();
        
    }
}
