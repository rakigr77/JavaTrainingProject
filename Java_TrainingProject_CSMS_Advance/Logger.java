package Java_TrainingProject_CSMS_Advance;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public static void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("order_logs.txt", true))) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
