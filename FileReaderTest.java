
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderTest {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            // FileReader fr1 = new FileReader("D:\\files\\Friday (1995) [1080p] [BluRay]
            // [5.1] [YTS.MX]\\Friday.1995.720p.BluRay.x264.[YTS.MX]-English.srt");

            // printStream(fr1);
            // fr1.close();

            fr = new FileReader("input.txt");
            fw = new FileWriter("output.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}