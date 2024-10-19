public class palindrome {
    public static void main(String[] args) {
        String st="racecar";
        String st1="";
        for (int i = 0; i < st.length(); i++) {
            st1= st1+ st.charAt(i);
        }
        // System.out.println(st1);
        if (st.equals(st1)) {
            System.out.println("palindrome");
        }
    }
}