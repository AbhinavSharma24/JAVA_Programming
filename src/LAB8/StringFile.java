package LAB8;

public class StringFile {
    public static void main(String[] args) {
        String st=new String("Abhinav");
        System.out.println(st.charAt(4));
        System.out.println(st.equals("Abhinav"));
        System.out.println(st.toUpperCase());
        System.out.println(st.concat("Sharma"));
        System.out.println(st.contains("a"));
        System.out.println(st.indexOf('s'));
        System.out.println(st.replace('h','H'));
        st=st.toLowerCase();
        System.out.println(st);
        System.out.println(st.length());
    }
}