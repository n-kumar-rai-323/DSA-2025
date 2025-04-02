

public class problem {
    public static void valueUpdate(int arr[], int factor){
        for(int i =0; i<arr.length; i++){
            arr[i] = arr[i] * factor;
        }
    }
    public static void main(Stringpr[] args) {
    // Problem 1: Array Scaling
    // Create a method that takes an integer array and a scaling factor as input.
    // The method should multiply each element of the array by the scaling factor.
    // Example:
    // Input: array = {1, 2, 3}, factor = 2
    // Output: array = {2, 4, 6}
    int arr[]={1,2,3};
    int factor=2;
    valueUpdate(arr, factor);

    //printing 
    for(int i =0;i<arr.length; i++){
        System.out.println(arr[i]);
    }
    
    }
}
