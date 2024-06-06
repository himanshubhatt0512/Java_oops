public class FindFrequency {

    static int findFrequency(int Arr[], int X){
        int n= Arr.length;
        int f = 0;
        for(int i=0; i<n; i++){
            if(Arr[i] == X) f++;
        }
        
        return f;
        
    }    

    public static void main(String[] args) {
        int [] a = {1,2,3,2,1,4,2,1,1};
        int f = findFrequency(a, 1);

        System.out.println("The frequency of the given array is : "+ f);

    }
}
