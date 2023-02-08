package Arrays;

public class diff_eleSum_digitSum {
    // find absolute diff between element sum and the digit sum
    public int findDiff(int[] nums)
    {
        int n=nums.length;
        int ele_sum=0;
        for(int i=0;i<n;i++){
            ele_sum+=nums[i];
        }
        int digit_sum=0;

        for(int i=0;i<n;i++)
        {
            int rem=0;
            rem=nums[i]%10;
            digit_sum+=rem;
            nums[i]=nums[i]/10;
        }

        return Math.abs(ele_sum-digit_sum);
    }
    public static void main(String[] args) {
        diff_eleSum_digitSum obj=new diff_eleSum_digitSum();

        int[] nums={1,15,6,3};
        System.out.println(obj.findDiff(nums));
    }
}
