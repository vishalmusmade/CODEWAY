package com.codewayIntern.tester;


import java.util.Scanner;

public class GradeCalculator {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       //Input:Total number of subject
       System.out.print(" Total subjects = ");
       int totalSubject=scanner.nextInt();
    // Input: Take marks obtained in each subject
       System.out.println("Enter marks obtained in each subject (out of 100):");
     //initial value assign to 0
       int subjects = 0;
       int totalMarks = 0;
       int i=0;
      //using for loop addition of total marks  
       for( i=0;i<totalSubject;i++){
           System.out.print("Enter marks for subject " + (i + 1)+" = " );                                        
           int marks = scanner.nextInt();
           totalMarks += marks;
           subjects++;
           }
       scanner.close();
       // Calculate Total Marks
       System.out.println("Total Marks: " + totalMarks);

       // Calculate Average Percentage
       if (subjects > 0)//or (i>0) or(totalSubject>0)
       {
           double averagePercentage = (double) totalMarks / totalSubject;//or totalMarks/i;or totalMarks/subjects
          
           System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);

           // Grade Calculation
           char grade = calculateGrade(averagePercentage);
           //To return grade
           System.out.println("Grade: " + grade);
            } 
           else {
           System.out.println("No subjects entered. Cannot calculate average percentage and grade.");
          }
        }
  
   // Grade Calculation method
   private static char calculateGrade(double averagePercentage) {
       if (averagePercentage >= 90) {
           return 'A';
       } 
       else if (averagePercentage >= 80) {
           return 'B';
       } 
       else if (averagePercentage >= 70) {
           return 'C';
       } 
       else if
       (averagePercentage >= 60) {
           return 'D';
       } 
       else {
           return 'F';
       }
   } 
   }

