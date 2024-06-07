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
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ergul
 */

// User registration-login and score recording
public class Database {
    //Kullanıcı kayıt fonksiyonu
    public static Player register(String name, String email, char[] password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("kullanicilar.txt"))) {
            // File is read line by line and email is searched throughout the file. If it is found, this
            // means the email is used.
            String line;
            while ((line = reader.readLine()) != null) {
                String[] infos = line.split(";");
                if (infos[1].matches(email)) {
                    return null;
                }
            }
            // If email is available, then email, username, password and per-user UUID is saved to the file and
            // the corresponding class is created
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
        // This is for registered classes. File is read line by line and the credentials are searched.
        // If they are matched, then the corresponding class is retrieved.
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
    
    public static void registerScore(Player player, int score) {
        // File is opened, score is recorded as username, score ve (kept hidden from the UI) UUID
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(new File("skorlar.txt"), true), StandardCharsets.UTF_8))) {
            String line = player.getUsername() + ";" + String.valueOf(score) + ";" + player.getUniqueId();
            writer.println(line);
        } catch (FileNotFoundException ex) {
            String line = player.getUsername() + ";" + String.valueOf(score) + ";" + player.getUniqueId();
            try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(new File("skorlar.txt"), true), StandardCharsets.UTF_8))) {
                writer.println(line);
            } catch (FileNotFoundException ex1) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    // All the previous scores are retrieved to create a scoreboard
    public static ArrayList<Score> getScores() {
        ArrayList<Score> scores = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("skorlar.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(";");
                scores.add(new Score(record[0], Integer.parseInt(record[1]), record[2]));
            }
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Records are sorted
        Collections.sort(scores, Collections.reverseOrder());
        return scores;
    }
    
    
}
