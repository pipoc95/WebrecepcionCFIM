/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.wbrecepcioncfim.logica;

import co.edu.sena.wbrecepcioncfim.logica.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Diego A Cuenca
 */
public class Controladora {
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void crearUser(User e){
        controladoraPersistencia.crearUser(e);
    }
    
    public List<User> consultarUsers(){
        return controladoraPersistencia.consultarUsers();
    }
}
