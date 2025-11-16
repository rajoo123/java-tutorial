
import java.util.Scanner;

class array2 {

    public static void main(String[] args) {
        // System.out.println("sant Rampal Ji Maharaj");

        // int [][]arr = {{1,2,3,4,5} ,{6,7,8,9,5},{10,11,12,13,5}};
        // int i,j;
        // for(i=0; i<5;i++){
        //     for(j=0;j<5;j++){
        //         System.out.println(arr[i][j] + " " );
        //     }
        // }
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int a = 0; a < size; a++) {
            System.out.println("Enter a Number Of Size");
            number[a] = sc.nextInt();
        }

        for(int a = 0;a<size;a++){
            System.err.println(number[a]);
        }

    }
}
