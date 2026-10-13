
public class Maximum {

    void max(int a, int b) {
        System.out.println("Maximum: " + Math.max(a, b));
    }

    void max(int a, int b, int c) {
        System.out.println("Maximum: " + Math.max(a, Math.max(b, c)));
    }

    void max(double a, double b) {
        System.out.println("Maximum: " + Math.max(a, b));
    }

    public static void main(String[] args) {
        Maximum obj = new Maximum();

        obj.max(10, 20);
        obj.max(10, 30, 20);
        obj.max(10.5, 20.5);
    }
}

