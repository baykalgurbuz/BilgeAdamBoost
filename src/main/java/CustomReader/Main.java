package CustomReader;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
    NKReader nk =new NKReader("C:\\Users\\EnesG\\OneDrive\\Masaüstü\\deneme.txt");
    ArrayList<String>dataArray =nk.readWords();
    String dataLine = nk.readlineAt(0);
    }
}
