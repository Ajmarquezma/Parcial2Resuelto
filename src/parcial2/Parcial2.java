/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import datos.Edificio;
import datos.FincaRaiz;
import datos.Inmueble;
import datos.LocalComercial;
import datos.Oficina;
import datos.Piso;
import java.io.IOException;
import logica.LogicaFincaRaiz;

/**
 *
 * @author Estudiante
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogicaFincaRaiz f = new LogicaFincaRaiz();
        
//metodo para cargar de archivo de texto
        f.cargar("Inmuebles.txt");
        
//metodo para listar inventario
        System.out.println(f.listarInmuebles());
        
        
        
        
//prueba

//        f.getFincaraiz().addOficina("a","mirandela" , 1, 10, 3, true, 1);
//        f.getFincaraiz().addOficina("b","birandela" , 2 ,20, 6, false, 2);
//        f.getFincaraiz().addLocalComercial("xd", true, "cirandela",4, 33, 2, true, 3);
//        f.getFincaraiz().addLocalComercial("sxd", false, "dirandela",6, 35, 5, false, 4);
//        f.getFincaraiz().addPiso(0, 10, "firandela", 2, 11,12, true, 5);
//        f.getFincaraiz().addPiso(0,34 ,"girandela", 4, 61,72, false, 6);
//        f.getFincaraiz().addEdificio("juan", "hirandela", 2, 22, 10, true, 7);
//        f.getFincaraiz().addEdificio("perez", "jirandela", 24,522, 106, false, 8);
//        
//        Edificio e = (Edificio) f.getFincaraiz().getInmuebles().get(8);
//        Edificio ed = (Edificio) f.getFincaraiz().getInmuebles().get(7);
//        Piso p = (Piso) f.getFincaraiz().getInmuebles().get(6);
//        Piso pe = (Piso) f.getFincaraiz().getInmuebles().get(5);
//        LocalComercial l= (LocalComercial) f.getFincaraiz().getInmuebles().get(4);
//        LocalComercial le= (LocalComercial) f.getFincaraiz().getInmuebles().get(3);
//        Oficina o= (Oficina) f.getFincaraiz().getInmuebles().get(2);
//        Oficina of= (Oficina) f.getFincaraiz().getInmuebles().get(1);
//        
//        ed.addLocalComercial("xd", true, "cirandela",4, 33, 2, true, 3);
//        ed.addOficina("b","birandela" , 2 ,20, 6, false, 2);
//        ed.addPiso(0,34 ,"girandela", 4, 61,72, false, 6);
//        ed.addPiso(0, 10, "firandela", 2, 11,12, false, 5);
//        p.addOficinas("b","birandela" , 2 ,20, 6, false, 2);
//        p.addOficinas("a","mirandela" , 1, 10, 3, true, 1);
//        System.out.println(e.noArrendados());
//        System.out.println(p.darInformacion()+ '\n');
//        System.out.println(e.darInformacion());
//        
//        for (Inmueble inmueble : f.getFincaraiz().getInmuebles().values()) {
//            System.out.println(inmueble.darInformacion());
//        }
        
//        try{
//        f.guardarTodo();
//        }catch(IOException ii){
//            System.err.println("error");
//        }
//        
        
        
        
    }
    
}
