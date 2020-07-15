package java_collection_framework.bai_tap.quan_li_san_pham;

import java.util.Comparator;

public class SortDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
