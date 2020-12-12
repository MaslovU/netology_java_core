package homework3_saving;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameProgress player1 = new GameProgress(10, 15, 5, 50.3);
        GameProgress player2 = new GameProgress(7, 12, 6, 41.7);
        GameProgress player3 = new GameProgress(10, 17, 10, 11);

        String filename1 = "src/main/java/homework3_setting/Games/savegames/save1.dat";
        String filename2 = "src/main/java/homework3_setting/Games/savegames/save2.dat";
        String filename3 = "src/main/java/homework3_setting/Games/savegames/save3.dat";
        List<String> srcFiles = Arrays.asList(filename1, filename2, filename3);

        GameProgress.saveGame(filename1, player1);
        GameProgress.saveGame(filename2, player2);
        GameProgress.saveGame(filename3, player3);

        GameProgress.zipGame(srcFiles);

        if (
                new File(filename1).delete() &&
                        new File(filename2).delete() &&
                        new File(filename3).delete()) {
            System.out.println("Success");
        } else {
            System.out.println("Cannot delete this files. Try again");
        }
    }
}
