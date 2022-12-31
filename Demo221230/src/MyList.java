/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Snk
 * Date: 2022-12-30
 * Time: 18:33
 */
public class MyList {
    static class Node {
        public int val;//存储数值
        public Node next;//存储下一个节点的地址

        public Node(int val) {
            this.val = val;
        }
    }

    public Node head;//头结点

    /**
     * 创建一个链表
     */

    public void createLink() {
        Node node1 = new Node(10);
        Node node2 = new Node(30);
        Node node3 = new Node(20);
        Node node4 = new Node(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = node1;

    }

    /**
     * 打印链表里的元素
     */
    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }

    }

    /**
     * 判断链表里是否有key元素
     */
    public boolean contains(int key) {
        Node cur = head;
        while (cur != null) {
            if (key == cur.val) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 计算链表的长度
     */

    public int size() {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    /**
     * 头插法
     */
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    /**
     * 尾插法
     */
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = head;
        if (head == node) {
            head = node;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    /**
     * 任意位置插入
     */
    public void addIndex(int data, int index) throws indexEXCEPTION {
        checkIndex(index);
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        Node node = new Node(data);
        Node cur = findIndexSubone(index);
        node.next = cur.next;
        cur.next = node;

    }

    //判断下标是否合法
    private void checkIndex(int index) {
        if (index < 0 || index > size()) {
            throw new indexEXCEPTION("插入的下标异常");
        }
    }

    //找到index-1的位置,返回当前节点的地址
    private Node findIndexSubone(int index) {
        Node cur = head;
        int count = 0;
        while (count != index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    /**
     * 删除第一次出现的关键字key的节点
     */
    public void remove(int key) {
        if (head.val == key) {
            head = head.next;
            return;
        }
        Node cur = sreachPrev(key);
        Node del = cur.next;
        if (cur == null) {
            return;
        }
        cur.next = del.next;
    }

    //找到key关键字的前一个节点
    private Node sreachPrev(int key) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    /**
     * 删除所以为key的节点
     */
    public void removeAllkey(int key) {
        if (head == null) {
            return;
        }
        Node cur = head.next;
        Node prev = head;

        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(head.val==key){
            head=head.next;
        }
    }

    /**
     * 清空链表
     */
    public void clear() {

    }

}
