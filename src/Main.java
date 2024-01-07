public class Main {
    public static void main(String[] args){
        Book b = new TextBook("ap csa", 2023, 4654, "cas");
        System.out.println(b.get_info());
        Book c = new Book();
        System.out.println(c.get_info());
    }
}