
package com.mycompany.tareagrupalvigrupov;

import helpers.Persona;
import helpers.Doctor;
import helpers.Deportista;

public class TareagrupalVIGrupoV {

   public static void main(String[] args) {
        Doctor doctorM = new Doctor(" Dannel Mauricio "," Choluteca ", 40," Ortopeda ");
        Deportista deportistaN = new Deportista(" Cesar Rivera "," Choloma ", 24, " Tenis ");

        Persona[] personas = {doctorM, deportistaN};

        for (Persona persona : personas) {
            System.out.println(" Nombre: " + persona.getNombre());
            System.out.println(" Residencia: " + persona.getResidencia());
            System.out.println(" Edad: " + persona.getEdad());
            System.out.println(persona.getInformacionPersonal()+" \n ");
    
       
            
        }
        }
   }
