package lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {

    public static void fillMines(int[][] field) {
        for (int mine = 0; mine < 10; mine++) {
            int row = ThreadLocalRandom.current().nextInt(0, 9);
            int col = ThreadLocalRandom.current().nextInt(0, 9);
            if (field[row][col] == -1) { // если там уже мина есть
                mine--; //откат попытки
            } else {
                field[row][col] = -1;
            }
        }
    }

    public static void insertNumsAroundMines(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) { //если в клеточке мина
                    if (i == 0 && j == 0) {  // левый верхний угол
                        if (field[i][j + 1] != -1) //если нет мины, увеличиваем соседа на 1 соседа справа
                            field[i][j + 1] += 1;
                        if (field[i + 1][j + 1] != -1) //если нет мины, увеличиваем соседа на 1 соседа справа внизу
                            field[i + 1][j + 1] += 1;
                        if (field[i + 1][j] != -1) //если нет мины, увеличиваем соседа на 1 соседа снизу
                            field[i + 1][j] += 1;
                    }

                    int lastJ = field[i].length - 1;
                    int lastI = field.length - 1;

                    if (i == 0 && j == lastJ) {  // правый верхний угол
                        if (field[i][j - 1] != -1) // если не мина, увеличиваем на 1 соседа слева
                            field[i][j - 1] += 1;
                        if (field[i + 1][j - 1] != -1) // если не мина, увеличиваем на 1 соседа слева внизу
                            field[i + 1][j - 1] += 1;
                        if (field[i + 1][j] != -1) // если не мина, увеличиваем на 1 соседа снизу
                            field[i + 1][j] += 1;
                    }

                    if (i == lastI && j == 0) {    // нижний левый угол
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                    }

                    if (i == lastI && j == lastJ) {    // нижний правый угол
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                    }
                    if (i != 0 && i != lastI && j == 0) {    // левая сторона
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                        if (field[i + 1][j + 1] != -1)
                            field[i + 1][j + 1] += 1;
                        if (field[i + 1][j] != -1)
                            field[i + 1][j] += 1;
                    }

                    if (i != 0 && i != lastI && j == lastJ) {    // правая сторона
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i + 1][j - 1] != -1)
                            field[i + 1][j - 1] += 1;
                        if (field[i + 1][j] != -1)
                            field[i + 1][j] += 1;
                    }

                    if (i == 0 && j != 0 && j != lastJ) {    // верхняя сторона
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i + 1][j - 1] != -1)
                            field[i + 1][j - 1] += 1;
                        if (field[i + 1][j] != -1)
                            field[i + 1][j] += 1;
                        if (field[i + 1][j + 1] != -1)
                            field[i + 1][j + 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                    }

                    if (i == lastI && j != 0 && j != lastJ) {    // нижняя сторона
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                    }

                    // расстановка цифр на центральное поле
                    if (i != 0 && j != 0 && j != lastJ && i != lastI) {
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                        if (field[i + 1][j - 1] != -1)
                            field[i + 1][j - 1] += 1;
                        if (field[i + 1][j] != -1)
                            field[i + 1][j] += 1;
                        if (field[i + 1][j + 1] != -1)
                            field[i + 1][j + 1] += 1;
                    }
                }
            }
        }
    }


    public static void printField(int[][] field, boolean[][] mask) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (mask[i][j]) { //если в массике mask клеточку True отображать
                    System.out.print(field[i][j] + " ");
                } else {
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }
    }
}


