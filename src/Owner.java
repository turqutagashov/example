public class Owner {
    String name;
    String gender;

    int age;

    void information(String name, String gender, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        if (gender.equals("male")) {
            System.out.println("Owner's name is " + name);
            System.out.println("He is " + age + " years old.");
        } else if (gender.equals("female")) {
            System.out.println("Owner's name is " + name);
            System.out.println("She is " + age + " years old.");
        }
    }

    void grow() {
        age++;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}