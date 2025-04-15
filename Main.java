
public class Main {

    public static void main(String[] args) {
        Person a = new Person();
        a.setName("CJ");
        
        System.out.println(a.getName());

        Student p = new Student();
        p.setName("Raffi");
        p.setIDnumber("1234567890");

        System.out.println(p.getName() + " " + p.getIDnumber());
    }
}
