public class check_upper_triangular {
    public static void main(String[] args) {
            int a[][] = {{1, 2, 3}, {0, 5, 6}, {0, 1, 9}};
            int n=3;
            boolean flag = true;
            for (int i=0;i<n-1;i++)
            {
                for (int j=i+1;j<n;j++)
                {
                    if (a[j][i] != 0)
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == false)
            {
                System.out.println("It is not a upper triangular matrix");
            }
            else
            {
                System.out.println("It is a upper triangular matrix");
            }
        }
}