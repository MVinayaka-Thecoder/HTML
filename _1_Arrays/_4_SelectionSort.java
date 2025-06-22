package Sorting_concepts;

public class SelectionSort2 {

    public static void main(String[] args){
        int[] nums={2,5,6,8,9,4};
        System.out.println("Before Sorting:");
        for(int num:nums){
            System.out.print(num+" ");
        }
         Selection_Sort(nums);
    }
    public static void Selection_Sort(int[] nums){
        int min=-1;
        int temp=0;

        for(int i=0;i<nums.length-1;i++){
            min=i;
            for(int j=i+1;i<nums.length;i++){
                if(nums[min]>nums[j]){
                    min=j;
                }

                temp=nums[min];
                nums[min]=nums[j];
                nums[j]=temp;
            }


            System.out.println();
            System.out.println("After sorted: ");
            for(int num:nums){
                System.out.print(num +" ");
            }
        }


    }

}
