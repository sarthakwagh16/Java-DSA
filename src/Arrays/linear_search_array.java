package Arrays;
import java.util.Scanner;

// linear search in array

public class linear_search_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array items:");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter key to find:");
        int key=sc.nextInt();
        for (int i=0;i<size;i++) {
            if (arr[i] == key) {
                System.out.println("item found at index" + " " + i);
            }

        }
    }
}
