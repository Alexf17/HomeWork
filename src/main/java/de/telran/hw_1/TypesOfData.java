package de.telran.hw_1;

public class TypesOfData {
    public static void main(String[] args) {

        // Part 1
        char let1 = 'G';
        int let2 = 89;
        byte let3 = 8;
        short let4 = 56;
        float let5 = 4.7333436f;
        double let6 = 4.355453532;
        long let7 = 12121;

        System.out.println("char:" + let1);
        System.out.println("int" + let2);
        System.out.println("byte:" + let3);
        System.out.println("short:" + let4);
        System.out.println("float:" + let5);
        System.out.println("double:" + let6);
        System.out.println("long:" + let7);

        //Part 2

        int let8 = 345;
        int result1 = let8 / 100;
        int result2 = let8 / 10 % 10;
        int result3 = let8 % 10;

        System.out.print("Число " + let8 + "->" + result1 + "+");
        System.out.print(result2 + "+");
        System.out.print(result3);

        //OR
//        System.out.print("Число " + let8 + "->" + result1 + "+"+result2 + "+"+result3);


    }
}


