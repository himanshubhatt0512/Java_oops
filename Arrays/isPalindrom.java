class isPalindrom {
    private static boolean isPalindrome(int[] arr){
        int i=0, j= arr.length-1;

        while (i<j) {
            if(arr[i] != arr[j]) return false;

            i++;
            j--;
            
        }
        return true;
    }

    public static void main(String[] args) {
        int [] a1 = {1,2,3,4,3,2,1};
        int [] a2 = {1,2,3,4,1,2,3};

        if(isPalindrome(a1))System.out.println("Array a1 is Palindrome");
        if(isPalindrome(a2) == false)System.out.println("Array a2 is not Palindrome");
    }
}
