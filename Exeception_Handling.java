
class Exeception_Handling {

    public static void main(String[] args) {

        // System.out.println("Sant Ramapal ji Maharaj Ji Blessing Me");
        // try {
        //     int a = 2;
        //     int b = 4;
        //     int c = a / b;
        //     System.out.println( "Result "+ c);
        // } catch(ArithmeticException e){
        //    System.out.println("Can not be Divided");
        // }
        try {
            int arr[] = {1, 2, 3, 4};
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOFException Error Aa gy Bhai");
        } finally {
            System.out.println("Finally Block Heshma run Hoga ");
        }

    }
}
