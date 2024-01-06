public class Dog {
    public String breed;
    private String size;
    String color;
    int age;
    public static String owner = "tqy";
    public Dog(String breed, String size, String color, int age){
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }
    public void bark(){
        System.out.println("dog "+breed+" woof");
    }
    public int get_age(){ // accessor
        return age;
    }
    public void set_age(int new_age){
        age = new_age;
    }
    public void change_owner(String new_owner){
        owner = new_owner;
    }
    public String get_owner(){
        return owner;
    }
}
