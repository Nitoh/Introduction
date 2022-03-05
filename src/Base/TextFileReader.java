package Base;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TextFileReader {

    private static File selectedFile;
    private static String content = "Bitte zuerst eine Datei auswählen";
    private static boolean fileRead = false;

    public static void openFileDialog() throws IOException {
        JFileChooser jFileChooser = new JFileChooser();
        int result = jFileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            // user selects a file
            selectedFile = jFileChooser.getSelectedFile();
        } else {
            return;
        }

        try {
            content = Files.readString(selectedFile.toPath());
            fileRead = true;
        } catch (Exception exception) {
            String problem = exception.getMessage();
            fileRead = false;
        }

    }

    public static String getFileContent() {
        return fileRead ? content : null;
    }
}

