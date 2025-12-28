abstract class Car{

    String color;
    String Model;
    int speed;

    public void run(){
        System.out.println("car is running");
    }

 abstract public void stop();


}

class car2 extends Car{
 public void stop(){
    System.out.println("stop the car");
 }
}

class First_question{
    
    public static void main(String [] args){
        System.out.println("Sant Rampal Ji Maharaj Ji blessing  Me Please");

        car2  mycar = new car2();

        mycar.run();
        mycar.stop();
    }
}
