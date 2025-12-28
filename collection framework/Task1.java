class Animal{
 int  age = 50;
  public void   sound(){
    System.out.println("The sound");
  }

    public Animal() {

      System.out.println("This is a Non Args Constructor ");

    }

   public  Animal(int num){

      System.out.println("This is a Argument Constructor " + num);

    }

    public Animal(String Name){
    System.out.println("the Animal is " + Name);
    }
       
}

class Cat extends Animal{

  int age = 10;
    public Cat() {
      super(50);
      System.out.println("child constructctor");
      System.out.println("the parents class variable "+ super.age);
      System.out.println("the child class variable "+ age);
    }



    public void sound(){
      
        System.out.println("Cat is talking  meo meo");
    }
}

class Task1{
    public static void main(String[] args) {
        // System.out.println("Sant Rampal Ji Maharaj ji Blessing Me");
        Animal c1 = new Animal("lion");
        Animal c2 = new Cat();
        c1.sound();
    }
    
}