package FileIO;

import java.io.*;


public class Main {
    public static void main(String[] args)
    {
        //fileReader();
        //fileWriter();
        //bufferWriter();
        bufferAppendWriter();
        bufferReader();
    }

    private static void bufferAppendWriter() {
        String filePath = "C:\\Users\\EnesG\\OneDrive\\Masaüstü\\deneme.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            bufferedWriter.newLine();
            bufferedWriter.write("Bu satır mevcut dosyanın üstüne eklendi.");
            bufferedWriter.newLine();
            bufferedWriter.write("Yeni satır eklendi.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferWriter() {
        String filePath = "C:\\Users\\EnesG\\OneDrive\\Masaüstü\\deneme.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write("Merhaba, dünya with BufferWriter!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileWriter() {
        String filePath = "C:\\Users\\EnesG\\OneDrive\\Masaüstü\\deneme.txt";
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write("Merhaba, dünya with FileWriter!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferReader() {
        String filePath = "C:\\Users\\EnesG\\OneDrive\\Masaüstü\\deneme.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Satırı ekrana yazdırma
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileReader() {
        String filePath = "C:\\Users\\EnesG\\OneDrive\\Masaüstü\\deneme.txt";
        try (FileReader fileReader = new FileReader(filePath)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
