public class Area {
    public static int h =10;
    void calc(int l ,int b){
        h = 20;
        int u = l*b;
        System.out.println("the area is "+u);
        System.out.println(h);
    }
    public static void main (String[] args) {
        Area a = new Area();
        a.calc(2,3);
        System.out.println(h);
        System.out.println(h);
    }
}