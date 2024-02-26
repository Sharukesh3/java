public class check_lower_trianguler {

    public static void main(String[] args) {
        int a[][] ={{1,0,0},{4,5,0},{7,8,9}};
        int n=3;
        boolean flag = true;
        for (int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (a[i][j] != 0)
                {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == false)
        {
            System.out.println("It is not a lower triangular matrix");
        }
        else
        {
            System.out.println("It is a lower triangular matrix");
        }
    }
}