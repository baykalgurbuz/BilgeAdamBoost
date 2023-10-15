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
        try (BufferedReader bufferReader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = bufferReader.readLine()) != null) {
                words.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
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
