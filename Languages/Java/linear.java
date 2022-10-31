import java.util.Scanner;
import java.lang.*;

public class linear {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 6, 9, 3};
        System.out.println("Enter the number to search in java");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i : arr) {
            if (i==n){
                System.out.println("n is present at "+ i);
                return;
            }
        }
    }
}
