class CountOccurence {
    
    private static int countOccurence(String str, char ch){
        int n= str.length();
        int count =0;
        for(int i=0; i<n; i++){
            if(str.charAt(i) == ch) count++;
        }

        return count;
    }


    public static void main(String[] args) {
        String s1 = "pennsylvania";
        String s2 = "california";

        System.out.println("The count of character "+ 'n' + " in string \'"+ s1 + "\" is "+ countOccurence(s1, 'n'));
        System.out.println("The count of character "+ 'i' + " in string \'"+ s2 + "\" is "+ countOccurence(s2, 'i'));
    }
}
