package lesson14;

import java.io.*;

public class CopyWithIOApi implements CopyUtils {
    @Override
    public void copy(String from, String to) throws  IOException {

            InputStream in = new BufferedInputStream(new FileInputStream(from));
            OutputStream out = new BufferedOutputStream(new FileOutputStream(to));

            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();


        }
    }
}
