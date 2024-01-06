public class Human {
    // an example of objet oriented programming(面向对象编程)
    // attributes
    private final String gender;
    private double height;
    private int age;
    private String race;
    public static int age_of_the_earth = 5000;
    public Human(String gender, double height, int age, String race){ //constructor(构造器)
        this.gender = gender;
        this.height = height;
        this.age = age;
        this.race = race;
    }
    public void birthday(){
        age++;
    }
    public void change_gender(String new_gender){
        // gender = new_gender; 会报错，无法修改final变量
    }
    public void new_year(){
        age_of_the_earth ++;
        birthday();
    }
}
