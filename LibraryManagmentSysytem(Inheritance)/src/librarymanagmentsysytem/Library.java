
package librarymanagmentsysytem;

import java.util.ArrayList;


public class Library 
{
    private ArrayList<LibraryItem> items;
    
    public Library()
    {
        items = new ArrayList<LibraryItem>();
        
    }
    
    public void addItem (LibraryItem item )
    {
        items.add(item);
        
    }
    
    public void displayAllitems ()
    {
        for (LibraryItem item : items )
        {
          item.displayInfo();
            System.out.println("------------------------------------------");
        }
    }
}
