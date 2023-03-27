package chapter15.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<>();
        // 编译不通过
        // flist.add(new Apple());

    }
}
