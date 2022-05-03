import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    FishesInTheSea solution = new FishesInTheSea();

    @Test
    public void BasicTest() {
        int mat[][] = {
                {1,3,3},
                {2,1,4},
                {0,6,4}
        };
        assertEquals(12, solution.solve(mat));
    }

    @Test
    public void SquareFourTest() {
        int mat[][] = {
                {1,3,1,5},
                {2,2,4,1},
                {5,0,2,3},
                {0,6,1,2}
        };
        assertEquals(16, solution.solve(mat));
    }

    @Test
    public void LastTest() {
        int mat[][] = {
                {10,33,13,15},
                {22,21,4,1},
                {5,0,2,3},
                {0,6,14,2}
        };
        assertEquals(83, solution.solve(mat));
    }

    @Test
    public void MatrixExampleTest() {
        int mat[][] = {
                {1,3,1,5},
                {2,2,4,1},
                {5,0,2,3},
                {0,6,1,2}
        };
        assertEquals(16, solution.solve(mat));
    }

    @Test
    public void LastMatrixExampleTest() {
        int mat[][] = {
                {36,5,46,29,13,57,24,95},
                {82,45,14,67,34,64,43,50},
                {87,8,76,78,88,84,3,51},
                {54,99,32,60,76,68,39,12},
                {26,86,94,39,95,70,34,78}
        };
        assertEquals(622, solution.solve(mat));
    }
}
