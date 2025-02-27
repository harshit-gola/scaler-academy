package Design_Patterns.Creational.PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        Student mar25Student = new Student(0, "Temp name", 23, "Mar 25");
        studentRegistry.addStudent("Mar 25", mar25Student);

        Student newMar25Student = studentRegistry.getStudent("Mar 25");
        newMar25Student.setName("John");
        newMar25Student.setAge(23);
    }
}
