import java.util.Arrays;

class LeastCommonMultiple {
  private LeastCommonMultiple() {}

  public static int ofIntegers(int... args) {
    args = abs(args);

    int max = max(args);
    int d = max;

    while (true) {
      for (int arg : args) {
        if (d % arg != 0) {
          d += max;
          continue;
        }
      }

      return d;
    }
  }

  private static int[] abs(int[] ints) {
    int[] abs = new int[ints.length];

    for (int i = 0; i < ints.length; i += 1) {
      abs[i] = Math.abs(ints[i]);
    }

    return abs;
  }

  private static int max(int[] ints) {
    int max = 0;

    for (int d : ints) {
      max = (d > max) ? d : max;
    }

    return max;
  }
}
