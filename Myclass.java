
class InnerMyclass {
    private int privateField;

    //constructor
    public InnerMyclass(int value)
    {
        this.privateField = value;
    }
    public void set (int a)
    {
        this.privateField = a;
    }
    public int get ()
    {
        return privateField;
    }
}

public class Myclass {

    public static void main(String[] args) {
        InnerMyclass objeMyclass = new InnerMyclass(10);
        int value = objeMyclass.get();
        System.out.println("The value of the variable now is :" + value);
        objeMyclass.set(20);
        value = objeMyclass.get();
        System.out.println("The value of the variable now is :" + value);

        
    }
}
