package lesson13dz;

public class Main {
    //
    public static void main(String[] args) {
        try {


            double[][] forA = {{2, 4, 3, 5},
                    {1, 4, 9, 2},
                    {9, 8, 5, 0}};

            double[][] forB = {{5, 0, 4, 1},
                    {1, 1, 0, 1},
                    {2, 3, 5, 0}};

            double[][] forC = {{5, 0, 4},
                    {1, 1, 0},
                    {2, 3, 5},
                    {1, 2, 6}};

            double[][] forE = {{5, 0, 4},
                    {1, 1, 0},
                    {1, 2, 6}};

            double[][] forF = {{1, 0, 0},
                    {0, 1, 0},
                    {0, 0, 1}};


            Matrix a = new Matrix(forA);
            Matrix b = new Matrix(forB);
            Matrix c = new Matrix(forC);
            Matrix e = new Matrix(forE);
            Matrix f = new Matrix(forF);
            Matrix h = new Matrix(null);

            a.setValueAt(1, 1, 4);

            IMatrix resultAdd = a.add(b);
            resultAdd.printToConsole();
            System.out.println("--------------");

            IMatrix resultSub = a.sub(b);
            resultSub.printToConsole();
            System.out.println("--------------");

            IMatrix resultMul = a.mul(c);
            resultMul.printToConsole();
            System.out.println("--------------");

            IMatrix resultMulOnValue = a.mul(2);
            resultMulOnValue.printToConsole();
            System.out.println("--------------");

            Matrix d = new Matrix(3, 3);
            d.fillMatrix(4);
            d.printToConsole();
            System.out.println("--------------");

            double resultDeterminate = e.determinant();
            System.out.println("Детерминант матрицы: " + resultDeterminate);

            boolean resultIsNullMatrix = f.isNullMatrix();
            System.out.println("Матрица нулевая? " + resultIsNullMatrix);

            boolean res = f.isIdentityMatrix();
            System.out.println("Является ли матрица идентичной: " + res);

            boolean squareMatrix = a.isSquareMatrix();
            System.out.println("Является ли матрица квадратной: " + squareMatrix);

            a.printToConsole();
        } catch (NullPointerException n) {
            System.out.println("Вторая матрица не должна быть пустой!");
        } catch (IllegalArgumentException i) {
            System.out.println("Действие не может быть выполнено. Матрицы не равны!!!");
        }
    }
}
