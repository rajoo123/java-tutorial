class Animal{

// this is a constructor overloading 
    public Animal() {
        System.out.println("Animal is ");
    }

    Animal(String Name){
        System.out.println("This Animal is" + Name);
    }

    Animal(String Name, int age){
         
         System.out.println("Cow is Moo Moo" + Name + " age is  "+ age);
         
    }
    
}

class constructor{
    public static void main(String[] args) {
    // System.out.println("Sant Rampal Ji Maharaj Blessig me");
    Animal dog1 = new Animal();
    Animal dog2 = new Animal("dog");
    Animal cow = new Animal("cow",4);

    }
}