
import java.util.Scanner;


class Student1 {

    int age;
    String Name;
    double marks;

    public void setname(String name) {
        if (name.length() < 2) {
            System.out.println("name must be at least 2 character");
        } else {
            this.Name = name;
        }
    }

    public void setage(int age) {
        if (age >= 5 || age <= 120) {
            System.out.println("age greter than 5 and less than 120");
        } else {
            this.age = age;
        }
    }

    public void setmarks(double marks) {
        if (marks > 0 || marks <= 100) {
            System.out.println("marks must be greater than 0 and less than 100");
        } else {
            this.marks = marks;
        }

    }

}

class Student {

    public static void main(String[] args) {
        // System.out.println("Sant Rampal Ji  Maharaj ji Blessign me ");
      Scanner sc = new Scanner(System.in);
      Student1 s = new Student1();
      System.out.println("Enter your name ");

      s.setname(sc.nextLine());
      System.out.println("Enter your age ");
      s.setage(sc.nextInt());
      System.out.println("Enter your ");
      s.setmarks(sc.nextDouble());

    }

}
