public class Main {
    // Make sure the students information is safe and secure.
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        s.setAge(18);
        System.out.println("Students name: " + s.getName());
        System.out.println("Students Age: " + s.getAge());
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
