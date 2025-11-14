package DSA;

public class BubbleSort {
    public static void bubblesort(int[] arr){
    int len = arr.length;
    for(int i=0;i<len;i++){
        for(int j=0;j<len-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
    public static void main(String[] args) {
        int[] arr ={2,4,3,1,5};
        bubblesort(arr);
        for(int ar : arr)
           System.out.println("The sorted array : "+ar);
    }
}