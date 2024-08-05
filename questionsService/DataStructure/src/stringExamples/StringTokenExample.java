package stringExamples;

public class StringTokenExample {

    public static void main(String[] args) {

        String s="this is good boy, is'nt";
        s=s.replaceAll("[^a-z A-Z]", " ");
        s=s.replaceAll("\\s+", " ");
        s=s.trim();

        System.out.println(s);

        String [] sArr=s.split(" ");

        if(!s.isEmpty())
        {
            System.out.println(s.length());

            for(String i:sArr)
            {
                System.out.println(i);
            }
        }
        else{
            System.out.println(0);
        }
    }
}
