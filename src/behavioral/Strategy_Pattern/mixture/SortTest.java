package behavioral.Strategy_Pattern.mixture;

import java.util.Arrays;

public class SortTest {
     public static void main(String[] args) {
         int[] arr = new int[]{6, 1, 2, 3, 5, 4};

         Sort sort = new Sort(SortStrategy.BUBBLE_SORT);
         // 可以通过选择不同的策略完成排序
         // sort.setStrategy(SortStrategy.SELECTION_SORT);
         // sort.setStrategy(SortStrategy.INSERT_SORT);
         sort.sort(arr);
         // 输出 [1, 2, 3, 4, 5, 6]
         System.out.println(Arrays.toString(arr));
         }
}
