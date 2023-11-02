// Swap a number

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 10, b = 20;

        System.out.println("<-----Before Swapping---->");
        System.out.println("Value A : " + a + "\n" + "Value B : " + b);
        
        //using Logic 01

        int temp = a;
        a = b;
        b = temp;

        //using Logic 02

        a = a + b;
        b = a - b;
        a = a - b;

        //using Logic 03

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("<-----After Swapping----->");
        System.out.println("Value A : " + a + "\n" + "Value B : " + b);
    }
}