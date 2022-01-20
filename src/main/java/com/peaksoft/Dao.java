package com.peaksoft;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "12345";


    public static Connection connection() {
        Connection connection = null;
        try {
            String unl = null;
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server\n" +
                    "successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static List<City> printUsers() {
        List <City> list = new ArrayList<>();

        String SQL = "SELECT * FROM city";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                list.add( new City(
                        rs.getInt("id"),
                  rs.getString("name"),
                   rs.getString("population")));

            }
            return list;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;

    }
    public static List<Country> printUsers2() {
        List <Country> list = new ArrayList<>();

        String SQL = "SELECT * FROM country";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                list.add( new Country(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("population"),
                        rs.getString("population")));

            }
            return list;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;

}
    public static List<Mayors> printUsers3() {
        List <Mayors> list = new ArrayList<>();

        String SQL = "SELECT * FROM mayors";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                list.add( new Mayors(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("last_name"),
                        rs.getString("nation"),
                        rs.getString("adress")));

            }
            return list;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
}
public static void idchoose(int id)throws SQLException{
        try(PreparedStatement preparedStatement = connection().prepareStatement("select * from city where id = ?")){
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                int idd = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String population = resultSet.getString("population");
                System.out.println(idd);
                System.out.println(name);
                System.out.println(population);



            }

        }finally {
            connection().close();
        }



        }

}

