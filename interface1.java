interface A {

  public void phone();

   default  void all(){
    
        System.out.println("this is a default using interface we want to define body");
    } 
    
    static void staticmethod(){
        System.out.println("this is a static method from A");
    }
    
     }    
    
    interface B {
     public void laptop();

      private pmethod(){
          
     }

    }


class c implements A,B{
    public  void  phone(){
        System.out.println("this is a i phone from A ");
    }
    public void laptop(){
        System.out.println("laptop from B");
    }
}

class interface1{
    public void main(String [] args){
    //    System.out.println("Guru Ji Sant Rampal ji Maharaj blessing me");

       c c1 = new c();

       c1.laptop();

       c1.phone();

       A.staticmethod();


    }
}