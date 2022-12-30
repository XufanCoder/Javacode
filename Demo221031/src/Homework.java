import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 小何
 * Date: 2022-11-01
 * Time: 22:22
 */
public class Homework {
    //打印X图形
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int n= scan.nextInt();
            for ( int i = 0; i < n; i++) {
                for ( int j = 0; j < n; j++) {
                    if((i==j)||(i+j==n-1)){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }



    }

    //给定2个数，求2个数的最大公约数
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m= scan.nextInt();
        int n= scan.nextInt();
       int r=m%n;
        while(r!=0){
            m=n;
            n=r;
            r=m%n;
        }
        System.out.println(n);
    }
    //判断一个数二进制中1的个数
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int count=0;
        for (int i = 0; i < 32; i++) {
            if(((n>>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }

    //给定一个数字，判断是否为素数
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 2;
        for (; i < n; i++) {
            if (n % i == 0) {
                break;
            }
        }
        if (n == i) {
            System.out.println(n + "是素数");
        }

    }

    //打印闰年
    public static void main3(String[] args) {
        for (int year = 1000; year <= 2000; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year);
            }
        }
    }

    //打印数字9出现的次数
    public static void main2(String[] args) {
        int i = 1;
        int count = 0;
        for (; i <= 100; i++) {
            if (i % 10 == 9) {
                count++;
            }
            if (i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

    //打印1—100之间的素数
    public static void main1(String[] args) {
        int i = 2;
        int j;
        for (; i < 100; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
        }
    }
}
