import java.util.*;
import java.sql.*;


class Main {
    private static final String url ="jdbc:mysql://localhost:3306/mydb";
    private static final String username ="root";
    private static final String password ="";

    public static void main(String[] agrs) {

//        System.out.println("Sant Rampal Ji Maharaj Ji Blessing Me");
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");

       } catch (ClassNotFoundException e){
           System.out.println(e.getMessage());
       }


           try {
               Connection connection = DriverManager.getConnection(url, username, password);

               Statement statement = connection.createStatement();

               String query =  String.format( "UPDATE student SET marks = %d WHERE id = %d", 30, 2);


               int rowaffeted = statement.executeUpdate(query);

               if(rowaffeted > 0){

                   System.out.println("Data updated successfully");

               } else {
                   System.out.println("Failed to insert row");
               }

//               String Query = "select * from student";
//
//               ResultSet resultSet = statement.executeQuery(Query);
//               while(resultSet.next()){
//                   int id = resultSet.getInt("id");
//                   String name = resultSet.getString("name");
//                   int age= resultSet.getInt("age");
//                   double marks = resultSet.getDouble("marks");
//
//                   System.out.println( "ID "+id);
//                   System.out.println( "Name "+name);
//                   System.out.println( "Age "+age);

               //}

           } catch (SQLException e) {
               System.out.println(e.getMessage());

           }
       }
    }



