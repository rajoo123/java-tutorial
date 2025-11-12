abstract class  Animal{

    abstract void  sound();

     Animal(){
        System.out.println("Animal all is the soul of God");
     }

}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Is Talking to Bow Bow");
    }
}


class cat extends Animal{
    void  sound(){
        System.out.println("Cat is Talking Meo Meo");
    }
}

class  cow extends Animal{
    void sound(){
        System.out.println("Cow is Talking maa maa");
    }
}

class abstraction{
    public void main(String [] args){

        // System.out.println("Sant Rampal Ji Maharaj Blessing me");

        Dog d = new Dog();
        cat c = new cat();
        cow cw = new  cow();
        d.sound();
        c.sound();
        cw.sound();



    }
}