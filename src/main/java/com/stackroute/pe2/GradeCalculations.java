package com.stackroute.pe2;

import java.util.Scanner;

public class GradeCalculations {
    public static void main(String[] args) {
        int[] grades;
        int students;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter number of students(between 0-100): ");
            students = input.nextInt();
        }while (students < 0 || students >100);
        grades = new int[students];
        for (int i = 0; i < students; i++){
            System.out.print("Enter grades for student "+(i+1)+": ");
            grades[i] = input.nextInt();
            System.out.println();
        }
        GradeCalculations gradeCalculations = new GradeCalculations();
        System.out.println("The average is: "+gradeCalculations.average(grades));
        System.out.println("The minimum is: "+gradeCalculations.minimum(grades));
        System.out.println("The maximum is: "+gradeCalculations.maximum(grades));
    }
    public double average(int[] grades){
        if (grades.length == 0)
            return 0.0;
        int sum = 0;
        for (int i :
                grades) {
            sum += i;
        }
        return sum*1.0/grades.length;
    }
    public int minimum(int[] grades){
        if (grades.length == 0)
            return 0;
        int min = grades[0];
        for (int i :
                grades) {
            if (i < min){
                min = i;
            }
        }
        return min;

    }
    public int maximum(int[] grades){
        if (grades.length == 0)
            return 0;
        int max = 0;
        for (int i :
                grades) {
            if (i > max){
                max = i;
            }
        }
        return max;

    }
}
