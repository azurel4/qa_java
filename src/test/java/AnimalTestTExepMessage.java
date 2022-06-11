import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;



public class AnimalTestTExepMessage {

    @Test
    public void testGetFoodException(){
        Animal animal = new Animal();
        try {
            animal.getFood("gbgjhbjh");
        }catch (Exception thrown){
            String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
            String actual = thrown.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void testGetFamilyAnimal(){
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        Assert.assertEquals(expected, actual);
    }

}
