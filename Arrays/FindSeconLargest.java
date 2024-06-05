public class FindSeconLargest {

    private static int secondLargest(int[] arr){
        int n = arr.length;
        int first = arr[0], second = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] < first && arr[i] > second) second = arr[i];
        }

        return second;
    }
    
    public static void main(String[] args) {
        int [] ar1 = {2,5,4,9,7,8,6,3};
        int [] ar2 = {10,2,5,11,99,77,56,42};

        System.out.println(secondLargest(ar1));
        System.out.println(secondLargest(ar2));

    }
}
