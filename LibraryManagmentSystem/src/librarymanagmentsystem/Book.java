
package librarymanagmentsystem;

public class Book 
{
    private String title ;
    private String author ;
    private int  publicationYear ;
    private String isbn ;
    
    
    public Book ()
    {
    	this.title="";
    	this.author="";
    	this.publicationYear=0;
    	this.isbn="";
    	
    }
    
    public Book (String title , String author , int year)
    {
    	this.title = title ;
    	this.author = author ;
    	this.publicationYear = year ;
    	
    }
    
    public void setBookDetails (final String title , final String author ,final int publicationYear , final String isbn )
    {
    	this.title = title;
    	this.author = author;
    	this.publicationYear = publicationYear;
    	this.isbn = isbn;
    	
    }
    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }
    
    public void displayDetails ()
    {
    	System.out.println("Title: " + title +"\n" + "Author: " + author+"\n" + "Publication Year: " + publicationYear + "\n" + "ISBN: " + isbn);
    }
    
    
}
