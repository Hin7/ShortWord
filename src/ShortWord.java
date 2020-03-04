/**
 * Task #2037 SGU (Too short words)
 *
 * @author Hin7
 * @version 1.1 04.02.2020
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class ShortWord { // when send to SGU, change class name to Solution
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(Paths.get("input.txt"), "UTF-8");
            PrintWriter out = new PrintWriter("output.txt", "UTF-8");
            String InS = in.nextLine();
            int n = in.nextInt();
            String[] Words = InS.split(",", 1000);
            //System.out.println(Words.length);
            boolean FirstWord = true;
            for(String Word : Words){
                if (Word.length() >= n){
                    out.print((FirstWord ? "" : ",") + Word);
                    FirstWord = false;
                }
            }
            if(FirstWord)
                out.println("");
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
