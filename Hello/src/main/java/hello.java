import org.junit.Test;

public class hello {
    int age;
    String name;

    public hello(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public hello() {

    }

    @Override
    public String toString() {
        return "hello{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
