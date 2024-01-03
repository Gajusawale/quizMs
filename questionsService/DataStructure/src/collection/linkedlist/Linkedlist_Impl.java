package collection.linkedlist;

public class Linkedlist_Impl {


    Node head;
    public void add(int data)
    {
       Node node=new Node();
       node.data=data;
       node.next=null;
       if(head==null) {
           head = node;
       }
       else {
           Node n=head;
           while(n.next!=null)
           {
               n=n.next;
           }
           n.next=node;
       }


    }

    public void show()
    {
        Node node=head;

        while(node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }

    public void addAtStart(int data)
    {
        Node node =new Node();
        node.data=data;
//        node.next=null;
        node.next=head.next;
        head=node;


    }


    public void addAt(int index,int data)
    {

    }



}
