/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsultoriom;

/** 
 *
 * @author ulacit
 */
public class ProyectoConsultorioM {

    /**
     * @param args the command line arguments
     */
    public static Admin admin = new Admin();
    public static Doctor doctor;
    public static void main(String[] args) {
        //int id, String nombre, String sangre, int estatura, int peso
       
       ProyectoConsultorioM.admin.registrarDoctor("DocTest", 0, 0, 0, 0, "-O", "test", "123");
       ProyectoConsultorioM.admin.registrarPaciente(1, "Eduardo", "A+",0,0,0);
       Login login = new Login();
       login.setVisible(true);
       
        // TODO code application logic here
        /**Cola cola = new Cola();
        //int id, String fecha, String hora, String motivo
        Citas cita1 = new Citas(1,"hoy","12:00","Algo");
        Citas cita2 = new Citas(1,"hoy","01:00","Algo");
        Citas cita3 = new Citas(1,"hoy","24:00","Algo");
        Citas cita4 = new Citas(1,"mañana","06:00","Algo");
        
        cola.insertar(cita1);
        cola.insertar(cita2);
        cola.insertar(cita3);
        cola.insertar(cita4);
        cola.imprimir();
        
        Listas list = new Listas();
        //int id, String nombre, String sangre
        Paciente pac1 = new Paciente(1,"Juanito","B+");
        Paciente pac2 = new Paciente(2,"Juanita","A+");
        Paciente pac3 = new Paciente(3,"Juanitu","A-");
        Paciente pac4 = new Paciente(4,"Juaniti","B-");
        
        list.insertar(1, pac1);
        list.insertar(1, pac2);
        list.insertar(1, pac3);
        list.insertar(1, pac4);
        list.mostrar();
        
        ListasDobles ld = new ListasDobles();
        
        Recetario re1 = new Recetario(1,"Fume esto");
        Recetario re2 = new Recetario(2,"Fume y esto");
        Recetario re3 = new Recetario(3,"esto no");
        Recetario re4 = new Recetario(4,"Fume esto");
        
        ld.insertar(1, re4);
        ld.insertar(1, re3);
        ld.insertar(1, re2);
        ld.insertar(1, re1);
        ld.imprimir();
        
        
        //int id, String nombre, String sangre, int estatura, int peso
        Doctor doc1 = new Doctor(1,"Oscar","B+",173,100);
        Doctor doc2 = new Doctor(1,"Oscar2","B+",173,100);
        Doctor doc3 = new Doctor(1,"Oscar3","B+",173,67);
        Doctor doc4 = new Doctor(1,"Oscar4","B+",173,100);*/
        
    }
    
}
