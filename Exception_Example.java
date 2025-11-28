class  Exception_Example{
    public static void main(String[] args) {

        // System.out.println("Sant Rampal JI Maharaj JI Blessing ME");
         
         try{
            String name = null;
            System.out.println(name.length());
         }catch(NullPointerException e){
            System.out.println("Error Name can not be Null");
         } 
         try{
            String age = "abc";
            int userAge = Integer.parseInt(age);
         } catch(NumberFormatException e){
            System.out.println("age must be a number");
         } 
         
    }
}