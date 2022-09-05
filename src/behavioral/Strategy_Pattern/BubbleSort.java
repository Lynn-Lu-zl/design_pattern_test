package behavioral.Strategy_Pattern;

/**
 * 2、冒泡排序，实现排序接口
 */
public class BubbleSort implements ISort{
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                // 如果左边的数大于右边的数，则交换，保证右边的数字最大
                if (arr[j] > arr[ j + 1 ])
                {
                    arr[ j + 1 ] = arr[ j + 1 ] + arr [ j ];

                    arr[ j ] = arr[ j + 1 ] - arr[ j ];

                    arr[ j + 1 ] = arr[ j + 1 ] - arr[ j ];
                }
            }

        }
    }
}
