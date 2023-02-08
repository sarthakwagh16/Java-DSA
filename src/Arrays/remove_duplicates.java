package Arrays;

public class remove_duplicates {
// number of duplicate items present inside an array
    int removeDupli(int[] nums)
    {
        int n=nums.length;
        int k=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        remove_duplicates obj=new remove_duplicates();
        int[] nums={1,1,2};
        System.out.println(obj.removeDupli(nums));

    }
}
