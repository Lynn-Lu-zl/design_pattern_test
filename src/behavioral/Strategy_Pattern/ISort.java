package behavioral.Strategy_Pattern;

/**
 * 1、定义排序算法接口
 * 传入一个整型数组进行排序，所有的排序算法都实现此接口
 */
public interface ISort {
    //传入一个整型数组进行排序，所有的排序算法都实现此接口
    void sort(int[] arr);
}
