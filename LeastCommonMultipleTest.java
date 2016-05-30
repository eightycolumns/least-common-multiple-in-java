import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void thereIsNoLeastCommonMultipleOf1() {
    thrown.expect(IllegalArgumentException.class);
    LeastCommonMultiple.ofIntegers(1);
  }

  @Test
  public void thereIsNoLeastCommonMultipleOf0And1() {
    thrown.expect(IllegalArgumentException.class);
    LeastCommonMultiple.ofIntegers(0, 1);
  }

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

  @Test
  public void theLeastCommonMultipleOf10And10Is10() {
    assertEquals(10, LeastCommonMultiple.ofIntegers(10, 10));
  }

  @Test
  public void theLeastCommonMultipleOf10And100Is100() {
    assertEquals(100, LeastCommonMultiple.ofIntegers(10, 100));
  }
}
