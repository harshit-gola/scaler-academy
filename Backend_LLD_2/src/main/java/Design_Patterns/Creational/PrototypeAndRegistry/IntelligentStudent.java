package Design_Patterns.Creational.PrototypeAndRegistry;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public IntelligentStudent copy() {
        IntelligentStudent intelligentStudentCpy = new IntelligentStudent(this);
        return intelligentStudentCpy;
    }
}
