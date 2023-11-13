package lesson14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyWithNioApi implements CopyUtils {
    @Override
    public void copy(String from, String to) throws IOException {

        Path fileFrom = Paths.get(from);
        Path fileTo = Paths.get(to);
        Files.copy(fileFrom, fileTo, StandardCopyOption.REPLACE_EXISTING);

    }
}

