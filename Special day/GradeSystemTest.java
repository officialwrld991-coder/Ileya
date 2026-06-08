		import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;
        
       public class GradeSystemTest {
       
      static int students = 4;
      
      static int subject = 2;
      
      static int [][] grade;

        @Test

        public void testThatTheMethodTakesNumberOfStudentsEnrolled (){
        
        int expectedStudents = students;
        
        int actualStudents = GradeSystem.collectStudentsNumber(students);
        
        assertEquals(actualStudents, expectedStudents);
        
        }
        
        @Test
        
         public void testThatTheMethodTakesNumberOfSubjectDone (){
        
        int expectedSubjects = subject;
        
        int actualSubjects = GradeSystem.collectSubjects(subject);
        
        assertEquals(expectedSubjects, actualSubjects);
        
        }
        
         @Test
        
         public void testThatTheMethodTakesBothStudentsCountAndNumberOfSubjectDoneAndSavesThem (){
        
        grade = new int [4][2];
        
        int [][] actualSubjects = GradeSystem.storeStudentsAndSubject(students, subject);
        
        assertArrayEquals(grade, actualSubjects);
        
        }
        
    
        
        }

