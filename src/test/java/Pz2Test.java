import org.junit.Test;
import static org.junit.Assert.*;

public class Pz2Test {

    @Test
    public void testSumOfMinMaxIndexes() {
        // Тест для масиву з позитивними та негативними числами
        int[] array = {12, -4, 6, 50, 3, -1, 99, -100};
        int result = Pz2.sumOfMinMaxIndexes(array);
        // Мінімальний елемент (-100) знаходиться на індексі 7, максимальний (99) на індексі 6
        assertEquals(7 + 6, result);
    }

    @Test
    public void testSingleElementArray() {
        // Тест для масиву з одним елементом
        int[] array = {42};
        int result = Pz2.sumOfMinMaxIndexes(array);
        // Єдиний елемент на індексі 0, тому сума індексів мінімального і максимального дорівнює 0
        assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray() {
        // Тест для порожнього масиву (очікується виняток)
        int[] emptyArray = {};
        Pz2.sumOfMinMaxIndexes(emptyArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullArray() {
        // Тест для null масиву (очікується виняток)
        int[] nullArray = null;
        Pz2.sumOfMinMaxIndexes(nullArray);
    }
}
