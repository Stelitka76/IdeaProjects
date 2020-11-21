package com.lectures.lectures.lecture01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanObject = new Scanner(System.in);

        String name = scanObject.nextLine();
        int age = scanObject.nextInt();
                double salary = scanObject.nextDouble();

       printEmployeeData("Kiril",69, 1600);

           }

    private static void printEmployeeData(String name, int age, double salary) {
        if (age > 65){
            System.out.println("Employee is ready to retire. Age is: " + age);
    } else {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }
}
