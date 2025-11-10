class BankInterest {

    // 🔹 Method 1 — Calculate interest (only amount & years)
    double calculateInterest(double amount, int years) {
        double rate = 6.5; // default interest rate
        return (amount * rate * years) / 100;
    }

    // 🔹 Method 2 — Calculate interest with custom rate
    double calculateInterest(double amount, int years, double rate) {
        return (amount * rate * years) / 100;
    }

    // 🔹 Method 3 — Calculate interest with bonus rate (like special offer)
    double calculateInterest(double amount, int years, double rate, double bonusRate) {
        double totalRate = rate + bonusRate;
        return (amount * totalRate * years) / 100;
    }

    // 🔹 Method 4 — Calculate interest for multiple accounts (array)
    double calculateInterest(double[] balances, double rate) {
        double totalInterest = 0;
        for (double bal : balances) {
            totalInterest += (bal * rate) / 100;
        }
        return totalInterest;
    }
}

public class overloading_probelm {
    public static void main(String[] args) {
        System.out.println("Sant Rampal Ji Maharaj Blessing Me 🙏");
        System.out.println("=== Advanced Bank Interest Calculator ===\n");

        BankInterest bank = new BankInterest();

        // ✅ Method 1
        System.out.println("Default Interest (6.5%): " + bank.calculateInterest(100000, 2));

        // ✅ Method 2
        System.out.println("Custom Interest (7.5%): " + bank.calculateInterest(100000, 2, 7.5));

        // ✅ Method 3
        System.out.println("Bonus Interest (7.5% + 0.5%): " + bank.calculateInterest(100000, 2, 7.5, 0.5));

        // ✅ Method 4
        double[] accounts = {50000, 75000, 100000};
        System.out.println("Total Interest (for multiple accounts @7%): " + bank.calculateInterest(accounts, 7.0));
    }
}
