package javaocatestpractice;

import java.util.ArrayList;
import java.util.List;

public class JavaSETest {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        elements.add(100);
        int firstElmnt = elements.get(1);
        System.out.println(firstElmnt);

        // Line n1
        int cardVal = 14;
        //int cardVal = 18;
        switch (cardVal) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("Hit");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Double");
                break;
            case 15:
            case 16:
                System.out.println("Surrender");
                break;
            default:
                System.out.println("Stand");
        }
    }
}
