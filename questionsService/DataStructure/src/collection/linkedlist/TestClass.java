package collection.linkedlist;

public class TestClass {

    public static void main(String[] args) {
        Linkedlist_Impl list=new Linkedlist_Impl();

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(25);

        list.addAtStart(45);
        list.show();
    }
}
