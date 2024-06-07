import java.util.HashMap;
import java.util.Map;

class CountFrequency {

    private static void countFrequency(String s){

        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        System.out.println("For given string "+ s);
        for(Map.Entry<Character, Integer> e : hm.entrySet()){
            System.out.println("The frequency of character " + e.getKey() + " is " + e.getValue());
        }        
    }
    
    public static void main(String[] args) {
        String s = "pennsylvania";

        countFrequency(s);
    }
}
