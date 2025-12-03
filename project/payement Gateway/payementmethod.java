import java.util.*;

interface  payment{
   abstract public void pay(double Amount);
}

class jazzcash implements payment{

    
     public void pay(double Amount){
       System.out.println("you has paid through jazz cash Amount" + Amount + "Successfully");     
 
     }
}

class Easypaisa implements payment{

    
     public void pay(double Amount){
       System.out.println("you has paid through Easypaisa " + Amount + "Successfully");     
 
     }
}

class Alhabibbank implements payment{

    
     public void pay(double Amount){
       System.out.println("you has paid through Alhabib Bank  " + Amount + "Successfully");     
 
     }
}


class payementmethod{
    public static void main(String[] args) {
    //  System.out.println("Sant Rampal JI Maharaj Ji Blessing Me ");
      jazzcash jazz = new jazzcash();
      jazz.pay(555.4);
      Easypaisa easy  = new Easypaisa();
      easy.pay(5000);

    }
}