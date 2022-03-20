package com.company.task1;


import java.util.Scanner;

class RectangleArea{
    int length,breath;


    public void getData(){
        Scanner s = new Scanner(System.in);
        System.out.println("This program calculates the Area of a Rectangle.");
        System.out.println("Enter the length(and press enter): ");
        length=s.nextInt();
        System.out.println("Enter the breath(and press enter):  ");
        breath=s.nextInt();

    }

    int computeField(){
        return( length*breath);
    }

    void fieldDisplay(){
        System.out.println("The length is :" + length);
        System.out.println("and the breath is:" + breath );
        System.out.println("So..The area of the Rectangle is :" + computeField());
    }


    static void start(){
        RectangleArea a = new RectangleArea();
        a.getData();
        a.computeField();
        a.fieldDisplay();
    }


}

public class Main {

    public static void main(String[] args) {

        RectangleArea.start();
    }
}
