package lesson14;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements  CopyUtils{
    @Override
    public void copy(String from, String to) throws  IOException{
        File fileFrom = new File(from);
        File fileTo = new File(to);

            Files.copy(fileFrom,fileTo);


    }
}
