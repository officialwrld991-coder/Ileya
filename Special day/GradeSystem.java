import java.util.Scanner;


public class GradeSystem {

static int[][] totalGrade;

static float [] studentsTotal;

static float [] subjectTotal;


public static int collectStudentsNumber (int students) {

return students;

}

public static int collectSubjects (int subject) {

return subject;

}


public static int [][] storeStudentsAndSubject (int students, int subject) {

totalGrade = new int [students][subject];

return totalGrade;

}

public static int [][] CollectEachStudentsScoreAndSumIt (int students, int subject) {

        Scanner inputCollector = new Scanner(System.in);
            
                int num = 1;
        
        for (int count = 0; count < students; count++) {
                int number = 1;
                float studentsSum = 0;
                int arrayCount = 0;
           for (int index = 0; arrayCount < subject;) {
            
            System.out.print("Enter Score for Subject " + number + ": " );
            totalGrade[count][index] = inputCollector.nextInt(); 
            
            if (totalGrade[count][index] > 0 && totalGrade[count][index] < 101) {
            arrayCount++;
            number++;
            studentsSum += totalGrade[count][index];
            index++;
            continue;
            }
            
            else {
            throw new IllegalArgumentException("Invalid Input");
        }
                                
            
             }
            
            }
            
            return totalGrade;

}


public static float [] getAverageOfEachStudentsSubject (int students, int subject) {

studentsTotal = new float [students];

int studentsTotalCount = 0;

for (int count = 0; count < students; count++) {

float sum = 0;

for (int index = 0; index < subject; index++) {

sum += totalGrade[count][index];

}

studentsTotal[studentsTotalCount] = sum / subject;
studentsTotalCount++;


}

return studentsTotal;

}


public static float [] getAverageOfEachSubject (int students, int subject) {

subjectTotal = new float [subject];

int subjectTotalCount = 0;

for (int count = 0; count < subject; count++) {

float sum = 0;

for (int index = 0; index < students; index++) {

sum += totalGrade[count][index];

}

subjectTotal[subjectTotalCount] = sum / students;
subjectTotalCount++;


}

return subjectTotal;

}

public static float getStudentsWithHighestScore (int students, int subject) {

float largest = studentsTotal[0];

for (int count = 0; count < studentsTotal.length; count++) {

if (studentsTotal[count] > largest) largest = studentsTotal[count]; 

}

return largest;
}


public static float getStudentsWithLowestScore (int students, int subject) {

float smallest = studentsTotal[0];

for (int count = 0; count < studentsTotal.length; count++) {

if (studentsTotal[count] < smallest) smallest = studentsTotal[count]; 

}

return smallest;
}


public static float getSubjectWithHighestScore (int students, int subject) {

float largest = subjectTotal[0];

for (int count = 0; count < studentsTotal.length; count++) {

if (subjectTotal[count] > largest) largest = subjectTotal[count]; 

}

return largest;
}


public static float getSubjectWithLowestScore (int students, int subject) {

float smallest = subjectTotal[0];

for (int count = 0; count < studentsTotal.length; count++) {

if (subjectTotal[count] < smallest) smallest = subjectTotal[count]; 

}

return smallest;
}



















}
