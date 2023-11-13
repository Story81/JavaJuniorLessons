package lesson14;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyWithCommonIO implements CopyUtils {
    @Override
    public void copy(String from, String to) throws IOException {

        File fileFrom = new File(from);
        File fileTo = new File(to);

        FileUtils.copyFile(fileFrom, fileTo);

    }
}
