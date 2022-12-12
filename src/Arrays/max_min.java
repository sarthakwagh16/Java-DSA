package Arrays;
import java.util.Scanner;

// maximum and minimum number from array

public class max_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array items:");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<size;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max number is:"+' '+max);
        for (int i=0;i<size;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min number is:"+' '+min);

    }
}
