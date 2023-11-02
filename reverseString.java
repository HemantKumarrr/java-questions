public class reverseString {

    public static void main(String[] args) {
        String str = "Hello World";
        String rev = "";

        System.out.println("Before Reverse String : " + str);
        // Logic 01

        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        // Logic 02

        char a[] = str.toCharArray();
        for(int i = str.length() - 1; i>=0; i--) {
            rev += a[i];
        }

        System.out.println("Reverse String : " + rev);
    }
}