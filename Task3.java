import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25, 30};

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
