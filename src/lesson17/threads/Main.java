package lesson17.threads;

import lesson14.CopyWithCommonIO;
import lesson14.CopyWithGuava;
import lesson14.CopyWithNioApi;
import lesson14.CopyWithOneByte;

public class Main {
    public static void main(String[] args) {
        CopyFileTask task1 = new CopyTaskFileImpl("C:\\Users\\CASPER\\Downloads\\jdk-17_windows-x64_bin.zip", "C:\\Users\\CASPER\\Desktop\\олимпис\\1.zip");
        CopyFileTask task2 = new CopyTaskFileImpl("C:\\Users\\CASPER\\Downloads\\Отзыв итог.xlsx", "C:\\Users\\CASPER\\Desktop\\олимпис\\2.xlsx");
        CopyFileTask task3 = new CopyTaskFileImpl("C:\\Users\\CASPER\\Downloads\\Screenshot_25.png", "C:\\Users\\CASPER\\Desktop\\олимпис\\3.png");
        CopyFileTask task4 = new CopyTaskFileImpl("C:\\Users\\CASPER\\Downloads\\ca-intermediate2222-inno-local.crt", "C:\\Users\\CASPER\\олимпис\\Desktop\\4.crt");

        task1.setFileCopyUtils(new CopyWithCommonIO());
        task2.setFileCopyUtils(new CopyWithNioApi());
        task3.setFileCopyUtils(new CopyWithOneByte());
        task4.setFileCopyUtils(new CopyWithGuava());


        Task task5 = new FindFilesTaskImpl("C:\\Users\\CASPER\\Downloads", "google", System.out);
        Task task6 = new FindFilesTaskImpl("C:\\Users\\CASPER\\Downloads", "физика", System.out);
        Task task7 = new FindFilesTaskImpl("C:\\Users\\CASPER\\Downloads", "театр", System.out);
        Task task8 = new FindFilesTaskImpl("C:\\Users\\CASPER\\Downloads222", "манго", System.out);

        TasksStorage storage = new TaskStorageImpl();
        storage.add(task6);
        storage.add(task2);
        storage.add(task1);
        storage.add(task8);

        storage.add(task3);
        storage.add(task4);
        storage.add(task5);
        storage.add(task7);

        TaskExecutorImpl executor1 = new TaskExecutorImpl();
        TaskExecutorImpl executor2 = new TaskExecutorImpl();
        TaskExecutorImpl executor3 = new TaskExecutorImpl();
        executor1.setStorage(storage);
        executor2.setStorage(storage);
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();


    }
}
