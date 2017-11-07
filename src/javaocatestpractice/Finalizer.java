/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaocatestpractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

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
        String n = null;
        System.out.println(f);
        Object[] aa = {new Finalizer(), new Finalizer()};
        System.out.println(new Object());
        System.out.println(aa);
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
        System.out.println("-------------");
        String tag = Finalizer.class.getName() + '@' + Integer.toHexString(Finalizer.class.hashCode());
        System.out.println(tag);

        System.out.println("-------------");
        ArrayList list = new ArrayList();
        list.add("hawk"); // [hawk]
        list.add("hawk"); // [hawk]
        list.add(Boolean.TRUE); // [hawk, true]
        list.add(100);
        list.add(false);
        list.add(new Date());
        System.out.println(list);
        list.remove("hawk");
        System.out.println(list);

        System.out.println("-------------");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);
        System.out.println("-------------");
        Period period = Period.ofMonths(1); // create a period
        performAnimalEnrichment(start, end, period);
        System.out.println("-------------");
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20
        System.out.println("-------------");
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date
                .format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("-------------");
        LocalDate d1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime t1 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime1 = LocalDateTime.of(d1, t1);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime1.format(fmt)); // January 20, 2020, 11:12

        System.out.println("------ Excellent Knowledge about Static Members -------");
        SampleStatic s = new SampleStatic();
        System.out.println(s.getName());
        s = null;
        s.NAME = "Pritesh";
        System.out.println(SampleStatic.getName());

        s = new SampleStatic();
        s.getDouble();
        int $ = 100;
        System.out.println($);
        
        //try...finally without catch
        try{
            convertStringToDoubleArray();
           // System.exit(0);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException aioe){
                  System.out.println(aioe.toString());
                }
        finally{
            System.out.println("Finally");
        }

        System.out.println("Successfully end of Program");
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }

    private static void convertStringToDoubleArray() {
        String dataa = "0.121 0.547 0.875 0.245";
        String delimiter = " ";

        String spectrainstring[] = dataa.split(delimiter);

        int size = spectrainstring.length;

        double[] spectraldata = new double[size];

        for (int i = 0; i < size; i++) {
            spectraldata[i] = Double.parseDouble(spectrainstring[i].toString());
            System.out.println(spectraldata[i]);
        }
    }
}
