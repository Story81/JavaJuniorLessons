package lesson14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            //полный путь C:\Users\CASPER\Desktop\Шульга.jpg
            //относительный путь (относительно нашей папки проекта erste.jpg")
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\CASPER\\Downloads\\jdk-17_windows-x64_bin.zip"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("qwerty.zip"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
