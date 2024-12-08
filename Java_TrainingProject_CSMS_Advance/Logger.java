package Java_TrainingProject_CSMS_Advance;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public static void log(String message) {
        try (FileWriter writer = new FileWriter("logs.txt", true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

