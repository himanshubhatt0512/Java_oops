class Selection_Sort {
    private static void selectionSort(int[] input) {
        for (int i = 0; i<input.length-1; i++) {
            int min = input[i];
            int minIndex = i;
            for (int j = i+1; j<input.length; j++) {
                if(input[j]<min) {
                    min = input[j];
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                input[minIndex] = input[i];
                input[i] = min;
            }
        }
    }
    private static void Display(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int input[] = {20,56,84,16,40};
        System.out.println("SORTING USING SELECTION SORT\n");
        System.out.println("The Unsorted Array is:");
        Display(input);
        selectionSort(input);
        System.out.println("The Sorted Array is: ");
        Display(input);
    }
}