package Lesson_8;

import java.io.*;
import java.util.ArrayList;

public class Lesnik {
    String file;
    ArrayList<Integer> digits;
    int counts;
    int[] result;

    public Lesnik(String file, int counts) {
        this.file = file;
        this.counts = counts;
        this.result = new int[this.counts];
        this.digits = new ArrayList<>();
    }

    public int[] counter() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String string;
        while ((string=br.readLine())!=null) {
            String[]str = string.split(" ");
            for (int i=0;i<str.length;i++) {
                if (str[i]!=" "&&str[i]!="\n"&&str[i]!=""&&str[i]!=null)
                digits.add(Integer.parseInt(str[i]));
            }
        }

        for (int i = 0; i < counts; i++) {
            for (int j = 0; j < digits.size(); j++) {
                if (digits.get(j)==i){
                    result[i]++;
                }
            }
        }
        return result;

    }
}
