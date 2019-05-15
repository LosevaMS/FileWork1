/**
 * @author Maria Loseva
 */
public class Matrix {
  /** Fields row, col */
    private int row, col;
    /** Field two-dimensional array of complex numbers */
    private Complex[][] MC;

    public int getRow() {
        return row;
    }
    /**
     * The procedure for determining the number of lines {@link Matrix#row}
     * @param r - the number of lines
     */
    public void setRow(int r) {
        row = r;
    }
    /**
     * Function to get field value {@link Matrix#col}
     * @return returns the number of columns of the matrix
     */
    public int getCol() {
        return col;
    }
    /**
     * The procedure for determining the number of columns {@link Matrix#col}
     * @param c - the number of columns
     */
    public void setCol(int c) {
        col = c;
    }
    /**
     * The procedure for determining the matrix type Complex{@link Matrix#MC}
     * @param mas - array of complex numbers
     */
    public void setMatrix(Complex[][] mas) {
        MC=mas;
    }
    public void setMatrix(double[][] mas) {
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++)
                MC[i][j]=new Complex(mas[i][j],0);
    }
    /**
     * Constructor - creating a new object with specific values
     * @see Matrix#Matrix(int,int)
     */
    Matrix()
    {
        this.row=0;
        this.col=0;
        this.MC=new Complex[0][0];
    }/**
     * Constructor - creating a new object with specific values
     * @param r - number of lines
     * @param c - number of columns
     * @see Matrix#Matrix()
     */
    Matrix(int r,int c)
    {
        this.row=r;
        this.col=c;
        this.MC=new Complex[r][c];
    }
    /**
     * Matrix print function {@link Matrix#MC}
     */
    public void Print(){
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
                MC[i][j].PrintC();
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    /**
     * Matrix addition function{@link Matrix#MC}
     * @return returns the resulting matrix
     * @param b - summation matrix
     */
    public Matrix Sum(Matrix b)throws NotEqualSizeException {

        if (this.row != b.row || this.col != b.col){
            throw new NotEqualSizeException("Two matrix have different sizes");
        }
            Complex[][] mas = new Complex[row][col];
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = new Complex(i - 5, j + 2);
                    // mas[i][j].PrintC();
                }
            }
            Matrix sum_M = new Matrix(this.row, this.col);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mas[i][j] = MC[i][j].sum(b.MC[i][j]);
                }
            }
            System.out.println();
            sum_M.setMatrix(mas);
            sum_M.Print();
            System.out.println();
            return sum_M;
        }

    /**
     * Matrix subtraction function {@link Matrix#MC}
     * @return returns the resulting matrix
     * @param b - subtractable matrix
     */
    public Matrix Sub(Matrix b)throws NotEqualSizeException
    {
        if (this.row != b.row || this.col != b.col) {
            throw new NotEqualSizeException("Two matrix have different sizes");
        }
        Complex[][] mas=new Complex[row][col];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] =new Complex(i-5,j+2);
                // mas[i][j].PrintC();
            }
        }
        Matrix sum_M=new Matrix(this.row,this.col);
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                mas[i][j] = MC[i][j].sub(b.MC[i][j]);
            }
        }
        System.out.println();
        sum_M.setMatrix(mas);
        sum_M.Print();    System.out.println();
        return sum_M;
    }
    /**
     * Matrix multiplication function {@link Matrix#MC}
     * @return returns the resulting matrix
     * @param b - multiply matrix
     */
    public Matrix Mul(Matrix b)throws NotEqualSizeException
    {
        if (this.row != b.row || this.col != b.col) {
            throw new NotEqualSizeException("Two matrix have different sizes");
        }
        Complex[][] mas=new Complex[row][col];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] =new Complex(i-5,j+2);
                // mas[i][j].PrintC();
            }
        }
        Matrix sum_M=new Matrix(this.row,this.col);
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                mas[i][j] = MC[i][j].mul(b.MC[i][j]);
            }
        }
        System.out.println();
        sum_M.setMatrix(mas);
        sum_M.Print();    System.out.println();
        return sum_M;
    }
    /**
     * Matrix transpose function{@link Matrix#MC}
     * @return returns the resulting matrix
     */
    public Matrix Transpose() {
        if (this.col>this.row){
        for (int i = 0; i < this.col; i++) {
            for (int j = i + 1; j < this.row; j++) {
                Complex temp = this.MC[i][j];
                this.MC[i][j] = this.MC[j][i];
                this.MC[j][i] = temp;
            }
        }
        }
        else {
            for (int i = 0; i < this.row; i++) {
                for (int j = i + 1; j < this.col; j++) {
                    Complex temp = this.MC[i][j];
                    this.MC[i][j] = this.MC[j][i];
                    this.MC[j][i] = temp;
                }
            }
        }
        return this;
    }


}
