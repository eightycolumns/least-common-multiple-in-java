import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void thereIsNoLeastCommonMultipleOfAnEmptySet() {
    thrown.expect(IllegalArgumentException.class);
    LeastCommonMultiple.ofIntegers();
  }

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
  public void theLeastCommonMultipleOf2And2Is2() {
    assertEquals(2, LeastCommonMultiple.ofIntegers(2, 2));
  }

  @Test
  public void theLeastCommonMultipleOf2And4Is4() {
    assertEquals(4, LeastCommonMultiple.ofIntegers(2, 4));
  }

  @Test
  public void theLeastCommonMultipleOf2And3Is6() {
    assertEquals(6, LeastCommonMultiple.ofIntegers(2, 3));
  }

  @Test
  public void theLeastCommonMultipleOfPositive2AndNegative3Is6() {
    assertEquals(6, LeastCommonMultiple.ofIntegers(2, -3));
  }

  @Test
  public void theLeastCommonMultipleOfNegative2AndPositive3Is6() {
    assertEquals(6, LeastCommonMultiple.ofIntegers(-2, 3));
  }

  @Test
  public void theLeastCommonMultipleOfNegative2AndNegative3Is6() {
    assertEquals(6, LeastCommonMultiple.ofIntegers(-2, -3));
  }

  @Test
  public void theLeastCommonMultipleOf2And5Is10() {
    assertEquals(10, LeastCommonMultiple.ofIntegers(2, 5));
  }

  @Test
  public void theLeastCommonMultipleOf3And5Is15() {
    assertEquals(15, LeastCommonMultiple.ofIntegers(3, 5));
  }

  @Test
  public void theLeastCommonMultipleOf2And3And5Is30() {
    assertEquals(30, LeastCommonMultiple.ofIntegers(2, 3, 5));
  }

  @Test
  public void theLeastCommonMultipleOf2And3And5And7And11Is2310() {
    assertEquals(2310, LeastCommonMultiple.ofIntegers(2, 3, 5, 7, 11));
  }
}
