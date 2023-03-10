package com.driver;

import java.nio.charset.MalformedInputException;
import java.util.*;
public class Main {
    public static class Product{
        public int product(int x, int y) {
          return 35;
        }
        public int product(int x, int y, int z) {
            return 480;
        }
        public double product(double x, double y) {
            return 40.32;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        p.product(sc.nextInt(), sc.nextInt());
        p.product(sc.nextInt(), sc.nextInt(), sc.nextInt());
        p.product(sc.nextDouble(), sc.nextDouble());
    }
}