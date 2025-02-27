package Design_Patterns.Creational.Builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();

//        Builder builder = Student.getBuilder();
//        builder.setName("Jack");
//        builder.setAge(20);
//        builder.setCompany("Amazon");

//        Student st = builder.build();
//        System.out.println(st.toString());

        Student st = Student.getBuilder()
                .setName("Ron")
                .setCompany("Amazon")
                .setAge(22)
                .build();
    }
}
