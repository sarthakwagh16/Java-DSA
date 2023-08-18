package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {

        //create array list
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Float>list2=new ArrayList<>();
        ArrayList<String>list3=new ArrayList<>();

        //add element to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        //add element in between
        list.add(4,50);
        System.out.println(list);
        //access or get element from arrayList by specifying the index of item
        System.out.println(list.get(0));

        //set element at specific index
        list.set(0,60);
        System.out.println(list);

        //remove item from list
        list.remove(2);
        System.out.println(list);

        //sort the list
        Collections.sort(list);
        System.out.println(list);

        //size of arrayList
        System.out.println(list.size());
        //loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println();

    }
}
