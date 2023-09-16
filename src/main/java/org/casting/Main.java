package org.casting;

public class Main {
    public static void main(String[] args) {
        // Implicit casting (automatically):  converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        short x = 1;
        int y = x + 2;
        System.out.println(y); // 3;

        /* EXPLANATION:
         * one of these types should be converted to the other one, as we have in short 2 bytes and in int 4 bytes
         * so any value that we store in a short var can also be stored in int var
         * java create an anonymous var in memory of type int and copy the value of short var
         * then add the two numbers
         */

        double z = 1.1;
        double t = z + 2; //java cast 2 to double ,so it would be 2.0 and add it to z
        System.out.println(t); // 3.1;

        // Explicit casting (manually): converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        double a = 1.1;
        int b = (int)a + 2;// we convert a double var to an int var
        System.out.println(b);
         // with this way we can just cast compatible types
        // There is another way to convert from string to int for ex
        String s = "1";
        int n = Integer.parseInt(s) + 2; // same thing with float or double: Double.parseDouble(string);
        System.out.println(n);

    }
}