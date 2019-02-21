package lv.homework1;

public class HumanTest {
    public static void main(String[] args) {

        Human human = new Human();
        human.setName ("John");
        human.setAge (20);

        human.greeting();

        String humanName = human.getName();
        int humanAge = human.getAge();

        System.out.println((" My name is " + humanName + ". " + "I am " + humanAge+ " years old"));

    }
}