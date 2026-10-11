public class Student {
    String name;
    int ID;
      void display(){
        System.out.println("Name Od the Student is = "+ name);
        System.out.println("Roll "+ ID);
      }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sazid Ahmed";
        s1.ID=439;
        s1.display();
    }
    
}
