/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afifpermana.spring.core;

/**
 *
 * @author Apip
 */
public class Database {
    
    public static Database database;
    
    public static Database getInstance(){
        if (database ==== null) {
            database = new Database();
        }
        return database;
    }
    
    private Database(){
    }
}
