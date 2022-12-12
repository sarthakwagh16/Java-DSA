package Arrays;
import java.util.Scanner;

public class array_intro {
    public static void main(String[] args) {
        // declare array
        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        //System.out.println(arr[0]);

        // method 2
        int[] arr2={10,20,30,40,50};
        //System.out.println(arr2[4]);

        //method 3
        int arr3[]=new int[10];
        arr3[0]=100;
        //System.out.println(arr3[0]);

        Scanner sc=new Scanner(System.in);
        // declare array of any size
        System.out.println("enter size of array:");
        int size=sc.nextInt();
        int[] stud=new int[size];

        // taking input using for-loop and scanner class
        System.out.println("enter array items:");
        for(int i=0;i<size;i++)
        {
            stud[i]=sc.nextInt();
        }
        // printing the array items
        System.out.println("array items are:");
        for (int item:stud) {
            System.out.println(item);

        }


    }
}
