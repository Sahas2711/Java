import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // array arraylist
        // primitive data types objects of various classes
        // int ,double,String Integer,Double,String
        // number of elements should be pre defined Not defined

        // Declration of arraylist

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        // To add an element
        list.add(10);
        System.out.println(list);

        list.add(1, 25);
        System.out.println(list);

        list.add(2, 28);
        System.out.println(list);
        // To replace an element
        list.set(0, 25);
        System.out.println(list);

        // To get an element
        System.out.println(list.get(0));

        // size
        System.out.println(list.size());
        // to remove an element
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
    }
}
