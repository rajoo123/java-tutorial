class second_Exception{
    public static void main(String[] args) {
        // System.out.println("Sant Rampal JI Maharaj Ji Blessing Me");
        void checkAge(int age){
            
            if(age<18){
                throw new ArithmeticException("Age Must be 18 +");
            }
            System.out.println("Welcome");
        }  
    }
}