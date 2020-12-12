package homework3_loading;

import homework3_saving.GameProgress;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileHandler {
    public static void openZip(String pathToZip, String pathToUnZip) {
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(pathToZip))) {
            ZipEntry entry;
            String name;
            long size;
            while ((entry = zin.getNextEntry()) != null) {
                name = entry.getName(); // получим название файла
                // распаковка
                FileOutputStream fout = new FileOutputStream(pathToUnZip + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static GameProgress openProgress(String filePath) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath)))
        {
            return (GameProgress) ois.readObject();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return null;
    }
}
