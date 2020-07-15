package java_collection_framework.bai_tap.quan_li_san_pham.array_list;

import java.util.Comparator;

public class SortDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
