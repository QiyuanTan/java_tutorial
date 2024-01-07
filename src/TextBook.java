public class TextBook extends Book{
    private String subject;
    public TextBook(String title, int printed_year, int num_of_pages, String subject){
        super(title, printed_year, num_of_pages);
        this.subject = subject;
    }
    public String get_info(){
        return super.get_info() + "\nsubject:" + subject;
    }
}
