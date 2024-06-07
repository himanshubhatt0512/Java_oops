import java.util.HashMap;
import java.util.Map;

class FirstNonRepeatedChar {
    
    private static Character firstNonRepeatedChar(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        System.out.println("For given string "+ s);
        for(Map.Entry<Character, Integer> e : hm.entrySet()){
            if(e.getValue() == 1) return e.getKey();
        }   
        
        return null;
    }

    public static void main(String[] args) {
        String input = "pennsylvania";
        Character result = firstNonRepeatedChar(input);
        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
