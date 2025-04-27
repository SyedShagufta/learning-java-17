package com.java.formatting;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class NewlineTest {
    public static void main(String[] args) throws Exception {
        // Print to console
        System.out.println("Console Output:");
        System.out.printf("Using \\n -> Hello\nWorld\n");
        System.out.printf("Using %%n -> Hello%nWorld%n");

        // Now, let's write the same to a file
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("test_output.txt"))) {
            writer.printf("Using \\n -> Hello\nWorld\n");
            writer.printf("Using %%n -> Hello%nWorld%n");
        }

        System.out.println("Output written to test_output.txt. Check it!");
    }
}

