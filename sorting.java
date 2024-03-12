class aglorithms{
    private void print_array (int a[])
    {
        System.out.print("[");
        for (int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+",");
        }
        System.out.print("]");
    }
    void bubble_sort (int a[])
    {
        for (int i=0;i<a.length-1;i++)
        {
            for (int j=0;j<a.length-i-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        print_array(a);
    }
    void insertion_sort (int a[])
    {
        for (int i=1;i<a.length;i++)
        {
            int number = a[i];
            int j=i-1;
            while (a[j]>=number && j>=0)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=number;
        }

        print_array(a);
    }
    void quick_sort (int a[], int s, int f)
    {
        int pivot = s;
        int left = s + 1;
        int right = f;
        int temp = 0;

        if (s >= f)
        {
            return;
        }
        else {
            while (left <= right)
            {
                while (left <= f && a[left] < a[pivot])
                {
                    left++;
                }
                while (right > s && a[right] > a[pivot])
                {
                    right--;
                }
                if (left <= right)
                {
                    temp = a[left];
                    a[left] = a[right];
                    a[right] = temp;
                }
            }
            temp = a[pivot];
            a[pivot] = a[right];
            a[right] = temp;

            pivot = right;

            quick_sort(a, s, pivot - 1);
            quick_sort(a, pivot + 1, f);
        }
        print_array(a);
    }
    void selection_Sort (int arr1[]){
        int n = arr1.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr1[j] < arr1[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr1[minIndex];
            arr1[minIndex] = arr1[i];
            arr1[i] = temp;
        }
        print_array(arr1);        
    }
    private void merge (int a[],int left[],int right[])
    {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
    void merge_sort (int a[])
    {
        if (a.length <=1)
        {
            return;
        }
        int middle = a.length/2;
        int left_array[] = new int[middle];
        int right_array[] = new int[a.length-middle];

        for (int i=0;i<a.length;i++)
        {
            if (i<middle)
            {
                left_array[i]=a[i];
            }
            else
            {
                right_array[i-middle]=a[i];
            }
        }
        merge_sort(left_array);
        merge_sort(right_array);
        merge(a, left_array, right_array);
        print_array(a);
    }
}

public class sorting {
    public static void main(String[] args) {
        int a[]={9,5,1,4,3};
        aglorithms x = new aglorithms();
        System.out.print("\nBubble sort: ");
        x.bubble_sort(a);
        System.out.print("\nInsertion sort: ");
        x.insertion_sort(a);
        System.out.print("\nQuick sort: ");
        x.quick_sort(a,0,a.length-1);
        System.out.print("\nselection sort: ");
        x.selection_Sort(a);
        System.out.print("\nmerge sort: ");
        x.merge_sort(a);
    }
}
