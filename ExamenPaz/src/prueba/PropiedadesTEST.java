/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import datos.impl.PropiedadesDAOImpl;
import dominio.Propiedades;

public class PropiedadesTEST {
    public static void main(String[] args) {
        insertarPropiedades("Aceites","los mangos","bueno","optimo",15.0);
       actualizarPropiedades(4,"mermelada","casa","abc","falso",14.5);
        eliminarPropiedades(2);
    }
     private static void insertarPropiedades(String nombre,String direccion,String caracteristicas,String estado,Double precioalquiler){
        Propiedades obj=new Propiedades();
        PropiedadesDAOImpl datos=new PropiedadesDAOImpl();
        obj.setNombre(nombre);
        obj.setDireccion(direccion);
        obj.setCaracteristicas(caracteristicas);
        obj.setEstado(estado);
        obj.setPrecioalquiler(precioalquiler);
        boolean resp;
        resp=datos.insertar(obj);
        System.out.println("Insertado: "+resp);
    }
     private static void actualizarPropiedades(int id, String nombre, String direccion, String caracteristicas, String estado, Double precioalquiler) {
    Propiedades obj = new Propiedades();
    PropiedadesDAOImpl datos = new PropiedadesDAOImpl();
    obj.setId(id);  // Establecer el ID de la propiedad a actualizar
    obj.setNombre(nombre);
    obj.setDireccion(direccion);
    obj.setCaracteristicas(caracteristicas);
    obj.setEstado(estado);
    obj.setPrecioalquiler(precioalquiler);
    boolean resp;
    resp = datos.actualizar(obj);
    System.out.println("Actualizado: " + resp);
}
     private static void eliminarPropiedades(int id) {
    PropiedadesDAOImpl datos = new PropiedadesDAOImpl();
    boolean resp;
    resp = datos.eliminar(id);
    System.out.println("Eliminado: " + resp);
}
}
