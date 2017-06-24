import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static final String FILENAME =
            "C:\\Users\\User\\IdeaProjects\\Hackathon_1\\src\\main\\resources\\input_data";

    public static void main(String[] args) {

//        TxtParser txtParser = new TxtParser(FILENAME);
//
//        String[] inputText = txtParser.getInputText();
//
//        int T = txtParser.getNrOfTestCases();
//        System.out.println("Number test cases = " + T);
//
//        // print of the array
//        System.out.println("Input text:\n");
//        for (String line : inputText) {
//            if (line != null) {
//                System.out.println(line);
//            }
//        }


//        ArrayList<Pair> pairs = getPairsFromText(inputText);
//        for (Pair pair : pairs) {
//            System.out.println(pair);
//        }

        ArrayList<Pair> pairs = new ArrayList<>();

        pairs.add(new Pair(1, 3, "+"));
        pairs.add(new Pair(1, 2, "-"));
        pairs.add(new Pair(2, 3, "+"));
        pairs.add(new Pair(2, 1, "-"));
        pairs.add(new Pair(3, 1, "+"));
        pairs.add(new Pair(3, 2, "-"));


        for (Pair pair : pairs) {
            System.out.println(pair);
        }

        
    }












    private static ArrayList<Pair> getPairsFromText (String[] inputText) {
        ArrayList<Pair> pairs = new ArrayList<>();

        for (String line : inputText) {
            if (line != null) {
                String j = line.substring(0, 1);

                System.out.println(j);
                int a = Integer.parseInt(line.substring(3, 4));
                int b = Integer.parseInt(line.substring(6, 7));
                String sign = line.substring(10, 11);

                pairs.add(new Pair(a, b, sign));

            }
        }

        return pairs;
    }
}
