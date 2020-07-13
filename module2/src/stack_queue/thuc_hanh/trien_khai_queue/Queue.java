package stack_queue.thuc_hanh.trien_khai_queue;

public class Queue {

    public class Node {
        private int key;
        private Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public Queue() {
        this.head = null;//đầu
        this.tail = null;//cuối
    }

    // PHƯƠNG THỨC ENQUE ĐỂ THÊM VÀO MỘT PHẦN TỬ Ở CUỐI.
    public Node enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return temp;
        }
        this.tail.next = temp;
        this.tail = temp;
        return temp;
    }

    //PHƯƠNG THỨC DEQUE ĐỂ LẤY RA MỘT PHẦN TỬ Ở ĐẦU
    public Node dequeue() {
        if (this.head == null)//nếu QueueList rỗng
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)//Queue List chỉ có một phần tử và đã lấy một phần tử nên Queue rỗng.
            this.tail = null;
        return temp;//trả về phần tử lấy ra.
    }

    @Override
    public String toString() {
        return "Queue{" +
                "head=" + this.head.key +
                ", tail=" + this.tail.key +
                '}';
    }

    public void dispalay(){
        Node temp = this.head;
      do{
          System.out.println(temp.key);
            temp = temp.next;
        } while (!(temp == null));
        //System.out.println(this.tail.key);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.enqueue(10).key);
        System.out.println( queue.enqueue(20).key);
        System.out.println( queue.enqueue(30).key);
        System.out.println("Deque element in the list is: " +queue.dequeue().key);
        System.out.println(queue.enqueue(40).key);
        System.out.println(queue.enqueue(50).key);
        System.out.println(queue.enqueue(60).key);
        System.out.println("Deque element in the list is: " + queue.dequeue().key);
        System.out.println(queue.toString());
        queue.dispalay();
    }
}
