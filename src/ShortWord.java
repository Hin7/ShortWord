/**
 * Решение задачи 2037 СГУ (Строки. Слишком короткие слова)
 *
 * @author Hin7
 * @version 1.0 30.10.2019
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(Paths.get("input.txt"), "UTF-8");
            PrintWriter out = new PrintWriter("output.txt", "UTF-8");
            String InS = in.nextLine();
            int n = in.nextInt();
            String[] Words = InS.split(",", 1001);
            System.out.println(Words.length);
            boolean FirstWord = true;
            for(String Word : Words){
                if (Word.length() >= n){
                    out.print((FirstWord ? "" : ",") + Word);
                    FirstWord = false;
                }
            }
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
