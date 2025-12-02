package com.driver;

public class Main {
    public static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {

        Product p = new Product();

        // Task 3
        System.out.println(p.product(1, 2));

        // Task 4
        System.out.println(p.product(1, 2, 3));

        // Task 5
        System.out.println(p.product(1.5, 2.5));
    }
}
