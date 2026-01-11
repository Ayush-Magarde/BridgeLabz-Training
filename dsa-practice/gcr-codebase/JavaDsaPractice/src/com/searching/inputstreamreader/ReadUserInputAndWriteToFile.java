package com.searching.inputstreamreader;

import java.io.*;

public class ReadUserInputAndWriteToFile {

    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        FileWriter fw = new FileWriter("src/com/searching/inputstreamreader/output.txt");

        String input;

        System.out.println("Enter text (type 'exit' to stop):");

        while (true) {
            input = br.readLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            fw.write(input + "\n");
        }

        fw.close();
        br.close();

        System.out.println("Input saved to file successfully.");
    }
}
