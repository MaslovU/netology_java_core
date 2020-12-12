package homework3_setting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder logs = new StringBuilder();
        FileWriter forLogs;

        try {
            File gamesDir = new File("src/main/java/homework3_setting/Games");
            gamesDir.mkdirs();
            new File("src/main/java/homework3_setting/Games/src").mkdirs();
            logs.append("Directory src is created");
            new File("src/main/java/homework3_setting/Games/src/main").mkdirs();
            logs.append("\n Directory main is created");
            new File("src/main/java/homework3_setting/Games/src/main", "Main.java").createNewFile();
            logs.append("\n File Main is created is created");
            new File("src/main/java/homework3_setting/Games/src/main", "Utils.java").createNewFile();
            logs.append("\n File Utils is created");
            new File("src/main/java/homework3_setting/Games/src/main").mkdirs();
            logs.append("\n Directory main is created");
            new File("src/main/java/homework3_setting/Games/src/test").mkdirs();
            logs.append("\n Directory test is created");
            new File("src/main/java/homework3_setting/Games/res").mkdirs();
            logs.append("\n Directory res is created");
            new File("src/main/java/homework3_setting/Games/res/drawables").mkdirs();
            logs.append("\n Directory drawables is created");
            new File("src/main/java/homework3_setting/Games/res/vectors").mkdirs();
            logs.append("\n Directory vectors is created");
            new File("src/main/java/homework3_setting/Games/res/icons").mkdirs();
            logs.append("\n Directory icons is created");
            new File("src/main/java/homework3_setting/Games/savegames").mkdirs();
            logs.append("\n Directory savegames is created");
            new File("src/main/java/homework3_setting/Games/temp").mkdirs();
            logs.append("\n Directory temp is created");
            new FileWriter("src/main/java/homework3_setting/Games/temp.txt");
            logs.append("\n File temp is created");
        } catch (IOException e) {
            e.printStackTrace();
        }

        forLogs = new FileWriter("src/main/java/homework3_setting/Games/temp.txt", false);
        String stringLogs = logs.toString();
        forLogs.write(stringLogs);
        forLogs.flush();

        try (FileInputStream fin = new FileInputStream("src/main/java/homework3_setting/Games/temp.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}