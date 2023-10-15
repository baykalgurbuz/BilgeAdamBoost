package CustomReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NKReader {
    private String path;
    NKReader(String path)
    {
        this.path=path;
    }
    public ArrayList<String> readWords(){
        ArrayList<String> words =new ArrayList<>();
        try (FileReader fileReader = new FileReader(path)) {
            StringBuilder lineBuilder = new StringBuilder();
            int character;
            while ((character = fileReader.read()) != -1) {
                if ((char) character == '\n') {
                    words.add(lineBuilder.toString());
                    lineBuilder.setLength(0);
                } else {
                    lineBuilder.append((char) character);
                }
            }
            if (lineBuilder.length() > 0) {
                words.add(lineBuilder.toString());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  words;
    }
    public String readlineAt(int lineNum)
    {
        ArrayList<String> readFileData = readWords();
        String lineData = readFileData.get(lineNum);
        System.out.println(lineData);
        return lineData;
    }
}
