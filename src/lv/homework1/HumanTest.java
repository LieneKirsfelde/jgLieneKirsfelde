package lv.homework1;

//Ok
public class HumanTest {
    public static void main(String[] args) {

        Human human = new Human();
        human.setName("John"); //code-format
        human.setAge(20);

        human.greeting();

        String humanName = human.getName();  //šis mainīgie nav vajadzīgi
        int humanAge = human.getAge(); //šis mainīgie nav vajadzīgi

        // lietojam code-format "ctrl + alt + l"
        // var izvadīt izsaucot no objekta metodi
//        System.out.println((" My name is " + human.getName() + ". " + "I am " + human.getName() + " years old"));
        System.out.println((" My name is " + humanName + ". " + "I am " + humanAge + " years old"));

    }
}