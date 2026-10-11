public class SumofTwoNumbers {

    int num1;
    int num2;
     void display(){
        System.out.println("The sum of the two number is = "+(num1+num2));
     }
        public static void main(String[] args) {
            SumofTwoNumbers s1 = new SumofTwoNumbers();
            s1.num1 = 10;
            s1.num2=30;
            s1.display();
        }
}
