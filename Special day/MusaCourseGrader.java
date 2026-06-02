        import java.util.Scanner;
        
        public class MusaCourseGrader {

        public static void main (String [] args) {
        
        
        Scanner inputCollector = new Scanner(System.in);
        
        
        System.out.print("Enter number of students: ");
        int studentsCount = inputCollector.nextInt ();
        
        System.out.print("Enter number of quizzes: ");
        int quizzes = inputCollector.nextInt ();
        
        
                        
        int [][] grade = new int [studentsCount][quizzes];
            
                int num = 1;
        
        for (int count = 0; count < studentsCount; count++) {
                int number = 1;
                
                System.out.println("\t STUDENT " + num);
           for (int index = 0; index < quizzes; index++) {
            
            System.out.print("Enter Score for quiz " + number + ": " );
            grade[count][index] = inputCollector.nextInt();            
              number++;  
            
             }
                num++; 
              System.out.println();
              
              
        
        }
        
        float [] average = new float [quizzes];
        
        int averageCount = 0;
        
        for (int count = 0; count < quizzes; count++) {
                float sum = 0;
        for (int index = 0; index < studentsCount; index++) {
        
            sum += grade[index][count];
            
            }
            
            average[averageCount] = sum / studentsCount;
            
            averageCount++;
            
            
            }
            int printCount = 1;
            for (int index = 0; index < average.length; index++) {
                        
            System.out.println("The Average of Quizz " + printCount + " = " + average[index]);
            printCount++;
            
            }
            
            
        
        
        
        
        }
        
        }
        
        
        
        
        


