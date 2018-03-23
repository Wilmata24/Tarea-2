/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import javax.swing.JOptionPane;

/**
 *
 * @author Wil
 */
public class Menu {
    public void menu(){
    String menu = "";
    
    Data data = new Data();
    String option = "";
    String typeOption = data.tipoUsuario();
    if (typeOption.equalsIgnoreCase("Bibliotecario"));
    String[] optionLibrarian = {"Agregar", "Modificar", "Eliminar"};
    String choiceLibrarian = (String) JOptionPane.showInputDialog(null,"Seleccione una opción: ", "Selección", JOptionPane.QUESTION_MESSAGE, null, optionLibrarian,optionLibrarian[0]);
            switch (choiceLibrarian){
                case "Agregar":
                    data.Lista();
                    break;
                case "Modificar":
                    data.modificaUsuario();
                    break;
                case "Eliminar":
                    data.eliminaUsuario();
                break;
                
               
            }
    
    
    
    
    
    
    }
    

}
