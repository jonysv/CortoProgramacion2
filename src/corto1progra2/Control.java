/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corto1progra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class Control {
    ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    Estudiante obj;
    int contador=1; 

    public String Agregar(String nombre, String apellido, String grado, DefaultListModel modeloEstudiantes, JList listaEstudiantes) {//Metodo para agregar datos a la lista estudiantes
      
        String carnet = "";
       
            carnet = carnet + nombre.toUpperCase().charAt(0) + apellido.toUpperCase().charAt(0) + this.contador;//Generador de carnet
            contador++;
        obj = new Estudiante(nombre, apellido, grado, carnet);
        estudiantes.add(obj);
        this.Ordenar(modeloEstudiantes, listaEstudiantes);
        return carnet;
    }

    public void Ordenar(DefaultListModel modeloEstudiantes, JList listaEstudiantes) {//Metodo para ordenar la lista
        //Establecer comparador para ordenar de la A a la Z los elementos de la lista
        Collections.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        //Fin establecer comparador para ordenar de la A a la Z los elementos de la lista

        modeloEstudiantes.removeAllElements();//Elimina los elementos del modelo de la lista

        //Agregar elementos del ArrayList estudiantes al modelo de la lista estudiantes
        for (int i = 0; i < estudiantes.size(); i++) {
            modeloEstudiantes.addElement(estudiantes.get(i).getNombre() + "   " + estudiantes.get(i).getApellido() + "   " + estudiantes.get(i).getCarnet());
        }

        listaEstudiantes.setModel(modeloEstudiantes);
        //Fin agregar elementos del ArrayList estudiantes al modelo de la lista estudiantes

    }

    public String eliminar(String carnet, DefaultListModel modeloEstudiantes, JList listaEstudiantes) {//Metodo para eliminar registros del ArrayList estudiantes
        boolean existe = false;
        String resultado = "";
       
        if (estudiantes.size() > 0) {//Este if valida si es posible eliminar registros. Si el tamaño del ArrayList es mayor que 0 hay registros que pueden eliminarse
            for (int contador = 0; contador < estudiantes.size(); contador++) {//Este for sirve para comparar los elementos "carnet" del ArrayList con el parámetro carnet
                if (estudiantes.get(contador).getCarnet().equals(carnet)) {//Si existe un carnet igual al parámetro carnet en el arrayList elimina el registro
                    existe = true;
                    resultado = "eliminado:" + estudiantes.get(contador).getNombre() + " " + estudiantes.get(contador).getApellido() + " " + estudiantes.get(contador).getCarnet();
                    
                    estudiantes.remove(contador);//Elimina el registro
                    this.Ordenar(modeloEstudiantes, listaEstudiantes);//Ordena la lista
                }
            }
            if (existe == false) {//Si no existe el carnet ingresado en el ArrayList envía un mensaje de error
                JOptionPane.showMessageDialog(null, "El carnet ingresado no se encuentra registrado.");
                resultado = "";
            }
        } else {//Si el tamaño de la lista es igual a 0 envía un mensaje de error
            JOptionPane.showMessageDialog(null, "No hay datos registrados que puedan ser eliminados.");
            resultado = "";
        }
        return resultado;

    }

    public String buscar(String carnet) {//Método para buscar estudiante
        String resultado = "";
        boolean existe = false;
        if (estudiantes.size() > 0) {//Este if valida si es posible buscar registros. Si el tamaño del ArrayList es mayor que 0 hay registros que pueden buscarse
            for (int contador = 0; contador < estudiantes.size(); contador++) {//Este for sirve para comparar los elementos "carnet" del ArrayList con el parámetro carnet
                if (estudiantes.get(contador).getCarnet().equals(carnet)) {//Busca el registro comparando el parámetro carnet con el elemento carnet del ArrayList
                    existe = true;
                    resultado = "Estudiante con carnet " + estudiantes.get(contador).getCarnet() + "  " + estudiantes.get(contador).getNombre() + "  " + estudiantes.get(contador).getApellido();//Guarda los datos del estudiante bucado en una variable tipo String
                JOptionPane.showMessageDialog(null,resultado);
                }
            }
            if (existe == false) {//Si no existe el carnet ingresado en el ArrayList envía un mensaje de error
                JOptionPane.showMessageDialog(null, "El carnet ingresado no se encuentra registrado.");
                resultado = "";
            }
        } else {//Si el tamaño de la lista es igual a 0 envía un mensaje de error
            JOptionPane.showMessageDialog(null, "No hay datos registrados que puedan ser buscados.");
            resultado = "";
        }
        return resultado;
    }

    public String editar(String carnet, DefaultListModel modeloEstudiantes, JList listaEstudiantes) {//Método para editar registros
        boolean existe = false;
        int posicion=0;
        String mensaje="";
        String nombreActual = "", apellidoActual = "", nuevoCarnet = "", nuevoNombre = "", nuevoApellido = "",numeroCarnet="";
        if (estudiantes.size() > 0) {//Este if valida si es posible editar registros. Si el tamaño del ArrayList es mayor que 0 hay registros que pueden buscarse
            for (int contador = 0; contador < estudiantes.size(); contador++) {//Este for sirve para comparar los elementos "carnet" del ArrayList con el parámetro carnet
                if (estudiantes.get(contador).getCarnet().equals(carnet)) {//Busca el registro comparando el parámetro carnet con el elemento carnet del ArrayList
                    existe = true;
                    posicion=contador;
                    nombreActual = nombreActual + estudiantes.get(contador).getNombre();
                    apellidoActual = apellidoActual + estudiantes.get(contador).getApellido();
                }
            }
            if (existe == false) {//Si no existe el carnet ingresado en el ArrayList envía un mensaje de error
                JOptionPane.showMessageDialog(null, "El carnet ingresado no se encuentra registrado.");
            }
        } else {//Si el tamaño de la lista es igual a 0 envía un mensaje de error
            JOptionPane.showMessageDialog(null, "No hay datos registrados que puedan ser buscados.");
        }
        if(existe==true){
        //Permitir al usuario editar nombre y apellido
        nuevoNombre = JOptionPane.showInputDialog("Nombre actual: " + nombreActual + "\nIngrese el nuevo nombre: ");
        nuevoApellido = JOptionPane.showInputDialog("Apellido actual: " + apellidoActual + "\nIngrese el nuevo apellido: ");
        //Fin permitir al usuario editar nombre y apellido
        
        
        //Generar nuevo carnet
        for(int contador=2;contador<carnet.length();contador++){
            numeroCarnet=numeroCarnet+carnet.charAt(contador);//Guarda el numero del carnet ya que lo único que cambia son las letras
        }
        nuevoCarnet=String.valueOf(nuevoNombre.toUpperCase().charAt(0))+String.valueOf(nuevoApellido.toUpperCase().charAt(0))+numeroCarnet+"";//Genera nuevo carnet tomando la primera letra del nombre y el apellido y el número del carnet guardado
        //Fin generar nuevo carnet
        
        //Creando objeto estudiante
        Estudiante obj = new Estudiante(nuevoNombre, nuevoApellido, "", nuevoCarnet);
        //Fin creando objeto estudiante
        
        //Agregar registro editado en el arrayList y ordenarlo
        estudiantes.set(posicion, obj);
        this.Ordenar(modeloEstudiantes, listaEstudiantes);
        mensaje="Registro editado con éxito.";
        //Fin agregar registro editado en el ArrayList y ordenarlo
        }
        return mensaje;
    }
}
