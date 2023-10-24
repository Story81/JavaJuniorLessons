package test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MatrixTest extends TestCase {


    // метод GetValueAt. Проверка на выброс исключения
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueAt_ThrowIndexOutOfBounds() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.getValueAt(22, 22);
    }



    // метод GetValueAt. Проверка на валидных данных
    public void testGetValueAt_ReturnCorrectResult() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.getValueAt(1, 1);
        double resultWait = 5.0;
        assertEquals(resultWait, resultFact);
    }

    // метод GetValueAt. Проверка на валидных данных (отрицательные и нули)
    public void testGetValueAtNegativeNum_ReturnCorrectResult() {
        double[][] forMatrix = {{0, 0, 0}, {-4, -5, -6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.getValueAt(1, 2);
        double resultWait = -6.0;
        assertEquals(resultWait, resultFact);
    }

    //метод setValueAt. Проверка на выброс исключения
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValueAt_ThrowIndexOutOfBounds() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        matrix.setValueAt(22, 22, 4.0);
    }

    //метод setValueAt. Проверка на валидные данные
    public void testSetValueAtBigNum_ReturnCorrectResult() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        matrix.setValueAt(0, 1, 1234555456);
        double resultFact = matrix.getValueAt(0, 1);
        double resultWait = 1234555456;
        assertEquals(resultWait, resultFact);
    }

    //метод setValueAt. Проверка на валидные данные
    @Test
    public void testSetValueAt_valid_SetCorrectValue() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);

        matrix.setValueAt(0, 1, 10.0);
        Assert.assertEquals(10.0, matrix.getValueAt(0, 1), 0);

        matrix.setValueAt(2, 0, -20.0);
        Assert.assertEquals(-20.0, matrix.getValueAt(2, 0), 0);
    }

//    @Rule
//    public ExpectedException throwRule = ExpectedException.none();

    //метод sub. Проверка на выброс исключения
    @Test(expected = NullPointerException.class)
    public void testSubWithNullMatrix_ThrowNullPointerException() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        matrix.sub(null);
            }
//
//    @Test(expected = NullPointerException.class)
//    public void testSubWithNullMatrix_ThrowNullPointerExceptionText() {
//        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        Matrix matrix = new Matrix(forMatrix);
//        matrix.sub(null);
//        throwRule.expectMessage("прпр");
//    }

    //метод sub. Проверка на валидных данных
//    public void testSubWithMatrix_ReturnCorrectResult() {
//        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
//        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 8}};
//        double[][] forExpectedResult = {{10, 10, 10}, {10, 10, 10}, {10, 10, 11}};
//        Matrix matrix1 = new Matrix(forMatrix1);
//        Matrix matrix2 = new Matrix(forMatrix2);
//        Matrix expectedResult = new Matrix(forExpectedResult);
//
//        IMatrix resultMatrix = matrix1.sub(matrix2);
//        for (int i = 0; i < expectedResult.getRows(); i++) {
//            for (int j = 0; j < expectedResult.getColumns(); j++) {
//                assertEquals(expectedResult.getValueAt(i, j), resultMatrix.getValueAt(i, j), 0.001);
//            }
//        }
//    }

    public void testSubWithMatrix_ReturnCorrectResult() {
        double[][] forMatrix1 = {{1, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 8}};
        double[][] forExpectedResult = {{10, 10, 10}, {10, 10, 10}, {10, 10, 11}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        Matrix expectedResult = new Matrix(forExpectedResult);
        Matrix factResult = (Matrix) matrix1.sub((matrix2));
                assertEquals(factResult,expectedResult);

    }

    //метод sub. Проверка на выброс исключения
    @Test(expected = IllegalArgumentException.class)
    public void testSubWithDifferentSize_ThrowIllegalArgumentException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        matrix1.sub(matrix2);
    }

    //метод add. Валидные данные

    @Test
    public void testAdd_sameSizeMatrices_ReturnCorrectResult() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        IMatrix result = matrix1.add(matrix2);

        Assert.assertEquals(12.0, result.getValueAt(0, 0), 0);
        Assert.assertEquals(14.0, result.getValueAt(0, 1), 0);
        Assert.assertEquals(16.0, result.getValueAt(0, 2), 0);
        Assert.assertEquals(18.0, result.getValueAt(1, 0), 0);
        Assert.assertEquals(20.0, result.getValueAt(1, 1), 0);
        Assert.assertEquals(22.0, result.getValueAt(1, 2), 0);
        Assert.assertEquals(24.0, result.getValueAt(2, 0), 0);
        Assert.assertEquals(26.0, result.getValueAt(2, 1), 0);
        Assert.assertEquals(28.0, result.getValueAt(2, 2), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_differentSizeMatrices_ThrowIllegalArgumentException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        matrix1.add(matrix2);
    }

    @Test(expected = NullPointerException.class)
    public void testAdd_nullMatrix_ThrowNullPointerException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        Matrix matrix1 = new Matrix(forMatrix1);
        matrix1.add(null);
    }

    public void testDeterminant_ReturnCorrectResult() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantNegativeNum_ReturnCorrectResult() {

        double[][] forMatrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    @Test
    public void testTransposeNegativeNums_ReturnCorrectResult() {
        Matrix matrix = new Matrix(new double[][]{{-1, -2, 0}, {-4, -5, -6}, {-7, -8, -9}});
        IMatrix result = matrix.transpose();
        assertEquals(-1, result.getValueAt(0, 0), 0);
        assertEquals(-4, result.getValueAt(0, 1), 0);
        assertEquals(-7, result.getValueAt(0, 2), 0);
        assertEquals(-2, result.getValueAt(1, 0), 0);
        assertEquals(-5, result.getValueAt(1, 1), 0);
        assertEquals(-8, result.getValueAt(1, 2), 0);
        assertEquals(0, result.getValueAt(2, 0), 0);
        assertEquals(-6, result.getValueAt(2, 1), 0);
        assertEquals(-9, result.getValueAt(2, 2), 0);
    }

    public void testTranspose_ReturnCorrectResult() {
        Matrix matrix = new Matrix(new double[][]{{1, 2}, {3, 4}});
        IMatrix result = matrix.transpose();
        assertEquals(1, result.getValueAt(0, 0), 0);
        assertEquals(3, result.getValueAt(0, 1), 0);
        assertEquals(2, result.getValueAt(1, 0), 0);
        assertEquals(4, result.getValueAt(1, 1), 0);
    }


    //    метод mul. Валидные данные
    public void testMul_ReturnCorrectResult() {
        Matrix matrix = new Matrix(new double[][]{{1, 2}, {3, 4}});
        IMatrix result = matrix.mul(22);
        assertEquals(22, result.getValueAt(0, 0), 0);
        assertEquals(44, result.getValueAt(0, 1), 0);
        assertEquals(66, result.getValueAt(1, 0), 0);
        assertEquals(88, result.getValueAt(1, 1), 0);
    }


    @Test(expected = NullPointerException.class)
    public void testMul_ThrowNullPointerException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = null;
        matrix1.mul(matrix2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMul_ThrowIllegalArgumentException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        matrix1.mul(matrix2);
    }



}
