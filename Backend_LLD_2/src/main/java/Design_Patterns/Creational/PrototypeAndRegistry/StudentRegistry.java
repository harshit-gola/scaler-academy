package Design_Patterns.Creational.PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> students;

    public StudentRegistry() {
        students = new HashMap<>();
    }

    public Student getStudent(String id) {
        return students.get(id).copy();
    }

    public void addStudent(String key, Student student) {
        students.put(key, student);
    }

    public void removeStudent(String key) {
        students.remove(key);
    }
}
