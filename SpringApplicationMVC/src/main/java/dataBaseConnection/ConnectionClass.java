package dataBaseConnection;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionClass {
    //Will return Connection object
    public static Connection getConnection(){
        Connection connection = null;

        try(FileInputStream fileInputStream = new FileInputStream("D:\\onedrive\\OneDrive - nucleusonline\\SpringProject\\src\\main\\java\\day3\\que4\\connection\\dbconfig.properties")){
            //1- Load the driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Using properties file for database url,username and password
            Properties properties = new Properties();
            properties.load(fileInputStream);

            //2 - Define the connection
            connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}

