import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class Producer_Consumer {


    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();

        int size=0;
        Thread producer=new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("hi");
                int count=0;
                while (true)
                {

                }
            }
        });

        Thread consumer=new Thread(new Runnable()
        {
            @Override
            public void run() {
                System.out.println("hellow everyone");
            }
        });
                consumer.start();



        producer.start();

    }



}
