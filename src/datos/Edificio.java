/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Edificio extends Inmueble {

    private String propietario;
    private ArrayList<Piso> pisos;
    private ArrayList<Local> locales;

    public Edificio(String propietario, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida, boolean arrendado, int id) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id);
        this.propietario = propietario;
        this.pisos = new ArrayList<>();
        this.locales = new ArrayList<>();
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }

    public ArrayList<Local> getLocales() {
        return locales;
    }

    public void setLocales(ArrayList<Local> locales) {
        this.locales = locales;
    }

    public void addPiso(int numOficinas, int area, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida, boolean arrendado, int id) {
        Piso piso = new Piso(numOficinas, area, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id);
        this.pisos.add(piso);

    }

    public void addLocalComercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida, boolean arrendado, int id) {
        LocalComercial local = new LocalComercial(descripcion, viaPrincipal, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id);
        this.locales.add(local);
    }

    public void addOficina(String tipo, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida, boolean arrendado, int id) {
        Oficina oficina = new Oficina(tipo, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id);
        this.locales.add(oficina);
    }

    public String noArrendados() {
        String pArrendados = "";
        String lArrendados = "";
        for (Piso piso : pisos) {
            if (piso.isArrendado() == false) {
                pArrendados += piso.darInformacion();
                pArrendados += '\n';
            }
        }
        for (Local local : locales) {
            if (local.isArrendado() == false) {
                lArrendados += local.darInformacion();
                lArrendados += '\n';
            }
        }
        return "Pisos no arrendados: " + '\n' + pArrendados + '\n' + "Locales no arrendados: " + '\n' + lArrendados;
    }

    @Override
    public String darInformacion() {
        String pisostring = "";
        for (Piso p : this.pisos) {
            pisostring +=  "eAdd";
            pisostring += p.darInformacion();
            pisostring+= super.getId()+ ",";
           
        }
        String localestring = "";
        for (Local l : this.locales) {
            localestring += "eAdd";
            localestring += l.darInformacion();
            localestring+= super.getId()+ ",";
            
        }
        return "Edificio,"+ super.getId() + "," + super.isArrendado() + "," + super.getNombreBarrio() + "," + super.getAreaConstruida() + "," + super.getEstrato() + "," + super.getValorArriendo() + "," + propietario +","+ pisostring + localestring;
    }

}
