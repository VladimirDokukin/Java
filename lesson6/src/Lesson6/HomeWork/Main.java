package Lesson6.HomeWork;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;

public class Main {

    private static String text1 = "English Wikipedia is the English-language edition of the free online encyclopedia, Wikipedia. Founded on 15 January 2001, it is the first edition of Wikipedia and, as of November 2020";
    private static String text2 = "The Simple English Wikipedia is a variation in which most articles use only basic English vocabulary. There is also the Old English Wikipedia, and a test incubator version for the Middle English Wikipedia.";
    private static String NAME_OF_FILE_1 = "TextFile1.txt";
    private static String NAME_OF_FILE_2 = "TextFile2.txt";
    private static String NAME_OF_FILE_3 = "TextFile3.txt";
    private static String SOME_WORD = "Simple";



    public static void main(String[] args) {


         createFile(NAME_OF_FILE_1, text1);

         createFile(NAME_OF_FILE_2, text2);

         System.out.println(checkWord(NAME_OF_FILE_1,SOME_WORD));

         glueFiles(NAME_OF_FILE_1,NAME_OF_FILE_2);
    }

    public static void glueFiles(String fileName1, String fileName2){
        StringBuilder st1;
        st1 = new StringBuilder();
        st1.append(readFile(fileName1));
        st1.append(readFile(fileName2));
        createFile(NAME_OF_FILE_3,st1.toString());
    }

    public static void createFile (String nameOfFile, String text){
        try {
            // name +=".txt";
            FileOutputStream fileOutputStream = new FileOutputStream(nameOfFile);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(text);
            fileOutputStream.close();
            printStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder readFile (String nameOfFile) {
        StringBuilder st;
        int symbols;
        st = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(nameOfFile);
            while ((symbols = fileInputStream.read()) !=-1) {
                st.append((char)symbols);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
    }
        return st;
    }


    public static boolean checkWord(String nameOfFile, String word) {
        StringBuilder st;
        int i = 0;
        char[] myCharWord = word.toCharArray();
        int wordLength = myCharWord.length-1;
        int symbols;

        st = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(nameOfFile);
            while ((symbols = fileInputStream.read()) !=-1) {
                st.append((char)symbols);
                if ((char)symbols == myCharWord[i]) {
                if (i == wordLength) {return true;} i++;
                } else {
                    i=0;
                }
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
