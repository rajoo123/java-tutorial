class Animal{

   public  void sound(){
        System.out.println("animal Sound");
    }
}

 class dog extends Animal{
    @Override
   public void sound(){
     System.out.println("Dog is bark");    
    }
 }
 class cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat is talking Meow Meow");
    }
 }
 class cow extends Animal{
    @Override
    public void sound(){
        System.out.println("Cow Talking Moo Moo");
    }
 }
class overiding_problem{
    public static void main(String[] args) {
        // System.out.println("Sant Rampal ji Maharaj Blessig me");

        Animal dog = new dog();
        Animal cow = new  cow();
        Animal cat = new cat();


        dog.sound();
        cow.sound();
        cat.sound();

    }
}