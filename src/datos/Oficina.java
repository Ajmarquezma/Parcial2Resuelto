/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Estudiante
 */
public class Oficina extends Local {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Oficina(String tipo, String nombreBarrio, int estrato, int valorArriendo, int areaConstruida, boolean arrendado, int id) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id);
        this.tipo = tipo;
    }
    

    

  

    @Override
    public String darInformacion() {
        return "Oficina," + super.getId() + "," + super.isArrendado()+ "," + super.getNombreBarrio()+ "," + super.getAreaConstruida() + "," + super.getEstrato() + "," + super.getValorArriendo() + "," + tipo + ",";
    }
    
}
