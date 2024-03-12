class search_algo{
    void normal_search (int a[],int n)
    {
        for(int i=0;i<a.length;i++)
        {
            if (a[i] == n)
            {
                System.out.println("The location of the element is: " + (i+1));
                return;
            }
        }
        System.out.println("Element not present in the array");
    }

    void binary_search (int a[],int s,int f,int n)
    {
        int i = (s+f)/2;
        if (a[i] ==  n)
        {
            System.out.println("The location of the element is: " + (i+1));
            return;
        }
        else if (n<a[i])
        {
            binary_search(a, 0, i-1, n);
        }
        else if (n<a[s] || n>a[f])
        {
            System.out.println("Element not present in the array");
        }
        else
        {
            binary_search(a, i+1, f, n);
        }
    }
}
public class search {
    public static void main(String[] args) {
        int a[] = {9,5,1,4,3};
        search_algo b = new search_algo();
        b.normal_search(a, 2);
        b.binary_search(a, 0, a.length, 2);
    }
}
