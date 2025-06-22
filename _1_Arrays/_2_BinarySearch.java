package Searching_concepts;

class BinarySearch2 {

    public static int Binary_Search(int[] nums, int target){
        int left=0; // start index
        int right=nums.length-1;
        int steps=0;

        while(left<=right){

            steps++;
            int mid=(left+right)/2;// calculating the mid indexresults in index value like 0,1......
            if(nums[mid]==target){

                System.out.println("Steps used in Binary Search is :"+steps);
                return mid; // which returns index
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        System.out.println("Steps used in Binary Search is :"+steps);
        return -1;
    }

    public static void main(String[] args) {

        int nums[]={11,9,5,12,6};
        int target=6;

//        int nums[]= new int[1000];
//        int target=900;

        int results= Binary_Search(nums, target);
        if(results!=-1){
            System.out.println("Element found at index :"+results);
        }
        else{
            System.out.println("Element not found in the list");
        }


    }
}