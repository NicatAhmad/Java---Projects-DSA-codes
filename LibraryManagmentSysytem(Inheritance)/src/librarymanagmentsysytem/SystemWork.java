
package librarymanagmentsysytem;

public class SystemWork 
{
    public static void main(String[] args) 
    {
        Library library = new Library();
        
        Book book = new Book("The Karamazov Brothers", "Fyodor Dostoyevsky", 1880, "982753876257725");
        DVD dvd = new DVD("Inception", "Christopher Nolan", 2010, 148);
        
        library.addItem(book);
        library.addItem(dvd);
        
        library.displayAllitems();
    }
    
}
