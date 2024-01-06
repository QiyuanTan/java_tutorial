public class Main {
    public static void main(String[] args){
        Dog a = new Dog("斗牛犬", "大", "浅灰色", 5);
        Dog b = new Dog("小猎犬", "大", "橘色", 6);
        Dog c = new Dog("德国牧羊犬", "大", "白色&橘色", 6);
        System.out.println(Dog.owner);
    }
}