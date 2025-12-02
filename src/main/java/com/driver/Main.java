package com.driver;

public class Main {
    public static class product{
        public int p(int x, int y) {
            return x * y;
        }
        public int p(int x, int y, int z) {
            return x * y * z;
        }
        public double p(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        product p = new product();
        System.out.println(p.p(4,5));
        System.out.println(p.p(7,7,4));
        System.out.println(p.p(4.6,7.5));
    }
}
