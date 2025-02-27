package Design_Patterns.Creational.PrototypeAndRegistry;

public class Student implements Prototype<Student> {
    int id;
    String name;
    int age;
    String batch;

    Student(int id, String name, int age, String batch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    Student(Student student){
        this.id = student.id;
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
    }

    @Override
    public Student copy() {
        Student studentCpy = new Student(this);
        return studentCpy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
