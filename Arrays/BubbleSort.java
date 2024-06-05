public class BubbleSort {
    public static void bubbleSort(int input[]){	
        for(int i = 0; i < input.length - 1; i++){
            for(int j = 0; j < input.length - i -1; j++ ){
                if(input[j] > input[j + 1]){
                int temp = input[j];
                input[j] = input[j + 1];
                input[j + 1] = temp;
                }
            }
        }
    }
    public static void PrintArray(int[] array){
        for(int i= 0 ; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int input[] = {13, 7, 6, 45, 21, 9, 101, 102};
        System.out.println("SORTING USING BUBBLE SORT\n");
        System.out.println("The given array is :");
        PrintArray(input);
        bubbleSort(input);
        System.out.println("The sorted array is :");
        PrintArray(input);
    }
}