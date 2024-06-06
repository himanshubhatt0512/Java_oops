public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Boss!");
        System.out.println(sb.toString());
         
        sb.insert(6, "and Welcome ");
        System.out.println(sb.toString()); 
         
        sb.reverse();
        System.out.println(sb.toString()); 
    }
}
