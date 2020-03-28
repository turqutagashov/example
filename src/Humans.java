public class Humans {

    String name;
    String surname;

    int age;
    int height;
    int weight;

    Humans(){
        System.out.println("Object is being created...");
    }

    void eating(){
        System.out.println("Eating...");
        weight += 1;
        height += 1;
    }

    void sleep(){
        System.out.println("Sleeping...");
    }

    void grow(){
        age += 1;
    }


}
