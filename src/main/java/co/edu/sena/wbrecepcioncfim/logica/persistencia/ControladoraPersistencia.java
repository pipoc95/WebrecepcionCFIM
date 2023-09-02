/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.wbrecepcioncfim.logica.persistencia;

import co.edu.sena.wbrecepcioncfim.logica.User;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego A Cuenca
 */
public class ControladoraPersistencia {
    UsersJpaController usersJpaController = new UsersJpaController();
  
    public void crearUser(User e){
        
        try {
            usersJpaController.create(e);    
        } catch (Exception ex){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public List<User> consultarUsers(){
        
        return usersJpaController.findUsersEntities();
    }
    
}
