/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mysoft;

/**
 *
 * @author yo
 */
public class Post {
    long id;
    String txt;

    @Override
    public String toString() {
        return "Post{" + "id=" + id + ", txt=" + txt + '}';
    }   
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
    
    
}
