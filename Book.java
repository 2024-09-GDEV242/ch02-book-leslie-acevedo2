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
    private String refNumber = "";
    private int borrowed = 0;
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
        courseText = isCourseText;
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
    public boolean isCourseText(){
        return courseText;
    }
    public int getBorrowed () {
        return borrowed;
    }
    public String getRefNumber() {
        return refNumber;
    }
    
     public void printAuthor() {
        System.out.println("Author:" + author);
    }
    public void printTitle() {
        System.out.println("Title:" + title);
    }
    public void printPages() {
        System.out.println("Pages:" + pages);
    
        if(refNumber.length() > 0) {
            System.out.println("ReferenceNumber:" + refNumber);
        }
        else { System.out.println("Reference Number: ZZZ"); 
        }
        System.out.println("Borrowed: " + borrowed + "times");
        System.out.println("Course Text:" + (courseText ? "Yes" : "No"));
}
    public void 
    setRefNumber(String ref) {
    if (ref.length() >=3) {
        this.refNumber = ref;
    } else {
        System.out.println ("Error:Reference number must be at least 3 characters long.");
    }
}

    public void borrow() {
    borrowed++;
}
}



    
