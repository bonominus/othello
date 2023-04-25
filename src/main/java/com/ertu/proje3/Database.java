/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ertu.proje3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ergul
 */
public class Database {
    public static Player register(String name, String email, char[] password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("kullanicilar.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] infos = line.split(";");
                if (infos[1].matches(email)) {
                    return null;
                }
            }
            
            try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(new File("kullanicilar.txt"), true), StandardCharsets.UTF_8))) {
                line = name + ";" + email + ";" + String.valueOf(password) + ";" + UUID.randomUUID().toString();
                writer.println(line);
                return new Player(name, email, password);
            } catch (IOException ex1) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
            return new Player(name, email, password);
        } catch (FileNotFoundException ex) {
            String line = name + ";" + email + ";" + String.valueOf(password) + ";" + UUID.randomUUID().toString();
            try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(new File("kullanicilar.txt"), true), StandardCharsets.UTF_8))) {
                writer.println(line);
                return new Player(name, email, password);
            } catch (IOException ex1) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Player login(String email, char[] password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("kullanicilar.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] infos = line.split(";");
                if (infos[1].matches(email) && infos[2].matches(String.valueOf(password))) {
                    return new Player(infos[0], email, password, infos[3]);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
