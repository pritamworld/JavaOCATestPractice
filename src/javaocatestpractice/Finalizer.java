/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaocatestpractice;

/**
 *
 * @author pritesh.patel
 */
public class Finalizer {

    String s;

    @Override
    protected void finalize() {
        System.out.println("Calling finalize");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
        f.s = new String("Pritesh Patel");
        //f = null;
        String n;
        System.out.println(f);
        System.gc();

        int a = 1_234;
        System.out.println(a);
        double amount = 0xE;
        System.out.println(amount);

        int y = 4;
        double x = 3 + 2 * --y;
        // 3 + 2 * 3 
        // 3 + 6
        //9.0
        System.out.println(x);
        System.out.println("-------------");
        y = 4;
        x = 3 + 2 * --y + y++;
        //3 + 2 * 3 + y++
        //3 + 2 * 3 + 3
        //3 + 6 + 3
        System.out.println(x);
        System.out.println(y);
        System.out.println("-------------");
        y = 4;
        x = 3 + 2 * --y + y++ + y++;
        //3 + 2 * 3 + y++ + y++
        //3 + 2 * 3 + 4 + y++
        //3 + 6 + 3 + 4
        System.out.println(x);
        System.out.println(y);
        System.out.println("-------------");
        y = 4;
        x = y++;
        System.out.println(x);
        System.out.println(y);
        System.out.println("-------------");
        y = 4;
        x = ++y * 5 / y-- + --y;
        //5 * 5 / y-- + --y
        //5 * 5 / y-- + --y
        //5 * 5 / 5 + --y
        //25 / 5 + 3
        //5 + 3
        System.out.println(x);
        System.out.println(y);
        System.out.println("-------------");

        short x1 = 10;
        short y1 = 3;
        short z1 = (short) (x * y); // DOES NOT COMPILE

        System.out.println("-------------");
        int dayOfWeek = 6;
        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        System.out.println("-------------");
        int x3, y3;
        for (y3 = 0, x3 = 4; x3 < 5 && y3 < 10; x3++, y3++) { // DOES NOT COMPILE
            System.out.println(x3 + " ");
        }
        System.out.println("-------------");
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        OUTER_LOOP:
        for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

        System.out.println("-------------");
        byte x0 = 5;
        byte y0 = 10;
        double z0 = x0 + y0;
        System.out.println("-------------");

        /*
        int x = 0;
        while (x++ < 10) {
        }
        String message = x > 10 ? "Greater than" : false;
        System.out.println(message + "," + x);
         */
        long x00 = 10;
        long y00 = 2 * x00;
        System.out.println("-------------");
        x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
        System.out.println("-------------");
        for (int i = 0; i < 10;) {
            i++;
            System.out.println((i) + " - Hello World");
        }
        System.out.println("-------------");
        int i = 0;
        i = i++;
        System.out.println("i1 : " + i);
        i = i++;
        System.out.println("i2 : " + i);
        System.out.println("-------------");
        byte a0 = 40, b = 50;
        byte sum = (byte) ((byte) a0 + b);
        System.out.println(sum);
    }
}
