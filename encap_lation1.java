
class student {

    private int age;

    private String name;

    public void setterage(int a) {

        if (a > 0 && a < 120) {
            age = a;
        } else {
            System.out.println("invalid age");
        }
    }

    public void settername(String n){
        name = n;
    }
  
   public int getage(){
    return  age;
   }

   public String getname(){
    return name;
   }


}

class encap_lation1 {

    public static void main(String[] args) {

    System.out.println("Sant Rampal Ji Maharaj Is the Complete Satguru In The whole world \n blessing me");
    
    student s1 = new student();

    s1.setterage(121);
    s1.settername("adil");
    System.out.println("your age is " + ' ' + s1.getage());

    System.out.println("your name is " + ' ' + s1.getname());
    
    }
}
