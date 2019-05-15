public class Main {
    public static void main(String[] args) {
try {
    Matrix A = new Matrix(3, 4);
    Matrix B = new Matrix(5, 4);
    Matrix C = new Matrix(3, 4);
    double[][] arr = new double[A.getRow()][A.getCol()];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = j + 1;
        }
    }
    double[][] arr1 = new double[B.getRow()][B.getCol()];
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr1[i].length; j++) {
            arr1[i][j] = j + i + 5;
        }
    }
    A.setMatrix(arr);
    A.Print();
    System.out.println();
    B.setMatrix(arr1);
    B.Print();
    System.out.println();
    A.Transpose();
    A.Print();
    System.out.println();
    C = A.Mul(B);
    C.Print();
    System.out.println();
    Complex[][] mas = new Complex[A.getRow()][A.getCol()];
    for (int i = 0; i < mas.length; i++) {
        for (int j = 0; j < mas[i].length; j++) {
            mas[i][j] = new Complex(i - 5, j + 2);
            // mas[i][j].PrintC();
        }
    }
    Matrix A1 = new Matrix(3, 4);
    A1.setMatrix(mas);
    A1.Print();
    System.out.println();
    A.setMatrix(mas);
    A.Print();
    System.out.println();
    A.Sum(A1);
    A.Sub(A1);
    A.Mul(A1);
}
catch(NotEqualSizeException e) {
    System.out.println("Error:" + e);
        }
    }
}
