package DSA;

public class SelectionSort {
    public static int[] selectionsort(int arr[]){
        int i, j, max, temp; 
        for (i = arr.length - 1; i > 0; i--) {  
            max = i; 
            for (j = i - 1; j >= 0; j--) { 
                if (arr[j] > arr[max])
                    max = j; 
            }
  // swap elements 
                temp = arr[max];  
                arr[max] = arr[i];  
                arr[i] = temp; 
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,3};
       for (int i : selectionsort(arr)) {
        System.out.println(i);
       }
        }
    }
    

