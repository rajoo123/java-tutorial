
import java.util.*;

abstract class Employe {

    int id;
    String Name;

    public Employe(int id, String Name) {
        this.id = id;
        this.Name = Name;

    }

    public String getName() {
        return Name;
    }

    public int get_id() {
        return id;

    }

    abstract double CalculateSalry();

    @Override
    public String toString() {

        return "Employe [Name " + Name + ", Id " + id + " Salary " + CalculateSalry() + "  ]";
    }

}

class FulltimeEmploye extends Employe {

    double monthly_salry;

    public FulltimeEmploye(int id, String Name, double monthly_salry) {
        super(id, Name);
        this.monthly_salry = monthly_salry;
    }

    public double CalculateSalry() {

        return monthly_salry;
    }

}

class partimeEmploye extends Employe {

    private int housrworked;
    private double Hourlyrate;

    public partimeEmploye(int id, String Name, int housrworked, double Hourlyrate) {
        super(id, Name);
        this.housrworked = housrworked;
        this.Hourlyrate = Hourlyrate;
    }

    public double CalculateSalry() {
        return housrworked * Hourlyrate;
    }

}

class payrollSystem {

    ArrayList<Employe> employlist;

    public payrollSystem() {

        employlist = new ArrayList<>();
    }

    public void addEmploye(Employe employe) {
        employlist.add(employe);

    }

    public void removeEmploye(int id) {
        Employe employetoremove = null;
        for (Employe employe : employlist) {
            if (employe.get_id() == id) {
                employetoremove = employe;
                break;
            }
        }
        if (employetoremove != null) {
            employlist.remove(employetoremove);
        }
    }

    public void DisplayEmploye(){
        for(Employe employe : employlist){
            System.out.println(employe);
        }
    }

}

class Employe_system {

    public static void main(String args[]) {
        System.out.println("Sant Rampal Ji Maharaj Ji Blessing ME");
        payrollSystem  payrolSystem = new  payrollSystem();

        FulltimeEmploye emp1 = new FulltimeEmploye(1, "Sunil", 5000);
        partimeEmploye emp2 = new  partimeEmploye(2, "Rahul", 2, 1000);
        payrolSystem.addEmploye(emp1);
        payrolSystem.addEmploye(emp2);
        payrolSystem.DisplayEmploye();
        payrolSystem.removeEmploye(1);
        System.out.println("remainig Employe After Remove");
        payrolSystem.DisplayEmploye();


    }
}
