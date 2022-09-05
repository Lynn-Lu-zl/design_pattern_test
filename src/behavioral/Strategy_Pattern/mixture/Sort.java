package behavioral.Strategy_Pattern.mixture;

import behavioral.Strategy_Pattern.BubbleSort;
import behavioral.Strategy_Pattern.ISort;
import behavioral.Strategy_Pattern.InsertSort;
import behavioral.Strategy_Pattern.SelectionSort;

public class Sort implements ISort {
    private ISort sort;


    @Override
    public void sort(int[] arr) {

        sort.sort(arr);
    }

    Sort(SortStrategy strategy) {
        setStrategy(strategy);
    }


    // 客户端通过此方法设置不同的策略
    public void setStrategy(SortStrategy strategy) {
        switch (strategy) {
            case BUBBLE_SORT:
                sort = new BubbleSort();
                break;
            case SELECTION_SORT:
                sort = new SelectionSort();
                break;
            case INSERT_SORT:
                sort = new InsertSort();
                break;
            default:
                throw new IllegalArgumentException("没有这样的排序策略");
        }
    }

}
