package lv.homework1;

//Ok
public class Human {

    private int age;
    private String name;

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void greeting(){
        System.out.println("Hi!");
    }

}
