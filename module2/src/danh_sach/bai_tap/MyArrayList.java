package danh_sach.bai_tap;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    // khởi tạo mảng có độ dài nhập vào theo ý người dùng
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity :" + capacity);
        }
    }

    //Khởi tạo mảng có độ dài mặc định là Default_capacity = 10
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Trả về chiều dài của mảng
    public int size() {
        return this.size;
    }

    // xóa toàn bộ phần tử trong mảng
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    // thêm  1 phầm tử vào mảng cuối mảng.
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    // Tăng phần tử của mảng nếu mảng vượt quá số lượng phần tử
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity : " + minCapacity);
        }
    }

    // thêm một phần tử vào một vị trí nhất định
    public void add(E element, int index) {
        if (index >= elements.length) {
            throw new IllegalArgumentException("index " + index);
        } else if (index == elements.length) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    // lấy một phần tử element tại vị trí thứ index;
    public E get(int index) {
        return (E) elements[index];
    }

    // kiểm tra xem phần tử có trong mảng không nếu có trả về vị trí của phần tử nếu không trả về -1;
    public int IndexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // phương thức contains kiểm tra xem phần tử có tồn tại trong mảng không
    public boolean contains(E element) {
        return this.IndexOf(element) >= 0;
    }

    //tạo ra 1 bản sao của phương thức hiện tại
    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    //xóa một phần tử tại vị trí index
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Error index :" + index);
        } else {
            E element = (E) elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
            return element;
        }
    }
}

