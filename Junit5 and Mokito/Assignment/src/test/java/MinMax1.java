import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MinMax1{
	private static final Short min = null;
	private static final Short max = null;
	MinMax1 expected;
	MinMax1 actual;
   

	@BeforeEach
    public void init(){
        expected = new MinMax1();
        actual = new MinMax1();
        actual = actual.MinMax1(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53});

    }

    private MinMax1 MinMax1(int[] is) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test()
    @Order(1)
    public void testMinFinder1(){
        Assertions.assertEquals(expected.min,actual.min);
    }

    @Test
    @Order(2)
    public void testMaxFinder1(){
        Assertions.assertEquals(expected.max,actual.max);
    }

    @AfterEach
    public void Clean(){
        actual = expected = null;
    }
}
