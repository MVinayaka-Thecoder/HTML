package Searching_concepts;

public class LinearSearch1 {
    // writing logic for Linear_Search
    public static int Linear_Search(int[] nums, int target){
        int steps=0;

        for(int i=0;i<nums.length;i++){
            steps++;
            if(nums[i]==target){
                System.out.println("Steps used to solve Linear_Search :"+ steps);
                return i; // returning index value
            }

        }
        System.out.println("Steps used to solve Linear_Search :"+ steps);
        return -1; // returning -1 if the target value is not there in list
    }



    public static void main(String[] args){

        int [] nums={10,20,30,40,60,70}; // declaring an array
        int target=30;// setting the target value

        // int nums[]= new int[1000];
        // int target=900;


        int results= Linear_Search(nums, target);// as we use static method of linear search we can directly acces the function
        // the return value either index or -1 is stored in results
        if(results!=-1){
            System.out.println("Element found at index :"+results);
        }
        else{
            System.out.println("Element not found");
        }

    }
}


