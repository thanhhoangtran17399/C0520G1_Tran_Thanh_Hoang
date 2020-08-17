package java_collection_framework.thuc_hanh.self_test_tree;
public class RecursionTest {
    public static void print100(int i) {
        System.out.println(i);

        if (i == 100)
            return;

        print100(++i);
    }

    public static void main(String[] args) {
        print100(1);
    }
}
