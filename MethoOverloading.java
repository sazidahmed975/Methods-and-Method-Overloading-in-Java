 public class MethoOverloading {
 
    void sum(int num1, int num2){
        System.out.println("The Sum of two Number is = "+(num1+num2));
    }

    void sum(double num1, double num2){
        System.out.println("The Sum of two Number is = "+(num1+num2));
    }

     void sum(int num1, int num2 , int num3){
        System.out.println("The Sum of three Number is = "+(num1+num2+num3));
    }


    public static void main(String[] args) {
        MethoOverloading m1= new MethoOverloading();
        m1.sum(10, 20);
        m1.sum(10, 20, 30);
        m1.sum(10.5, 20.5);
    }
 }