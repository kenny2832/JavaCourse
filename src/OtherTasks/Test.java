package OtherTasks;


public class Test {

    public static void main(String[] args) {

        int[] array = {1,3,4,5,6,7,89,54};

    }
    
    public int[] maxEnd3(int[] nums) {
        int temp;
        if(nums[0] > nums[2]){
            nums[1] = nums[0];
            nums[2] = nums[0];
        }else{
            nums[0] = nums[2];
            nums[1] = nums[2];
        }
        return nums;
    }


}



