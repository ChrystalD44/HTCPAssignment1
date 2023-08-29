import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class HTCPA1 {
    public HTCPA1() {

    }

    public void read(String fileName) throws IOException {
		BufferedReader br;
		br = new BufferedReader(new FileReader(fileName));


        while(br.ready()) {
            System.out.print((char) br.read());
        }
        br.close();

    }

    public void write(String outputFileName) throws FileNotFoundException {
        File out = new File(outputFileName);
		PrintWriter pw = new PrintWriter(out);

        pw.print("Hello!");
        pw.close();

    }
		
}