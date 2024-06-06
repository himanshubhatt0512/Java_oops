class CountVowels {

    private static int countVowel(String s){
        int n = s.length();
        
        int count=0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'A' ||ch == 'E' || ch == 'I' ||ch == 'O' ||ch == 'U' 
                ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') count++;
        }

        return count;
    }
    
    
    public static void main(String[] args) {
        String s = "arunachal pradesh";
        String s1 = new String("tamilnadu");

        System.out.println("The number of vowles in \""+ s +"\" is : "+ countVowel(s));
        System.out.println("The number of vowles in \""+ s1 +"\" is : "+ countVowel(s1));
        
    }
}
