class RemoveLoweCase {
    private static String removeLowercase(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        String input = "Hello Sir This is an Example.";
        String result = removeLowercase(input);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }
}
