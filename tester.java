import java.io.IOException;

public class tester {
    public static void main (String[] args) throws IOException {
        HTCPA1 hi = new HTCPA1();
        
        System.out.print("read: ");
        hi.read("sentence.txt");
        
        System.out.println();
        System.out.print("write: ");
        hi.write("sentenceOut.txt");

    }
}