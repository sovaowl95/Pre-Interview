public class Solution {
  /**
   * Дан массив чисел. Найдите 2 числа, сумма которых равна target.
   * Верните индексы этих чисел
   * <p>
   * Пример:
   * nums = new int{2, 7, 11, 15};
   * target = 9
   * result = {0, 1}
   * <p>
   * nums = new int{3,2,4};
   * target = 6
   * result = {1, 2}
   * <p>
   * nums = new int{3,3};
   * target = 6
   * result = {0, 1}
   *
   * @param nums   массив с числами
   * @param target то, чему должна быть равна сумма двух чисел
   * @return массив из двух индексов
   */
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}

		return new int[0];
	}


  /**
   * На вход даны два числа. Длина и Ширина будущего массива.
   * Заполните массив по спирали начиная с координат[0][0]
   * Пример:
   * length = 3, width = 3
   * Результат:
   * 1 2 3
   * 8 9 4
   * 7 6 5
   *
   * @param length длина получившегося массива
   * @param width ширина получившегося массива
   * @return заполненный массив
   */
  public int[][] fill(int length, int width) {
    int[][] result = new int[length][width];

    int right = width-1;
    int down = length-1;
    int up = 0;
    int left = 0;
    int i = 0;
    int j = 0;
    int inc_i = 1;
    int inc_j = 0;

    for(int k = 0; k<length*width; k++) {
    	result[j][i] = k+1;
		if (i == left && j == up && inc_i != 1 && inc_j == -1) {
			inc_i = 1;
			inc_j = 0;
			left++;
		} else if (i == right && j == up && inc_j != 1 && inc_i == 1) {
			inc_i = 0;
			inc_j = 1;
			up++;
		} else if (i == right && j == down && inc_i != -1 && inc_j == 1) {
			inc_i = -1;
			inc_j = 0;
			right--;
		} else if (i == left && j == down && inc_j != -1 && inc_i == -1) {
			inc_i = 0;
			inc_j = -1;
			down--;
		}
    	i += inc_i;
    	j += inc_j;
    }

    return result;
  }
}
