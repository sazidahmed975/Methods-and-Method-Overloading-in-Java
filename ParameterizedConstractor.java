public class ParameterizedConstractor {
    int height;
    int width;

    public ParameterizedConstractor(int h, int w){
        height=h;
        width=w;
    }

    public static void main(String[] args) {
        ParameterizedConstractor box1 = new ParameterizedConstractor(10, 20);
        System.out.println("The hight of the Bos is = "+ box1.height);
        System.out.println("The width of the Bos is = "+ box1.width);
    }
    
}
