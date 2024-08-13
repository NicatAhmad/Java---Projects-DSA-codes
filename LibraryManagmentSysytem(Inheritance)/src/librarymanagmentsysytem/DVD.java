
package librarymanagmentsysytem;


public class DVD extends LibraryItem
{
    private int runTime ;
    
    public DVD(String title , String author , int year , int runTime )
    {
        super(title , author ,year );
        this.runTime = runTime;
        
    }
    @Override 
    public void displayInfo ()
    {
        super.displayInfo();
        System.out.println("Run time: " + runTime);
    }
}
