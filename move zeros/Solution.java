class Solution {
    int nums[];
    
    public void moveZeroes(int[] nums) {
        this.nums = nums;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            if(nums[start] == 0){
                for(int j = start; j < end ; j ++){
                int temp = nums[j] ;
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                }
                end --;
            }else
            start ++;
        }   
    }
        
        
        
        public void showArrayElement(){
            for(int i = 0; i < nums.length ; i++){
                System.out.print(nums[i]+" ");
            }
        }

}
