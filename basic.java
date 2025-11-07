
class A {
   private  int age = 10;
   private  String name = "ali";

public void setter(int a , String n ){
         this.age = a ;
         this.name = n;
  }

  public String getter(){

     return  "the name " +  name + " "+ "age is " + " "+ age;
  }

}

class basic {

public static void main(String args[]){
      
 System.out.println("God is one he is Kabir Saheb Ji"); 

 A  a1 =new A();

a1.setter(10, "adil");
System.out.println(a1.getter());

 

    }
}