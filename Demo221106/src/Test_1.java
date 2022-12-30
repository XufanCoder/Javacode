import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 小何
 * Date: 2022-11-06
 * Time: 10:15
 */
public class Test_1 {
    //判断3个连续奇数
    public static boolean fun3(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 5};
        System.out.println(fun3(arr));
    }

    //多次出现的数字
    public static int fun1(int[] arr) {
        return arr[arr.length / 2];
    }

    public static void main5(String[] args) {
        int[] arr = {1, 2, 3, 1, 1};
        Arrays.sort(arr);
        System.out.println(fun1(arr));
    }

    //只出现一次的数字
    public static int findNum(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            tmp ^= arr[i];
        }
        return tmp;
    }

    public static void main4(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        System.out.println(findNum(arr));
    }

    //
    public static int[] findTarter(int arr[], int tarter) {
        int[] arr1 = {0, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == tarter) {
                    arr1[0] = i;
                    arr1[1] = j;
                    return arr1;
                }
            }
        }
        return arr1;
    }

    public static void main3(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        int[] ret = findTarter(arr, val);
        System.out.println(Arrays.toString(ret));
    }

    //实现二分查找
    public static int reSreach(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (n > arr[mid]) {
                left = mid + 1;
            } else if (n < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main2(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要查找的值：");
        int n = scan.nextInt();
        System.out.println(reSreach(arr, n));
    }

    //排序数组，使得奇数在前，偶数在后
    public static void fun(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 != 0) {
                left++;
            }
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }

    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
}
