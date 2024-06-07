class Anagram {

    private static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int[] f = new int[26];

        for(char ch : s1.toCharArray()) f[ch - 'a']++;

        for(char ch : s2.toCharArray()) f[ch - 'a']--;

        for(int i=0; i<26; i++) if(f[i] != 0)return false;

        return true;
        
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        System.out.println("The strings \""+ s1 +"\" and \""+ s2 + " are anagrams : " + isAnagram(s1, s2));
        
        s1 = "cat";
        s2 = "rat";
        
        System.out.println("The strings \""+ s1 +"\" and \""+ s2 + " are anagrams : " + isAnagram(s1, s2));

    }
    
}
