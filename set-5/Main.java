public class Main {
    // This program handles the students data at EPCC.
    // Make sure the students information is safe and secure.
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        s.setAge(18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }

}

class Student {
    public String name;
    public int age;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }
}
