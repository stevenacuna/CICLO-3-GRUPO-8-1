/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co;

import com.co.DAO.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author ArqStevenAcuñaEspino
 */

//Anotacion de contro --- clase controladora
@Controller
public class ControladorInicio {
    @Autowired
    private ClienteDAO clienteDao;
    
    //Mapeo con Get --- mostrar Pagina
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
    
    
    @GetMapping("/login")
    public String iniciosesion(){
        return "iniciosesion";
    }
    
    @GetMapping("/loginadmin")
    public String loginadmin(Model model){
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes",clientes);
        return "loginadmin";
    }
    
//        @GetMapping("/loginadmin")
//    public String loginadmin(){
//        return "loginadmin";
//    }
    
}
