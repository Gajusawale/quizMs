package multithreadin;

public class Example {
    public static void main(String[] args) {

        Thread t1=new Thread(()->{

            for(int i=0;i<100;i++)
            {
                System.out.println("it"+i);
            }
        });

        t1.start();


        System.out.println(Thread.currentThread());



    }
}
