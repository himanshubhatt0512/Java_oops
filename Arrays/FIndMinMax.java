class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

class FIndMinMax {

    private static Pair getMinMax(long[] a, int n){
        // long[] res = new long[2]

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(a[i] < min) min = a[i];
            if(a[i] > max) max = a[i];
        }

        return new Pair(min, max);
    }
    
    public static void main(String[] args) {
        long [] a = {3,2, 1, 56, 1000, 167};

        Pair p = getMinMax(a, a.length);
        System.out.println("Minimum value is: " +p.first + " and maximum value is : " + p.second);
    }
}

