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
    private String refNumber = "refNumber";
    private int borrowed;
    private boolean courseText; 
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = isCourseText
    }

    // Add the methods here ...
    public String getAuthor(){
        return author;
    }
    public String getTitle (){
        return title;
    }
    public int getPages (){
        return pages;
    }
    public void printAuthor (){
        System.out.println("Author:" + author);
    }
    public void printTitle() {
        System.out.println("Title:" + title);
    }
    public void printDetails(){
        System.out.println("Title:"+ title + ",Author" + author + "Pages" + pages);
    }
    if (refNumber.length() > 0)

    {System.outprintln("ReferenceNumber:" + refNumber);
}
else { 
