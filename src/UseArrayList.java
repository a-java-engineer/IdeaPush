import java.util.ArrayList;
import java.util.Comparator;

public class UseArrayList {
    public static void main(String[] args) {
//        定义一个ArrayList对象
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("c++");
        arrayList.add("java");
        arrayList.add("python");
        System.out.println(arrayList);

        //排序
        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);
    }
}
