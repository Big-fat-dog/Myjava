package Day4;
//二分查找
public class Binsearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7,8,9};
        //找到4
        int left = 0;
        int right = nums.length-1;
        int target = 8;
        int middle=0;

        while(left<right){
            middle = (right+left)/2;
            if(nums[middle]<target){
                left = middle+1;
            }else if(nums[middle]>target){
                right = middle-1;
            }else{
                break;
            }
        }
        System.out.println(nums[middle]);
    }
}
