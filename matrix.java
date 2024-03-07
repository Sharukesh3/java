class Matrix_operations {
     int a[][]={{1,2,3},{4,5,6},{7,8,9}};
     int b[][]={{1,2,3},{4,5,6},{7,8,9}};
     int sum[][] = new int[a.length][a[1].length];
     int mul[][] = new int[a.length][b.length];
    void Addmatrix(){
        if (a.length != b.length && a[0].length != b[0].length)
        {
            System.out.println("Cant add the matrices");
        }
        else
        {
            for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
        }
        
    }
    void Multiplymatrix()
    {
        if (a[1].length != b.length)
        {
            System.out.println("Can't multiply the matrix");
        }
        else
        {
            for (int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < b[1].length; j++)
                {
                    for (int k = 0; k < a[1].length; k++)
                    {

                        mul[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(mul[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}

class Integer_operations{
    void operations(int a , int b)
    {
        System.out.print("Add :");
        System.out.println(a+b);
        System.out.print("Sub :");
        System.out.println(a-b);
        System.out.print("Mul :");
        System.out.println(a*b);
        System.out.print("Div :");
        System.out.println((float)a/b);
    }
}
public class matrix {
    public static void main(String[] args) {
        Matrix_operations a = new Matrix_operations();
        System.out.println();
        a.Addmatrix();
        System.out.println();
        a.Multiplymatrix();
        Integer_operations b = new Integer_operations();
        System.out.println();
        b.operations(1, 2);
    }
    
}
