import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input2);
    
	}


  @Test
  public void testReversed() {
    int[] input1 = {10};
    int[] input2 = {4, 3, 2, 1};
    assertArrayEquals(new int[]{10}, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{1, 2, 3, 4}, ArrayExamples.reversed(input2));
  }

  @Test
  public void averageWithoutLowest() {
    double[] input1 = {8.0, 2.0, 4.0, 2.0};
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input1), 1e-15);
  }
}
