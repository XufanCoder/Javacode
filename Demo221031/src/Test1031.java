/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 小何
 * Date: 2022-10-31
 * Time: 22:46
 */

//方法的使用
public class Test1031 {
    //方法的重载
    public static double sum(int a, double b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, int b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int b = 10;
        double c = 18.2;
        double a = 12.5;

        System.out.println(sum(a, b, c));


    }

    public static int chen(int a, int b) {
        return a * b;
    }

    public static void main3(String[] args) {
        int ret = chen(1, 4);
        System.out.println(ret);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main2(String[] args) {

        int sum = add(1, 2);
        System.out.println(sum);
    }

    /*public static boolean isLeapYear(int year) {
        //int year = 1900;
        if ((0 == year % 4 && 0 != year % 100) || 0 == year % 400) {
            // System.out.println(year + "年是闰年");
            return true;
        } else {
            //System.out.println(year + "年不是闰年");
            return false;
        }
    }*/
    public static boolean isLeapYear(int year) {
        if ((0 == year % 4 && 0 != year % 100) || 0 == year % 400) {
            // System.out.println(year + "年是闰年");
            return true;
        } else {
            //System.out.println(year + "年不是闰年");
            return false;
        }
    }

    public static void main1(String[] args) {
        for (int i = 1000; i < 2000; i++) {
            boolean boo = isLeapYear(i);
            if (boo == true) {
                System.out.println(i + "是闰年！");
            }
        }
    }
}
