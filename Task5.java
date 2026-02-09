
 import java.util.Arrays;
 import java.util.Scanner;

 public class Task5 {
    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter value of K: ");
         int k = sc.nextInt();

         Arrays.sort(arr); // sort array

         if (k > 0 && k <= arr.length) {
             System.out.println("Kth smallest element is: " + arr[k - 1]);
         } else {
             System.out.println("Invalid K value");
         }

         sc.close();
     }
 }





