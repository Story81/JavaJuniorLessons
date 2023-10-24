package lesson14;

public class Test {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        long time1 = System.currentTimeMillis();
        copyWithOneByte.copy("E:\\!!!НАДЕЖДА СОХРАНИТЬ!!!\\разное\\бал 2014.zip","test1.mp4");
        long time2 = System.currentTimeMillis();
        System.out.println("Копирование по одному байту: " + (time2-time1));

        CopyWithGuava copyWithGuava = new CopyWithGuava();
        long time3 = System.currentTimeMillis();
        copyWithGuava.copy("E:\\!!!НАДЕЖДА СОХРАНИТЬ!!!\\разное\\бал 2014.zip","test2.mp4");
        long time4 = System.currentTimeMillis();
        System.out.println("Копирование use Guava: " + (time4-time3));

        CopyWithCommonIO copyWithCommonIO = new CopyWithCommonIO();
        long time5 = System.currentTimeMillis();
        copyWithCommonIO.copy("E:\\!!!НАДЕЖДА СОХРАНИТЬ!!!\\разное\\бал 2014.zip","test3.mp4");
        long time6 = System.currentTimeMillis();
        System.out.println("Копирование use Common IO: " + (time6-time5));
    }
}
