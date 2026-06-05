        import java.util.Scanner;
        
        public class MusaCourseGrader {

        public static void main (String [] args) {
        
        
        Scanner inputCollector = new Scanner(System.in);
        
        
        System.out.print("Enter number of students: ");
        int studentsCount = inputCollector.nextInt ();
        
        System.out.print("Enter number of quizzes: ");
        int quizzes = inputCollector.nextInt ();
        
                                
        int [][] grade = new int [studentsCount][quizzes];
        
        
        float [] StudentsAverage = new float [studentsCount];
        
        int StudentsAverageCount = 0;
            
                int num = 1;
        
        for (int count = 0; count < studentsCount; count++) {
                int number = 1;
                float studentsSum = 0;
                System.out.println("\t STUDENT " + num);
           for (int index = 0; index < quizzes; index++) {
            
            System.out.print("Enter Score for quiz " + number + ": " );
            grade[count][index] = inputCollector.nextInt();            
              number++;  
              
              studentsSum += grade[count][index];
            
             }
             
             StudentsAverage[StudentsAverageCount] = studentsSum / quizzes;
             StudentsAverageCount++;
             
                num++; 
              System.out.println();
              
            }
        
        float [] gradeAverage = new float [quizzes];
        
        int gradeAverageCount = 0;
        
        for (int count = 0; count < quizzes; count++) {
                float quizSum = 0;
        for (int index = 0; index < studentsCount; index++) {
        
            quizSum += grade[index][count];
            
            }
            
            gradeAverage[gradeAverageCount] = quizSum / studentsCount;
            
            gradeAverageCount++;
                        
            }
            
            
            int printStudentsAverage = 1;
            for (int count = 0; count < StudentsAverage.length; count++) {
            
            System.out.println("The Average of Student " + printStudentsAverage + " = " + StudentsAverage[count]);
            printStudentsAverage++;
            }
            
            System.out.println();

            
            int printAverageCount = 1;
            float largest = gradeAverage[0];
            for (int index = 0; index < gradeAverage.length; index++) {
                        
            System.out.println("The Average of Quizz " + printAverageCount + " = " + gradeAverage[index]);
            printAverageCount++;
            
            if (gradeAverage[index] > largest) largest = gradeAverage[index];
            
            }
            
            System.out.println();
            System.out.println("The Quiz with the Highest Average is " + largest);
            
            
            
        
        }
        
        }
        
        
        
        
        


