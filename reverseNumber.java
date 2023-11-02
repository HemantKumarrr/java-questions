//Reverse a Number;

public class reverseNumber {

    public static void main(String[] args) {
        int userNum = 12345;
        int rev = 0;

        //Logic 1

        while(userNum != 0)
        {
            rev = rev*10 + userNum % 10;
            userNum /= 10;
        }

        System.out.println("Reverse Number : " + rev);
    }
}