
package librarymanagmentsysytem;


public class LibraryItem {

  protected  String title;
  protected String authorOrDirector;
  protected int publicationYear;
  
  public LibraryItem (String title , String authorOrdirector , int publicationYear)
  {
      this.title = title;
      this.authorOrDirector = authorOrdirector;
      this.publicationYear = publicationYear;
      
  }
  
  public void displayInfo()
  {
      System.out.println("Title: " + title + "\n" + "Author: " + "\n" + "PublicationYear: " + publicationYear);
      
  }
  
  
  
  
    
}
