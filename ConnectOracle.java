import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement;  

public class ConnectOracle {  
  
    public static void main(String[] args) {  
  
        try {  
            
             DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());//Register driver  
            
             System.out.println("Connecting to the database...");  
            
         Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");  
            
             Statement statement = connection.createStatement();  
             System.out.println("Hello");
             ResultSet resultset = statement.executeQuery("select * from emp");  
             System.out.println("Hello1");
 
             if(resultset.next())
              {  
                  System.out.println("Hello2");
 
                 String s = resultset.getString("name"); 
                 String s1 = resultset.getString("address"); 
                int s2=resultset.getInt("salary");
                 System.out.println(s+" "+s1+""+s2+"");  
                   
              } 
                 statement.close();  
                connection.close();
   
           }catch (Exception e) {  
            System.out.println("The exception raised is:" + e);  
        
            
        }  
     }  
  
  }  