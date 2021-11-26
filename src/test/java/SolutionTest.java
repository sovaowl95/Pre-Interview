import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  Solution solution;

  @BeforeEach
  void init() {
    solution = new Solution();
  }

  @org.junit.jupiter.api.Test
  void twoSum1() {
    final int[] ints = new int[] {2, 7, 11, 15};
    final int target = 9;
    final int[] result = solution.twoSum(ints, target);

    assertArrayEquals(new int[] {0, 1}, result);
  }


  @org.junit.jupiter.api.Test
  void twoSum2() {
    final int[] ints = new int[] {3, 2, 4};
    final int target = 6;
    final int[] result = solution.twoSum(ints, target);

    assertArrayEquals(new int[] {1, 2}, result);
  }

  @org.junit.jupiter.api.Test
  void twoSum3() {
    final int[] ints = new int[] {3, 3};
    final int target = 6;
    final int[] result = solution.twoSum(ints, target);

    assertArrayEquals(new int[] {0, 1}, result);
  }


  @org.junit.jupiter.api.Test
  void fill1() {
    final int[][] expect = new int[][] {
        {1, 2, 3},
        {8, 9, 4},
        {7, 6, 5}
    };
    final int[][] result = solution.fill(3, 3);
    assertArrayEquals(expect, result);
  }
}