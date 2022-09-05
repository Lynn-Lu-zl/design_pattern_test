package behavioral.Strategy_Pattern;

/**
 * 3、创建一个环境类，将每种算法都作为一种策略封装起来，
 * 客户端将通过此环境类选择不同的算法完成排序
 *
 * 保存了一个 ISort 接口的实现对象，
 * 在构造方法中，将其初始值传递进来，
 * 排序时调用此对象的 sort 方法即可完成排序
 */
public class Sort implements ISort{

    private ISort sort;

    //将对象传入的参数传递给定义的属性sort
    public Sort(ISort sort) {
        this.sort = sort;
    }




    @Override
    public void sort(int[] arr) {
        //排序时调用此对象的 sort 方法即可完成排序
        sort.sort(arr);
    }

    // 用来选择不同的排序策略的，客户端通过此方法设置不同的策略
    public void setSort(ISort sort){
        this.sort = sort;
    }
}
