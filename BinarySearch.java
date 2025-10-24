package DSA;
// this is to understand the merge from Rusith
public class BinarySearch {
    public static int binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if(arr[mid]==target)
               return mid;
            else if(arr[mid]<target)
               left=mid+1;
            else
               right=mid-1;            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={10,20,30,40,50,60,70,80};
        int tar_value =50;
        int result =binarySearch(array, tar_value);
        if(result==-1){
        System.out.println("The element is not found");
        System.out.println("Thankyou Rusi"); }
        else
         System.out.println("The element found at :"+result);
    }
    
}
