
package librarymanagmentsysytem;


public class Book extends LibraryItem
{
    private String isbn;
    
    public Book (String title , String author , int year , String isbn )
    {
        super(title , author , year );
        this.isbn = isbn ;
        
        
    }
    @Override
    public void displayInfo ()
    {
        super.displayInfo();
        System.out.println("ISBN: " + isbn );
       
    }
}
