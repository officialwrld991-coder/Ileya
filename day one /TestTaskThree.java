        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

        public class TestTaskThree {

    @Test
    
        public void testThatZerosAreCollectedAndMovedToTheEnd() {
        
        int[] number   = { 5, 0, 3, 0, 2, 0};
        
        int[] actual   = TaskThree.collectZero(number);
        
        int[] expected = { 5, 3, 2, 0, 0, 0 };
        
        assertArrayEquals(expected, actual);
        
        
    }
}
