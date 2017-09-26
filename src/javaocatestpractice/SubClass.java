package javaocatestpractice;

class SuperClass {

    SuperClass(int x) {
        System.out.println("Super");
    }
}

public class SubClass extends SuperClass {

    SubClass() {
        // Line 
        super(10);
        System.out.println("Sub 2");
    }

    public static void main(String[] args) {
        SubClass s = new SubClass();
    }
}
