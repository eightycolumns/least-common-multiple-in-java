import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {
  @Test
  public void theLeastCommonMultipleOf2And3Is6() {
    assertEquals(6, LeastCommonMultiple.ofIntegers(2, 3));
  }

  @Test
  public void theLeastCommonMultipleOf2And3And5Is30() {
    assertEquals(30, LeastCommonMultiple.ofIntegers(2, 3, 5));
  }

  @Test
  public void theLeastCommonMultipleOfPositive7AndNegative11Is77() {
    assertEquals(77, LeastCommonMultiple.ofIntegers(7, -11));
  }

  @Test
  public void theLeastCommonMultipleOfNegative7AndPositive11Is77() {
    assertEquals(77, LeastCommonMultiple.ofIntegers(-7, 11));
  }
}
