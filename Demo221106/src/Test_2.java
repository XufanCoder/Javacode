import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 小何
 * Date: 2022-11-06
 * Time: 21:41
 */
public class Test_2 {
    public  static int fun(int[] arr){
        return arr[arr.length/2];
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1};
        Arrays.sort(arr);
        System.out.println(fun(arr));
    }
}
