import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileOrganizer {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java FileOrganizer <folder-path>");
            return;
        }

        File folder = new File(args[0]);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path.");
            return;
        }

        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("No files found.");
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                organizeFile(file, folder);
            }
        }

        System.out.println("Files organized successfully!");
    }

    private static void organizeFile(File file, File baseFolder) {
        String fileName = file.getName();
        String extension = getFileExtension(fileName);

        String folderName;

        switch (extension) {
            case "pdf":
                folderName = "PDFs";
                break;
            case "jpg":
            case "jpeg":
            case "png":
                folderName = "Images";
                break;
            case "mp4":
            case "mkv":
                folderName = "Videos";
                break;
            case "zip":
            case "rar":
                folderName = "Archives";
                break;
            case "exe":
                folderName = "Installers";
                break;
            default:
                folderName = "Others";
        }

        File targetDir = new File(baseFolder, folderName);
        if (!targetDir.exists()) {
            targetDir.mkdir();
        }

        try {
            Files.move(
                    file.toPath(),
                    Path.of(targetDir.getPath(), fileName),
                    StandardCopyOption.REPLACE_EXISTING
            );
        } catch (IOException e) {
            System.out.println("Failed to move file: " + fileName);
        }
    }

    private static String getFileExtension(String name) {
        int lastDot = name.lastIndexOf(".");
        if (lastDot == -1) {
            return "";
        }
        return name.substring(lastDot + 1).toLowerCase();
    }
}
