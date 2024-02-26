public class Bubble_sort {
    public static void main(String[] args) {
        int a[]={20,40,10,30,50};
        int length = a.length;
        for (int i=0;i<length-1;i++)
        {
            for (int j=0;j<length-i-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int k=0;k<=length-1;k++)
        {
            System.out.println(a[k]);
        }
        
    }
}