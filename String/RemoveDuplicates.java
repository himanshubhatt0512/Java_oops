class RemoveDuplicates {

    private static String removeDuplicates(String s){
        int [] f = new int[26];
        
        for(char c : s.toCharArray()) f[c -'a']++;

        String res = "";
        for(char c : s.toCharArray()){
            if(f[c-'a'] > 0){
                res += c;
                f[c-'a'] = -1;
            }
        }

        return res;
    }
    
    
    public static void main(String[] args) {
        String s1 = "pennsylvania";
        String s2 = "battle";
        System.out.println("After removing duplicate characters from \""+s1 +"\" the string is \""+removeDuplicates(s1) +"\"");
        System.out.println("After removing duplicate characters from \""+s2 +"\" the string is \""+removeDuplicates(s2) +"\"");
    }
}
