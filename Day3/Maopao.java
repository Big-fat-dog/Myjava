package Day3;

public class Maopao {
    public static void main(String[] args) {
        //冒泡排序，比较相邻两个，nums[i]和nums[i+1]
        int[] nums = {1,9,55,4,2,3,1,66};
        
        for(int num:nums){
            System.out.println(num);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                int num1 = nums[j];
                int num2 = nums[j+1];
                if(num1>num2){
                    nums[j] = num2;
                    nums[j+1] = num1;
                }
            }
        }
        System.out.println("```````````````````");
        for(int num:nums){
            System.out.println(num);
        }
    }
}
