
class Central_bank {

    final double interst_rate = 5.5;

    //  int accountNo;
    final void bank_policy() {

        System.out.println("All Bank must follow central bank policy ! ");

    }
}

class bank {

    Central_bank cb = new Central_bank();

    void showInrestrate() {
        System.out.println("fixed interst rate  " + cb.interst_rate);
    }

    void bankpolicy() {
        cb.bank_policy();
    }
}

class final_keywords {

    public static void main(String[] args) {
        // System.out.println("Sant Rampal ji Maharaj ji blessing me");
        bank b1 = new bank();
        b1.showInrestrate();
        b1.bankpolicy();

    }
}
