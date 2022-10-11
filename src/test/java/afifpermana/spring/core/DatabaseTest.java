/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afifpermana.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Apip
 */
public class DatabaseTest {
    @Test
    void testSingleton(){
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();
        
        Assertions.assertSame(database1, database2);
    }
}
