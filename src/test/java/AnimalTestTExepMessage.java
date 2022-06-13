import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AnimalTestTExepMessage {

    @Test
    public void testGetFoodException() {
        Animal animal = new Animal();
        try {
            animal.getFood("прапопрр");
        } catch (Exception thrown) {
            String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
            String actual = thrown.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void testGetFamilyAnimal() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }
}
