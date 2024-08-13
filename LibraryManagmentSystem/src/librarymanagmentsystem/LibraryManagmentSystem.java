
package librarymanagmentsystem;
import java.util.Scanner;

public class LibraryManagmentSystem {

  public static void main(String[] args) 
	{
		Book book = new Book();
		book.setBookDetails("The Karamazov Brothers", "Fyodor Dostoyevsky", 180,  "9781511789240");
        
		book.displayDetails();
		System.out.println(book.getAuthor());
		
	    int librarySize = 5;
	    Book []library = new Book[librarySize];
	    
	    System.out.println("Enter details for " + librarySize + " books: ");
	    Scanner scan = new Scanner(System.in);
	    
	    for (int i =0; i< librarySize; i++)
	    {
	    	
	    	
	    	System.out.println("Book " + (i+1) +":");
	    	System.out.print("Title: ");
	    	
	    	String title = scan.nextLine();
	    	
	    	System.out.println();
	    	System.out.print("Author: ");
	    	String author = scan.nextLine();
	    	
	    	System.out.println();
	    	System.out.print("Year: ");
	    	int year = scan.nextInt();
	    	scan.nextLine();
	    	
	    	
	    	library[i] = new Book(title , author , year );
	    	
	    	
	    	
	    	
	    }
	    scan.close();
	    
	    
	    System.out.println("---------------------------------------------------------------");
	    for (Book elm : library )
	    {
	    	System.out.print("Book: ");
	    	elm.displayDetails();
	    	System.out.println();
	    }
	    
	}
    
}
