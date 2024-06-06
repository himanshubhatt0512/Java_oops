class ReverseString{

    private static String reverse(String s){
        String res = "";
        for(int i=s.length()-1; i>=0; i--){
            res += s.charAt(i);
        }

        return res;
    }

    public static void main(String[] args) {
        String s= "pennsylvania";

        String s1 = new String("california");

        System.out.println("The reverse of \""+ s + "\" is \""+reverse(s) +"\"");
        System.out.println("The reverse of \""+ s1 + "\" is \""+reverse(s1) +"\"");
    }
}