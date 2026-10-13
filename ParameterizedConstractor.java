public class ParameterizedConstractor {
    int height;
    int width;
    // Default Constractor. Jathane kono parameter ba argument thake na. Ata na korlao java compiler nijay kore nay.
    public ParameterizedConstractor(){
        height=100;
        width=200;
    }
//    Paramieterized constractor. 
    public ParameterizedConstractor(int h, int w){
        this.height=h;
        this.width=w;
    }

    public static void main(String[] args) {
        ParameterizedConstractor box1 = new ParameterizedConstractor();
        System.out.println(box1.height);
        System.out.println(box1.width);

        ParameterizedConstractor box2 =new ParameterizedConstractor(30, 45);
        System.out.println(box2.height);
        System.out.println(box2.width);
         
    }
    
}
