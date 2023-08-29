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

        pw.print("Hello! If you saw this line, that means your code is working.");
        pw.close();

    }

    public int countCharacters(String inputFile) throws IOException
    {
        File inFile = new File(inputFile);
        int charCount = 0;
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        while (br.ready())
        {
            br.read();
            charCount++;
        }
        br.close();
        return charCount;
    }
		
}