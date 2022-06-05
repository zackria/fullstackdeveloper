import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculateTest {

    public static Calculate calculator;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before ALl");
        calculator = new Calculate();
    }

    @Test
    void testAdd() {

        assertTrue(calculator.add(1,1)== 2);
        assertFalse(calculator.add(1,1)== 3);

    }


    @AfterAll
    public static void afterAll(){
        System.out.println("Before ALl");
    }
}
