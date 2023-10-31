package org.example;

public class StaticLocalEx {
    static int i = 10;
    public static void main(String[] args) {
        //StaticLocalEx slx = new StaticLocalEx();
        System.out.println(decrement());
    }

      static int decrement() {

        return i;
    }
}



