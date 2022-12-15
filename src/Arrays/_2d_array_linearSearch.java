package Arrays;

import java.util.Scanner;

public class _2d_array_linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row size:");
        int row=sc.nextInt();
        System.out.println("enter col size:");
        int col=sc.nextInt();

        // declare 2D array
        int[][] stud=new int[row][col];
        System.out.println("enter array items:");
        // take input
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                stud[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter item to search");
        int key=sc.nextInt();
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(stud[i][j]==key){
                    System.out.println("item found at "+"("+i+","+j+")th"+" index");
                }
            }
        }




    }
}
