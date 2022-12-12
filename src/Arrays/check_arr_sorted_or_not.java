package Arrays;
import java.util.Scanner;

// check if array is sorted or not in ascending order

public class check_arr_sorted_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array items:");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        boolean flag=false;
        for(int i=0;i<size-1;i++){
            if(arr[i]<arr[i+1]){
                flag=true;

            }
        }
        if(flag){
            System.out.println("array is not sorted...");
        }
        else {
            System.out.println("array is sorted...");
        }
    }
}
