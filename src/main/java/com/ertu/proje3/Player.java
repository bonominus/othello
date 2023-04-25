/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ertu.proje3;

import java.util.UUID;

/**
 *
 * @author ergul
 */
public class Player {
    private String username;
    private String email;
    private char[] password;
    private String unique_id;
    
    public Player(String name, String email, char[] password) {
        username = name;
        this.email = email;
        this.password = password;
        this.unique_id = UUID.randomUUID().toString();
    }
    
    public Player(String name, String email, char[] password, String id) {
        username = name;
        this.email = email;
        this.password = password;
        this.unique_id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getUniqueId() {
        return unique_id;
    }
    
    
}
