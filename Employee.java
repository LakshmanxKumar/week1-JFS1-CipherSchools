package week1;

public class Employee {

    int id;
    String name;
    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
    public static void main(String[] args) {
        Employee e1=new Employee(1101,"Mark");
        System.out.println(e1.name);
    }
}
