package behavioral.Strategy_Pattern;

import java.util.Arrays;

/**
 * 4、客户端将通过此环境类选择不同的算法完成排序
 */
public class SortTest {
     public static void main(String[] args) {
         int[] arr = new int[]{6, 1, 2, 3, 5, 4};
         //选择不同的策略完成排序
         //Sort sort = new Sort(new BubbleSort());
         //Sort sort = new Sort(new SelectionSort());
         Sort sort = new Sort(new InsertSort());
         sort.sort(arr);
         System.out.println(Arrays.toString(arr));


     }
}
