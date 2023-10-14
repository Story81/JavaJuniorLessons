package lesson10;

public class Matrix implements IMatrix {

    private double[][] nums;

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col) {
        if (row < 0 || row > 10 || col < 0 || col > 10) {
            nums = new double[1][1];
        } else {
            nums = new double[row][col];
        }
    }


    @Override

    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows() || colIndex < 0 || colIndex >= getColumns()) {
            return -1; //заглушка
        }
        return nums[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows() || colIndex < 0 || colIndex >= getColumns()) {
            return;
        }
        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //явный параметр otherMatrix- b
        //неявный параметр а
        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы не равны!!!");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns()); //возвращаем третью матрицу размером как а

        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
                return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы не равны!!!");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns()); //возвращаем третью матрицу размером как а

        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Такие матрицы нельзя перемножить, т.к. количество столбцов матрицы А не равно количеству строк матрицы В");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());

        int newRows = this.getRows();
        int newColumns = otherMatrix.getColumns();
        Matrix resultMul = new Matrix(newRows, newColumns);
        for (int i = 0; i < newRows; i++) {
            for (int j = 0; j < newColumns; j++) {
                double value = 0;
                for (int k = 0; k < this.getColumns(); k++) {
                    value += nums[i][k] * otherMatrix.getValueAt(k, j);
                }
                result.setValueAt(i, j, value);
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(this.getRows(), this.getColumns()); //возвращаем третью матрицу размером как а
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }

        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                nums[i][j] = value;
            }
        }
    }

    @Override
    public double determinant() {
        if (this.getRows() != this.getColumns()) {
            System.out.println("Матрица не квадратная");
            return -1; //заглушка
        }
        return determinant(nums);
    }

    private double determinant(double[][] nums) {

        int n = nums.length;
        if (n == 1) {
            return nums[0][0];
        }
        if (n == 2) {
            return nums[0][0] * nums[1][1] - nums[0][1] * nums[1][0];
        }
        double determinant = 0;
        for (int j = 0; j < n; j++) {
            double[][] subMatrix = subMatrix(nums, 0, j);
            determinant += Math.pow(-1, j) * nums[0][j] * determinant(subMatrix);
        }
        return determinant;
    }
    private double[][] subMatrix(double[][] nums, int rowToRemove, int colToRemove) {
        int n = nums.length;
        double[][] subMatrix = new double[n - 1][n - 1];
        int rowIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i == rowToRemove) {
                continue;
            }
            int colIndex = 0;
            for (int j = 0; j < n; j++) {
                if (j == colToRemove) {
                    continue;
                }
                subMatrix[rowIndex][colIndex] = nums[i][j];
                colIndex++;
            }
            rowIndex++;
        }
        return subMatrix;
    }



    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j]!=0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        if (!isSquareMatrix()) {
            System.out.println("Матрица должна быть квадратной!!!");
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (i == j && nums[i][i] != 1) {
                    return false;
                }
                if (i != j && nums[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (nums.length==nums[0].length) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");

            }
            System.out.println();
        }
    }
}
