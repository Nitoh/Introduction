package People;

public abstract class Human {
    private int age;
    private String name;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

}
