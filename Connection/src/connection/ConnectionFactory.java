
package connection;


class ConnectionFactory {
   
    public DatabaseConnection createMySQLConnection() {
        return new MySqlConnection();
    }

    
    public DatabaseConnection createPostgresConnection() {
        return new PostgresConnection();
    }
}