import java.rmi.server.SocketSecurityException;

public class Constractor {
    int x;
    int y;

    
    public Constractor(){
        x=10;
        y=90;
    }

    public static void main(String[] args) {
        Constractor obj = new Constractor();

        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}