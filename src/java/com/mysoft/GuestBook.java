/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mysoft;

import java.sql.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yo
 */
public class GuestBook {

    /**
     * @param args the command line arguments
     */
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbx","root","root123");
              return connection;                    
    }
    
    public static List<Post> getAllPosts() throws SQLException, ClassNotFoundException {
        ArrayList<Post> posts = new ArrayList<>();
        try(Connection c = getConnection();
        ResultSet resultSet = c.createStatement().executeQuery("SELECT * FROM posts");) {
        while (resultSet.next()) {
            Post post = new Post();
            post.setId(resultSet.getInt("id"));
            post.setTxt(resultSet.getString("txt"));
            posts.add(post);
            
        }
        return posts;  
        }    
    }

    static void deletePost(int id) throws SQLException, ClassNotFoundException {
        try(Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement("DELETE FROM posts WHERE id=?");) {
        ps.setLong(1, id);

        ps.execute();    
        }          
    }
    
    public void addPost(Post p) throws SQLException, ClassNotFoundException {
        try(Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement("INSERT INTO posts(id, txt) VALUES (?,?)");) {
        ps.setLong(1, p.getId());
        ps.setString(2, p.getTxt());
        
        ps.execute();    
        } 
    }
    
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        System.out.println(getAllPosts());
    }
}
