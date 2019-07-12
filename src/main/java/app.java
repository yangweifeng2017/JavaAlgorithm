import com.ywf.sort.Sort;

/**
 * ClassName app
 * 功能: TODO
 * 运行方式与参数: TODO
 * Author yangweifeng
 * Date 2019-07-12 15:07
 * Version 1.0
 **/
public class app {
    public static void main(String[] args) {
        int array[] = {2,8,9,6,5,7,3,1};
        Sort.quickSort(array,0,array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
