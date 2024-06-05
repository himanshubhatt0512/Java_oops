public class Insertion_Sort {
    private static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            while(j>= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    private static void Display(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,4,3,5,2,1,9};
        System.out.println("SORTING USING INSERTION SORT\n");
        System.out.println("The Unsorted Array is :");
        Display(arr);
        
        insertionSort(arr);

        System.out.println("The Sorted List is: ");
        Display(arr);
    }
}   