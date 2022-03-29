package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableCircleTest {

    public static void main(String[] args) {
	// write your code here
        System.out.println("================ Test ComparableCircle =================");
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);
        System.out.println("trước khi sắp xếp");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("sau khi sắp xếp");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        System.out.println("================ Test Comparator =================");

        Circle[] c = new Circle[4];
        c[0]= new Circle();
        c[1]= new Circle(14.3);
        c[2]= new Circle(5);
        c[3]=new Circle(2.4);
        System.out.println("trước khi sắp xếp");
        for (Circle c1: c) {
            System.out.println(c1);
        }

        Comparator comparableCircle = new ComparatorCircle();
        Arrays.sort(c,comparableCircle);
        System.out.println("sau khi sắp xếp");
        for (Circle c1: c) {
            System.out.println(c1);
        }
    }
}
