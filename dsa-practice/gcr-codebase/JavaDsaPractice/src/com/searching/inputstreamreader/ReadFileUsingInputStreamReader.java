package com.searching.inputstreamreader;

import java.io.*;

public class ReadFileUsingInputStreamReader {

    public static void main(String[] args) throws Exception {

        InputStreamReader isr =
                new InputStreamReader(
                        new FileInputStream("src/com/searching/inputstreamreader/sample.txt"),
                        "UTF-8"
                );

        BufferedReader br = new BufferedReader(isr);
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
