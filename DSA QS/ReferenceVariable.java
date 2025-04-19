import java.lang.*;

class ReferenceVariable {

    public static void main(String[] args) {

        ref r = new ref();

        r.i = 5;
        System.out.println(" before value of X: " + r.i);
        // System.out.println(r.i);
        r.update(r);
        System.out.println("After value of X: " + r.i);

        System.out.println(" value of X: " + r.i);

        ref r2 = new ref();
        r2.i= 10;
        System.out.println(" before value of X: " + r2.i);
        r2.update(r2);
        System.out.println("After value of X: " + r2.i);
    }
}

class ref {

    int i;

    public void update(ref r1) {
        
        r1.i = 6;
    }

}