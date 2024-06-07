class CountLowerUpper {
    
    private static void countLowerUpper(String s){
        int n = s.length();
        int lower =0, upper=0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') lower++;
            else if(ch >='A' && ch <= 'Z') upper++;
        }

        System.out.println("For the given string \""+ s +"\" the count of lowercase character is "+ lower +" and uppercase character " + upper);
    }

    public static void main(String[] args) {
        String s1 ="PennsYlvanIa";
        countLowerUpper(s1);
    }   
}
