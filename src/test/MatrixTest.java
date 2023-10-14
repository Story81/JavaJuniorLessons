package test;

import junit.framework.TestCase;
import org.junit.Test;


public class MatrixTest extends TestCase {


    public void determinantTest1()  {

        double[][] forMatrix = {{1,2,3},
                                {1,2,3},
                                {1,2,3}};
        Matrix matrix = new Matrix(forMatrix);

        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void determinantTest2()  {

        double[][] forMatrix = {{-1,-2,-3},
                {-1,-2,-3},
                {-1,-2,-3}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }
}
