package org.example;

public class Main {
    public static void main(String[] args)  {
        try {

        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

