public class Book {
    private String title;
    private int printed_year;
    private int num_of_pages;

    public Book(String title, int printed_year, int num_of_pages){
        this.title=title;
        this.printed_year=printed_year;
        this.num_of_pages=num_of_pages;
    }

    public String print_info(){
        return "Title:"+title + "\nPrinted year:"+ printed_year + "\nNumber of pages:"+num_of_pages;
    }
}

