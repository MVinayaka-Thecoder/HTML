package Sorting_concepts;


public class BubbleSort1 {

    public static void BubbleSort(int[] nums){

        int temp=0; // declaring tem variable to swalp
        for(int i=0;i<nums.length-1;i++){// why nums.length-1 means in 1st itertation last element will be sorted to avoid again checking and it dont change output so we are avoinding
            for(int j=0;j<nums.length-i-1;i++){// length-i-1 means as last element will be sorted so to make processing fast we are avoiding to check sorted element
                if(nums[j]>nums[j+1]){
                    //if it's true then swap the values
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Arrays After Sorted using Bubble Sort :");
        for(int num:nums){
            System.out.print(num +" ");
        }


    }

    public static void main(String[] args){
        int nums[]={6,5,2,4,8,7};

        System.out.println("Array Elements Before Sorted:");
        for(int num:nums){
            System.out.print(num +" ");
        }

        BubbleSort(nums);// calling static method without creating objects
        // System.out.println();
        // System.out.println("Arrays After Sorted using Bubble Sort :");
        // for(int num:nums){
        //     System.out.print(num +" ");
        // }
    }

}

