package com.pb.tkachuk.hw9;


import java.io.*;
import java.util.Random;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * В нем создать методы:
 * - createNumbersFile - создает текстовый файл "numbers.txt" заполненный случайными целыми числами от 1 до 99. 10 строк
 * и по 10 чисел в каждой строке. Числа разделять пробелами.
 * - createOddNumbersFile - читает файл "numbers.txt", и создает на основе него новый файл "odd-numbers.txt" в который
 * входят все числа из "numbers.txt" только все четные заменены на 0.
 * В методе main продемонстрировать работу методов createNumbersFile и createOddNumbersFile. По желанию можно добавить
 * логирование работы программы.
 */

public class FileNumbers {
    public static void main(String[] args) {
        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile() {
        Random random = new Random();
        String[] stringArray = new String[10];

        //generating numbers
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "";
            for (int y = 0; y < stringArray.length; y++) {
                stringArray[i] += String.valueOf(random.nextInt(100)) + " ";
            }
        }

        createFile("numbers.txt", stringArray);
    }

    public static void createFile(String fileName, String[] data) {
        Path path = Paths.get("src/com/pb/tkachuk/hw9/" + fileName);

        // write to file
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < data.length; i++) {
                writer.write(data[i].trim());
                if (i != data.length-1) writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");
    }

    public static void createOddNumbersFile() {
        String[] linesArray = new String[10];
        Path path = Paths.get("src/com/pb/tkachuk/hw9/numbers.txt");
        // read from file
        System.out.println("Read text from file \"" + path.toAbsolutePath() + "\":");
        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line;
            int i=0;
            while ((line = reader.readLine()) != null) {
                linesArray[i]=changeNumbers(line);
                i++;
            }

        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
        System.out.println("Read from file done!");

        createFile("odd-numbers.txt", linesArray);
    }

    public static String changeNumbers(String line){
        String[] numbers = line.split(" ");
        String result="";
        for(String number: numbers){
            if(isEven(Integer.valueOf(number))) {
                result+="0 ";
            } else {
                result+=number+" ";
            }
        }
        return result.trim();
    }

    public static boolean isEven(int x){
        return x % 2 == 0;
    }
}