package Design_Patterns.Creational.Builder;

public class Student {
    private String name;
    private int age;
    private String company;
    private double salary;

    public static class Builder {
        private String name;
        private int age;
        private String company;
        private double salary;

        public Student build() {
            // validations can go here
            if (this.getAge() > 20) {
                throw new IllegalArgumentException("Age must be less than 20");
            }
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getCompany() {
            return company;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public double getSalary() {
            return salary;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }
    }

    private Student(Builder builder) {
        // validations go here or move to build method of Builder inner class

        this.name = builder.getName();
        this.age = builder.getAge();
        this.company = builder.getCompany();
        this.salary = builder.getSalary();
    }

    public static Builder getBuilder() {
        return new Builder();
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
