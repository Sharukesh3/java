public class reverse_integer {

    public static void main(String[] args) {
        int a= 123;
        int b=0;
        int x=0;
        while (a>0)
        {
            x = a%10;
            b= b*10 + x;
            a=a/10;
        }
        System.out.println(b);
    }
}