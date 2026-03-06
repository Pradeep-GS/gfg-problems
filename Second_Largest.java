class Solution {
    public int getSecondLargest(int[] arr) {
        
        int largest =-1;
        int n = arr.length;
        int secondlargest = -1;
        for(int i=0; i<n; i++){
            if(largest < arr[i]){
                secondlargest = largest;
                largest = arr[i];
            }
            if(secondlargest < arr[i] && arr[i]<largest){
                secondlargest = arr[i];
            }
            
        }
        
        return secondlargest;
    }
}