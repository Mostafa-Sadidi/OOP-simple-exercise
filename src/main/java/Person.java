public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public boolean isAdult(int age) {
        if (age < 18) {
            return false;
        }
        else {
            return true;
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (isAdult(age)) {
            System.out.println(name + " is adult? " + "Yes");
        }
        else {
            System.out.println(name + " is adult? " + "No");
        }
    }
}
