package Day3;

public class Choice {
    public static void main(String[] args) {
        //选择排序：减少了冒泡排序的次数.
        //选一个数出来，当作最大值，然后与后面的比较，如果小，最大值就是后面那个
        int[] nums = {1,2,55,99,44,22,33,1,2,3,7};
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
        // for(int i =0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             int t = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = t;
        //         }
        //     }
        // }
        //优化，提取索引
        for(int i=0;i<nums.length-1;i++){
            int maxindex = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[maxindex]>nums[j]){
                    maxindex = j;
                }
            }
            // 如果最小值不是当前位置，交换
            if (maxindex != i) {
                int t = nums[i];
                nums[i] = nums[maxindex];
                nums[maxindex] = t;
            }
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
