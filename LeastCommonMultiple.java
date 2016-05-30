import java.util.Arrays;

class LeastCommonMultiple {
  private LeastCommonMultiple() {}

  public static int ofIntegers(int... args) {
    if (includesZero(args)) {
      throw new IllegalArgumentException(
        "LeastCommonMultiple.ofIntegers() expects nonzero integers."
      );
    }

    args = abs(args);

    int max = max(args);
    int d = max;

    while (true) {
      if (isLcm(d, args)) {
        return d;
      }

      d += max;
    }
  }

  private static boolean includesZero(int[] ints) {
    for (int d : ints) {
      if (d == 0) {
        return true;
      }
    }

    return false;
  }

  private static int[] abs(int[] ints) {
    int[] abs = new int[ints.length];

    for (int i = 0; i < ints.length; i += 1) {
      abs[i] = Math.abs(ints[i]);
    }

    return abs;
  }

  private static int max(int[] ints) {
    int max = ints[0];

    for (int i = 1; i < ints.length; i += 1) {
      max = (ints[i] > max) ? ints[i] : max;
    }

    return max;
  }

  private static boolean isLcm(int d, int[] ints) {
    for (int i = 0; i < ints.length; i += 1) {
      if (d % ints[i] != 0) {
        return false;
      }
    }

    return true;
  }
}
