import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {
  @Test
  public void theLeastCommonMultipleOf2And3Is6() {
    assertEquals(LeastCommonMultiple.ofIntegers(2, 3), 6);
  }
}
