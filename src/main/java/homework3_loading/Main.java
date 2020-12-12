package homework3_loading;

import homework3_saving.GameProgress;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) {
        String pathToZip = "src/main/java/homework3_setting/Games/savegames/saveZip.zip";
        String pathToUnZip = "src/main/java/homework3_loading/unzip";
        String pathSave1 = "src/main/java/homework3_loading/unzipsave1.dat";

        FileHandler.openZip(pathToZip, pathToUnZip);

        GameProgress player1 = FileHandler.openProgress(pathSave1);

        System.out.println(player1);
    }
}
