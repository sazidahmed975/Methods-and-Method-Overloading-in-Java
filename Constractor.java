public class Constractor {
    int x;

    
    public Constractor(){
        x=10;
    }

    public static void main(String[] args) {
        Constractor obj = new Constractor();

        System.out.println(obj.x);
    }
}