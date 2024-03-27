class BinaryTreeArray{
    void inorder(int arr[] , int i,int n)
{
    if (i>n)
    {
        return;
    }
    inorder(arr , 2*i+1,n);
    System.out.println(arr[i]);
    inorder(arr , 2*i+2,n);
}
void preorder(int arr[] , int i,int n)
{
    if (i>n)
    {
        return;
    }
    System.out.println(arr[i]);
    preorder(arr , 2*i+1,n);
    preorder(arr , 2*i+2,n);
}
void postorder(int arr[] , int i,int n)
{
    if (i>n)
    {
        return;
    }
    postorder(arr , 2*i+1,n);
    postorder(arr , 2*i+2,n);
    System.out.println(arr[i]);
}
void maximum(int arr[])
{
    int max = -1000;
    for(int i=0;i<arr.length;i++)
    {
        if (arr[i]>max)
        {
            max=arr[i];
        }
    }
    System.out.println("\nThe maximum element is " + max);
}
void minimum(int arr[])
{
    int min = 1000;
    for(int i=0;i<arr.length;i++)
    {
        if (arr[i]<min)
        {
            min=arr[i];
        }
    }
    System.out.println("\nThe minimum element is " + min);
}
void root(int arr[])
{
    System.out.println("The root of the binary tree is " + arr[0] );
}
}
class BinarySearchTreeArray extends BinaryTreeArray{
    @Override
    void maximum(int arr[])
    {
        int i=0;
        while (2*i+2<arr.length)
        {
            i=2*i+2;
        }
        System.out.println("\nThe maximum element is " + arr[i]);
    }

    @Override
    void minimum(int arr[])
    {
        int i=0;
        while (2*i+1<arr.length)
        {
            i=2*i+1;
        }
        System.out.println("The minimum element is " + arr[i]);
    }
}
public class BinaryTreeDriver {
    public static void main(String[] args) {
        BinaryTreeArray a = new BinaryTreeArray();
        int tree[] = {100,20,200,10,30,150,300};
        System.out.println("In order");
        a.inorder(tree,0,tree.length-1);
        System.out.println("\npre order");
        a.preorder(tree,0,tree.length-1);
        System.out.println("\npost order");
        a.postorder(tree,0,tree.length-1);
        a.maximum(tree);
        a.minimum(tree);
        a.root(tree);
        System.out.println("Now for binary search tree ");
        BinarySearchTreeArray b = new BinarySearchTreeArray();
        b.maximum(tree);
        b.minimum(tree);
    }
    
}