import java.util.Vector;

public class twopointer {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 15;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
    
    //3sum code
    public static void threeSum(int[] nums) {   
        Vector<Vector<Integer>> res = new Vector<>();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    Vector<Integer> temp = new Vector<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println(res);
    }
   public static void majorityElement(int nums[]){
    
    int f=0;
   for(int i=0;i<nums.length;i++){
    if(nums[i]==nums[i+1]){
        f++;
    }System.out.println(f);
   }
       
    

   }
    

}
