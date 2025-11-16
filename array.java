
import java.util.Scanner;

class array {

    public static void main(String[] args) {
        // System.out.println("sant Rampal Ji Maharaj ji Blessing me");
        //  Scanner sc = new Scanner(System.in);

        //  System.out.println("Enter Your Name");
        //   String Name = sc.nextLine();
        //   System.out.println("Enter Your age");
        //   int age = sc.nextInt();
        //   System.out.println("Your Name " +Name +  " and " + age );
        // int a []= {22,11,44,66};
        // System.out.println(a[1]);
        // // int a =0;
        //  for(int b=0 ; b<=a.length; b++){
        //   System.out.println(a[b]);
        int[] arr = new int[4];
        arr[0] = 20;
        arr[1] = 50;
        arr[2] = 30;
        arr[3] = 90;

        System.out.println(arr[3]);

        Scanner ar = new Scanner(System.in);

        int[] arra = new int[3];

        for (int i = 0; i < arra.length; i++) {

            System.out.println("Enter Number you want to store in Array" + (i + 1));

            arra[i] = ar.nextInt();

        }
          
        for(int  i = 0; i<arra.length;i++){

            System.out.println("arra[" +i+ "] " + arra[i]);
            
        }

    }

}
