/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class FincaRaiz {
    
    private HashMap<String, Persona> personas;
    private HashMap<Integer, Inmueble> inmuebles;
    
    public FincaRaiz() {
        this.personas = new HashMap<>();
        this.inmuebles = new HashMap<>();
    }
    
    public HashMap<String, Persona> getPersonas() {
        return personas;
    }
    
    public void setPersonas(HashMap<String, Persona> personas) {
        this.personas = personas;
    }
    
    public HashMap<Integer, Inmueble> getInmuebles() {
        return inmuebles;
    }
    
    public void setInmuebles(HashMap<Integer, Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
    
    public void addPersona(String nombre, int dni, int edad, String sexo) {
        this.personas.put(nombre, new Persona(nombre, dni, edad, sexo));
        
    }
    
    public void delPersona(String nombre) {
        this.personas.remove(nombre);
        System.gc();
        
    }
    
    public String consultarPersona(String nombre) {
        return this.personas.get(nombre).toString();
        
    }
    
    public void modificarPersonaN(String nombre, String nuevoNombre) {
        Persona p = this.personas.get(nombre);
        p.setNombre(nuevoNombre);
        Persona c = p;
        this.personas.put(nuevoNombre, c);
        this.personas.remove(nombre);
        System.gc();
    }
    
    public void modificarPersonaDNI(String nombre, int dni) {
        Persona p = this.personas.get(nombre);
        p.setDni(dni);
    }
    
    public void modificarPersonaEdad(String nombre, int edad) {
        Persona p = this.personas.get(nombre);
        p.setEdad(edad);
    }
    
    public void modificarPersonaSexo(String nombre, String sexo) {
        Persona p = this.personas.get(nombre);
        p.setSexo(sexo);
    }
    
    public void addEdificio(String propietario, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida, boolean arrendado, int id) {
        this.inmuebles.put(id, new Edificio(propietario, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id));
    }
    
    public void addLocalComercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida, boolean arrendado, int id) {
        this.inmuebles.put(id, new LocalComercial(descripcion, viaPrincipal, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id));
    }
    
    public void addOficina(String tipo, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida, boolean arrendado, int id) {
        this.inmuebles.put(id, new Oficina(tipo, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id));
    }
    
    public void addPiso(int numOficinas, int area, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida, boolean arrendado, int id) {
        this.inmuebles.put(id, new Piso(numOficinas, area, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id));
    }
    
    public void modificarInmuebleId(int id, int nuevoId) {
        Inmueble i = this.inmuebles.get(id);
        i.setId(nuevoId);
        Inmueble j = i;
        this.inmuebles.put(nuevoId, j);
        this.inmuebles.remove(id);
        System.gc();
    }
    
    public void modificarInmuebleArrendado(int id, boolean arrendado) {
        Inmueble i = this.inmuebles.get(id);
        i.setArrendado(arrendado);
    }
    
    public void modificarInmuebleNombreBarrio(int id, String nombreBarrio) {
        Inmueble i = this.inmuebles.get(id);
        i.setNombreBarrio(nombreBarrio);
    }
    
    public void modificarInmuebleEstrato(int id, int estrato) {
        Inmueble i = this.inmuebles.get(id);
        i.setEstrato(estrato);
    }
    
    public void modificarInmuebleValorArriendo(int id, int valorArriendo) {
        Inmueble i = this.inmuebles.get(id);
        i.setValorArriendo(valorArriendo);
    }
    
    public void modificarInmuebleAreaConstruida(int id, int areaConstruida) {
        Inmueble i = this.inmuebles.get(id);
        i.setAreaConstruida(areaConstruida);
    }
    
    public void modificarLocalComercialDescripcion(int id, String descripcion) {
        Inmueble i = this.inmuebles.get(id);
        if (i instanceof LocalComercial) {
            LocalComercial l = (LocalComercial) i;
            l.setDescripcion(descripcion);
        }
        
    }
    
    public void modificarEdificioPropietario(int id, String propietario) {
        Inmueble i = this.inmuebles.get(id);
        if (i instanceof Edificio) {
            Edificio e = (Edificio) i;
            e.setPropietario(propietario);
        }
        
    }
    
    public void modificarLocalComercialViaPrincipal(int id, boolean viaPrincipal) {
        Inmueble i = this.inmuebles.get(id);
        if (i instanceof LocalComercial) {
            LocalComercial l = (LocalComercial) i;
            l.setViaPrincipal(viaPrincipal);
        }
        
    }
    
    public void modificarOficinaTipo(int id, String tipo) {
        Inmueble i = this.inmuebles.get(id);
        if (i instanceof Oficina) {
            Oficina o = (Oficina) i;
            o.setTipo(tipo);
        }
    }
    
    public void modificarPisoArea(int id, int area) {
        Inmueble i = this.inmuebles.get(id);
        if (i instanceof Piso) {
            Piso p = (Piso) i;
            p.setArea(area);
        }
    }
    
    public void consultarInmueble(int id) {
        this.inmuebles.get(id);
    }
    
    public void delInmueble(int id) {
        this.inmuebles.remove(id);
        System.gc();
    }
    
}
