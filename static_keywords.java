
class student {

    static int total_student = 0;

    String name;
    int rollNo;

    static {
        System.out.println("welcome to student Management System");
        System.out.println("Database connected Successfully\n");
    }

    student(String name) {
        this.name = name;
        total_student++; //increase counter everytime when object created;
        this.rollNo = total_student;

    }

    void showDetails() {

        System.out.println("Roll No " + ' ' + rollNo + " " + "Name" + ' ' + name);

    }

    static void showtotalStudent(){
        System.out.println("\n total students Regestred" + ' '+ total_student);
    }

}

class static_keywords {

    public static void main(String[] args) {
        System.out.println("sant Rampal Ji Maharaj Blessing me");

        student s1 = new student("adil");
        student s2 = new student("sunil");

        s1.showDetails();
        s2.showDetails();
        student.showtotalStudent();



    }

}
