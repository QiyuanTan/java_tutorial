public class Wcy_book{
    private String title;
    private int printed_year;
    private int num_of_pages;

    public Wcy_book (String title, int printed_year, int num_of_pages){
        this.title=title;
        this.printed_year=printed_year;
        this.num_of_pages=num_of_pages;
    }

    public void print_info(){
        System.out.println("Title:"+title);
        System.out.println("Printed year:"+ printed_year);
        System.out.println("Number of pages:"+num_of_pages);
    }
}