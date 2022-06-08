
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class LionTest {

        private final String anySex;
        private final boolean expected;

        public LionTest(String anySex, boolean expected){
            this.anySex = anySex;
            this.expected = expected;
        }

        @Parameterized.Parameters

        public static Object [][] getSex(){
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false},
            };
        }




    }


