class Palindrome {

    private static boolean isPalindrome(String s){
        int lo=0, hi = s.length()-1;

        while (lo < hi) {
            if(s.charAt(lo) != s.charAt(hi)) return false;
            lo++;
            hi--;            
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "naman";
        String s2 = "pennsylvania";

        System.out.println("The String \""+ s1 + "\" is Palindrome : " + isPalindrome(s1));
        System.out.println("The String \""+ s2 + "\" is Palindrome : " + isPalindrome(s2));
    }
    
}
