/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Snk
 * Date: 2022-12-30
 * Time: 11:55
 */
public class Test_1 {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.createLink();
        //myList.display();
        System.out.println(myList.contains(30));
        System.out.println(myList.size());
        System.out.println();
        System.out.println("------------");
        myList.addFirst(11);
        myList.addFirst(22);
        myList.addFirst(33);
        myList.display();
        System.out.println();
        myList.addLast(33);
        myList.addLast(44);
        myList.display();
        System.out.println();
        System.out.println("------------");
        myList.addIndex(66,3);
        myList.display();
        System.out.println();
        System.out.println("------------");
        myList.remove(22);
        myList.display();
        System.out.println();
        System.out.println("------------");
        myList.removeAllkey(33);
        myList.display();
    }
}
