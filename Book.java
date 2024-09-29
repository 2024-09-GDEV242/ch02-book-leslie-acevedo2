/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Leslie Acevedo)
 * @version (September10,2024)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText; 
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        this.author = bookAuthor;
        this.title = bookTitle;
        this.pages = bookPages;
        this.courseText = isCourseText;
        this.refNumber = "";
    }

    // Add the methods here ...
    public String getAuthor() {
        return author;
    }
    public String getTitle (){
        return title;
    }
    public int getPages (){
        return pages;
    }
    public String getRefNumber() {
        return refNumber;
    }
    public int getBorrowed () {
        return borrowed;
    }
    public boolean isCourseText(){
        return courseText;
    }

    public void 
    setRefNumber(String ref) {
        if (ref.length() >=3) {
            this.refNumber = ref;
        } else {
            System.out.println("Error!");
        }
    }
    public void borrow() {
        this.borrowed++;
    }
    public void printAuthor() {
        System.out.println("Author:" + author);
    }
    public void printTitle() {
        System.out.println("Title:" + title);
    }
    public void printDetails() {
        String refNum = refNumber.isEmpty()? "ZZZ":refNumber;
        System.out.println("Title:" + title + ", Author: " + author + ", Pages: " + pages + ", RefNumber: " + refNum + ",Borrowed: " + borrowed);
    }
   
}



    
