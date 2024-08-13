
package connection;


public class SystemWork {

  
    public static void main(String[] args) 
    {
         ConnectionFactory factory = new ConnectionFactory();
        DatabaseConnection mysqlConnection = factory.createMySQLConnection();
        DatabaseConnection postgresConnection = factory.createPostgresConnection();

        
        mysqlConnection.connect();
        postgresConnection.connect();
    }
    
}
