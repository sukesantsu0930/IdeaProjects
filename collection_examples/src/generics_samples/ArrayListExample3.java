package generics_samples;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(0, "text1");
        list.add(1, new Integer(10));
        String e1 = (String) list.get(0);
        // 要素番号1には，実際はInteger型のインスタンスが格納されているが，
        // String型にキャストしているため実行時にエラーが発生する
        String e2 = (String) list.get(1);
        // Integer e2 = (Integer) list.get(1);
        System.out.println(e1);
        System.out.println(e2);
    }
}
