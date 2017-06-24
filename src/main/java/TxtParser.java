import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtParser {
    String FILENAME;
    int T = 0;

    public TxtParser(String FILENAME) {
        this.FILENAME = FILENAME;
    }

    public int getNrOfTestCases() {
        return T;
    }

    public String[] getInputText() {
        String[] inputText = new String[1000];
        int inputTextLines = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                if (sCurrentLine.length() == 1) {
                    T = Integer.parseInt(sCurrentLine);
                    continue;
                }

                inputTextLines++;
                inputText[inputTextLines] = sCurrentLine;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputText;
    }
}
