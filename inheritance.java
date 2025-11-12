class parent{
    public String name;

    public int age;

    public parent(String n , int a) {
       
       name = n;
       age = a;
       System.out.println("parent constructor is called by " + name);
    } 
    public void  son(){

       System.out.println("Do you know we are all son of God Kabir");

    }

}

class child extends parent{

    public child(String Name) {

        super("sajjad", 60);


        System.out.println("my name is " + Name);
    }
          
     }


class inheritance{
    public static void main(String[] args) {

    // System.out.println("Sant Rampal ji Maharaj Blessing me");  

      child ch = new child("Adil");
      child ch1 = new child("muneeeb");


    }

}