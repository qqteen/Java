package Testing_123;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class HowManualNiggaWriteTextFile {
    public static void main(String[] args) {
        String filePath = "output.text";

        try(BufferedWriter nigga = new BufferedWriter(new FileWriter(filePath))) {
            nigga.write("Morning Motherfucker.");
            nigga.newLine();
            nigga.write("Shin Thant Aye does not love you.");
            nigga.newLine();
            nigga.write("Suck my dick and lick my balls.");

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
