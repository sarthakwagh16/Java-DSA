package Arrays;

public class shuffle_array {
    public int[] shuffle_array_item(int[] arr, int n)
    {

        int[] ans=new int[2*n];
        int i=0;
        int j=n;
        for(int k=0;k<arr.length;k+=2)
        {
            ans[k]=arr[i];
            ans[k+1]=arr[j];
            i++;
            j++;
        }
        return ans;


    }


    public static void main(String[] args) {
        shuffle_array obj=new shuffle_array();
        int[] arr={2,5,1,3,4,7};
        int n=3;
        System.out.println(obj.shuffle_array_item(arr,n));


    }


}
