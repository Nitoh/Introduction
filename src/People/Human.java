package People;

public abstract class Human {
    private int age;
    private String name;
    private String gender;
    private String gattung = "Säugetier";

    public Human(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender() {
        return gender;
    }
}
