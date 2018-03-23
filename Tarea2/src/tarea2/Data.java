/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Wil
 */
public class Data {
    
    static List<Usuario> list = new ArrayList<Usuario>();
    
    public void Lista(){
   Usuario us = new Usuario(ingresaUsuario(), nombreCompleto(), password(), tipoIdentificacion(), identificacion(), tipoUsuario());
   list.add(us);
//   JOptionPane.showMessageDialog(null, "Usuario ingresado");
      System.out.println(list);
    }
   
   public String nombreCompleto(){
       
           String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre completo");
           
           return nombre;
           
    }   
   
   public String ingresaUsuario(){
       
       String user = JOptionPane.showInputDialog(null, "Ingrese un usuario");
       
       return user;
   }
   
   public String password (){
       String pass = JOptionPane.showInputDialog(null, "Ingrese su contraseña");
        String passMD5=DigestUtils.md5Hex(pass); 
       return passMD5;
   }
 
   public String tipoIdentificacion (){
       String id= "";
       
       int option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para ejecutar una acción: \n 1. Nacional \n 2. Extranjero"));
       switch (option){
           case 1: 
               id = "Nacional";
               break;
               
           case 2:
               id = "Extranjero";
               
          default:
           JOptionPane.showMessageDialog(null, "Opción incorrecta");
       }
       
       return id;
   }
   
   public String identificacion(){
       String userId = JOptionPane.showInputDialog("Ingrese su identificación");
       
       return userId;
   }
   
   public String tipoUsuario(){
       String tipoUsuario = ""; 
       int tipo = Integer.parseInt(JOptionPane.showInputDialog(null,"Tipo de usuario: \n 1. Bibliotecario \n 2. Autor \n 3. Usuario" ));
       
       switch (tipo){
           case 1: 
               tipoUsuario = "Bibliotecario";
               break;
           case 2:
               tipoUsuario = "Autor";
               break;
           case 3:
               tipoUsuario = "Usuario";
               break;
               
           default: 
               JOptionPane.showMessageDialog(null, "Opción incorrecta");
       }
       return tipoUsuario;
   }
   
   public void agregaLista (){
       Usuario usuario = new Usuario(nombreCompleto(), ingresaUsuario(), password(), tipoIdentificacion(), identificacion(), tipoUsuario());
       list.add(usuario);
       
       for (int i= 0; i <list.size(); i++){
           for(Usuario u: list){
               System.out.println(u.getFullnames()+u.getId()+u.getPass() + u.getTypeid() + u.getTypeuser() + u.getUsernames());
           }
       }
   }
   
   public Usuario getUsuario(String user){
       for (int i = 0; i<list.size(); i++ ){
           Usuario us = (Usuario) list.get(i);
           if(us.getUsernames().equalsIgnoreCase(user)); 
       return us;
   }
   return null;
   }
   
   public boolean verificaUsuario (String user)
   {
       for (int i = 0; i <list.size(); i++){
           Usuario us = (Usuario) list.get(i);
           String verifica= us.getUsernames();
           if (verifica.equalsIgnoreCase(user)){
               return true;
           }
       }
       return false;
   }
   
   public void eliminaUsuario (){
       
       String eliminaAutor = JOptionPane.showInputDialog(null,"Ingrese el usuario a borrar");
       if(verificaUsuario(eliminaAutor)){
           Usuario us = getUsuario(eliminaAutor);
           list.remove(us);
           JOptionPane.showMessageDialog(null, "Usuario eliminado con éxito");
           
       }
       else
           JOptionPane.showInputDialog(null, "Usuario no encontrado");
       
       //System.out.println(list.toString());
       
   }
    
   public void modificaUsuario (){
       for (int i = 0; i < list.size(); i++ ){
           String nombreUsuario =  JOptionPane.showInputDialog("Ingrese el usuario a modificar");
           if(verificaUsuario(nombreUsuario)){
               String userNuevo = JOptionPane.showInputDialog(null, "Ingrese un nuevo usuario");
               Usuario userViejo = getUsuario(userNuevo);
               userViejo.setUsernames(userNuevo);
           }
       }
   }

}