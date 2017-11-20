package ooplap2;

public class TestVariable {
    public static void main (String [] args) {
        // Integer
        int i;
        i = 10;
        System.out.println("i =" + 1);
        int j = 20;
        System.out.println("j " + j);
        System.out.println("i+j=" + (i + j));
        //double
        double v;
        v = 5.5;
        i = (int) v;
        System.out.println("i =" + i);
        // char
        char c = 'x';
        System.out.println("c = "+c);
        c = 'y';
        // string
        System s;
        String s1 = "Hello world";
        System.out.println(s1+"I'm SAM");
        int x = s1.length();
        System.out.println(x);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("Maymassalin"));

        // string to int
        String number = "50";
        int y = Integer.parseInt(number);
        System.out.println(y);
        // Booleam
        boolean b = true;
        System.out.println(b);
        b = false;
        System.out.println(b);
        // shor cut operator\
        int z = 10;
        int t = z++;
        System.out.println(z);
        System.out.println(t);

    } //main
}//class

