/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Edificio;
import datos.FincaRaiz;
import datos.Inmueble;
import datos.Piso;
import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author FLIA. ESCAMAL
 */
public class LogicaFincaRaiz {

    private FincaRaiz fincaraiz;

    public LogicaFincaRaiz() {
        this.fincaraiz = new FincaRaiz();
    }

    public FincaRaiz getFincaraiz() {
        return fincaraiz;
    }

    public void setFincaraiz(FincaRaiz fincaraiz) {
        this.fincaraiz = fincaraiz;
    }

    public void guardarTodo() throws IOException {
        File cu = new File("Inmuebles.txt");
        if (!(cu.exists())) {
            cu.createNewFile();
        }

        PrintWriter inm = new PrintWriter(new FileWriter(cu, false));
        inm.println(listarInmuebles());
        inm.close();
    }

    public String listarInmuebles() {
        String listaInmuebles = "";
        for (Inmueble inmueble : this.fincaraiz.getInmuebles().values()) {
            listaInmuebles += inmueble.darInformacion();
            listaInmuebles += '\n';
        }
        return listaInmuebles;
    }

    public void cargar(String ruta) {

        File lectura = new File(ruta);
        Scanner flujoEntrada = null;
        if (lectura.exists()) {
            try {
                flujoEntrada = new Scanner(lectura);
                flujoEntrada.useDelimiter(",");
                String nombreBarrio;
                int estrato;
                int valorArriendo;
                int areaConstruida;
                boolean arrendado;
                int id;
                String inmueble;
                while (flujoEntrada.hasNext()) {
                    inmueble = flujoEntrada.next().trim();
                    switch (inmueble) {
                        case "Oficina": {
                            String tipo;
                            String ids = flujoEntrada.next().trim();
                            id = Integer.parseInt(ids);
                            String arrendados = flujoEntrada.next().trim();
                            arrendado = Boolean.parseBoolean(arrendados);
                            nombreBarrio = flujoEntrada.next().trim();
                            String areaConstruidas = flujoEntrada.next().trim();
                            areaConstruida = Integer.parseInt(areaConstruidas);
                            String estratos = flujoEntrada.next().trim();
                            estrato = Integer.parseInt(estratos);
                            String valorArriendos = flujoEntrada.next().trim();
                            valorArriendo = Integer.parseInt(valorArriendos);
                            tipo = flujoEntrada.next();
                            fincaraiz.addOficina(tipo, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id);
                            break;
                        }
                        case "LocalComercial": {
                            String descripcion;
                            boolean viaPrincipal;
                            String ids = flujoEntrada.next().trim();
                            id = Integer.parseInt(ids);
                            String arrendados = flujoEntrada.next().trim();
                            arrendado = Boolean.parseBoolean(arrendados);
                            nombreBarrio = flujoEntrada.next().trim();
                            String areaConstruidas = flujoEntrada.next().trim();
                            areaConstruida = Integer.parseInt(areaConstruidas);
                            String estratos = flujoEntrada.next().trim();
                            estrato = Integer.parseInt(estratos);
                            String valorArriendos = flujoEntrada.next().trim();
                            valorArriendo = Integer.parseInt(valorArriendos);
                            descripcion = flujoEntrada.next().trim();
                            String viaPrincipals = flujoEntrada.next().trim();
                            viaPrincipal = Boolean.parseBoolean(viaPrincipals);
                            fincaraiz.addLocalComercial(descripcion, viaPrincipal, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id);
                            break;
                        }
                        case "Piso": {
                            int numOficinas;
                            int area;
                            String ids = flujoEntrada.next().trim();
                            id = Integer.parseInt(ids);
                            String arrendados = flujoEntrada.next().trim();
                            arrendado = Boolean.parseBoolean(arrendados);
                            nombreBarrio = flujoEntrada.next().trim();
                            String areaConstruidas = flujoEntrada.next().trim();
                            areaConstruida = Integer.parseInt(areaConstruidas);
                            String estratos = flujoEntrada.next().trim();
                            estrato = Integer.parseInt(estratos);
                            String valorArriendos = flujoEntrada.next().trim();
                            valorArriendo = Integer.parseInt(valorArriendos);
                            String areas = flujoEntrada.next().trim();
                            area = Integer.parseInt(areas);
                            String numOficinass = flujoEntrada.next().trim();
                            numOficinas = Integer.parseInt(numOficinass);
                            this.fincaraiz.addPiso(numOficinas, area, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id);
                            Piso p = (Piso) this.fincaraiz.getInmuebles().get(id);

                            break;
                        }
                        case "pAddOficina": {

                            String tipo;

                            String ids2 = flujoEntrada.next().trim();
                            int id2 = Integer.parseInt(ids2);
                            String arrendados2 = flujoEntrada.next().trim();
                            boolean arrendado2 = Boolean.parseBoolean(arrendados2);
                            String nombreBarrio2 = flujoEntrada.next().trim();
                            String areaConstruidas2 = flujoEntrada.next().trim();
                            int areaConstruida2 = Integer.parseInt(areaConstruidas2);
                            String estratos2 = flujoEntrada.next().trim();
                            int estrato2 = Integer.parseInt(estratos2);
                            String valorArriendos2 = flujoEntrada.next().trim();
                            int valorArriendo2 = Integer.parseInt(valorArriendos2);
                            String tipo2 = flujoEntrada.next();
                            String idDueños = flujoEntrada.next();
                            int idDueño = Integer.parseInt(idDueños);

                            Piso p = (Piso) fincaraiz.getInmuebles().get(idDueño);
                            p.addOficinas(tipo2, nombreBarrio2, estrato2, valorArriendo2, areaConstruida2, arrendado2, id2);

                            break;
                        }

                        case "Edificio": {
                            String propietario;
                            String ids = flujoEntrada.next().trim();
                            id = Integer.parseInt(ids);
                            String arrendados = flujoEntrada.next().trim();
                            arrendado = Boolean.parseBoolean(arrendados);
                            nombreBarrio = flujoEntrada.next().trim();
                            String areaConstruidas = flujoEntrada.next().trim();
                            areaConstruida = Integer.parseInt(areaConstruidas);
                            String estratos = flujoEntrada.next().trim();
                            estrato = Integer.parseInt(estratos);
                            String valorArriendos = flujoEntrada.next().trim();
                            valorArriendo = Integer.parseInt(valorArriendos);
                            propietario = flujoEntrada.next().trim();
                            this.fincaraiz.addEdificio(propietario, nombreBarrio, estrato, valorArriendo, areaConstruida, arrendado, id);
                            Edificio e = (Edificio) this.fincaraiz.getInmuebles().get(id);

                            break;
                        }
                        case "eAddOficina": {

                            String tipo;

                            String ids2 = flujoEntrada.next().trim();
                            int id2 = Integer.parseInt(ids2);
                            String arrendados2 = flujoEntrada.next().trim();
                            boolean arrendado2 = Boolean.parseBoolean(arrendados2);
                            String nombreBarrio2 = flujoEntrada.next().trim();
                            String areaConstruidas2 = flujoEntrada.next().trim();
                            int areaConstruida2 = Integer.parseInt(areaConstruidas2);
                            String estratos2 = flujoEntrada.next().trim();
                            int estrato2 = Integer.parseInt(estratos2);
                            String valorArriendos2 = flujoEntrada.next().trim();
                            int valorArriendo2 = Integer.parseInt(valorArriendos2);
                            String tipo2 = flujoEntrada.next();
                            String idDueños = flujoEntrada.next();
                            int idDueño = Integer.parseInt(idDueños);

                            Edificio e = (Edificio) fincaraiz.getInmuebles().get(idDueño);
                            e.addOficina(tipo2, nombreBarrio2, estrato2, valorArriendo2, areaConstruida2, arrendado2, id2);

                            break;
                        }
                        case "eAddLocalComercial": {
                            String descripcion;
                            boolean viaPrincipal;

                            String ids4 = flujoEntrada.next().trim();
                            int id4 = Integer.parseInt(ids4);
                            String arrendados4 = flujoEntrada.next().trim();
                            boolean arrendado4 = Boolean.parseBoolean(arrendados4);
                            String nombreBarrio4 = flujoEntrada.next().trim();
                            String areaConstruidas4 = flujoEntrada.next().trim();
                            int areaConstruida4 = Integer.parseInt(areaConstruidas4);
                            String estratos4 = flujoEntrada.next().trim();
                            int estrato4 = Integer.parseInt(estratos4);
                            String valorArriendos4 = flujoEntrada.next().trim();
                            int valorArriendo4 = Integer.parseInt(valorArriendos4);
                            descripcion = flujoEntrada.next().trim();
                            String viaPrincipals4 = flujoEntrada.next().trim();
                            viaPrincipal = Boolean.parseBoolean(viaPrincipals4);

                            String idDueños = flujoEntrada.next();
                            int idDueño = Integer.parseInt(idDueños);

                            Edificio e = (Edificio) fincaraiz.getInmuebles().get(idDueño);

                            e.addLocalComercial(descripcion, viaPrincipal, nombreBarrio4, estrato4, valorArriendo4, areaConstruida4, arrendado4, id4);

                            break;
                        }
                        case "eAddPiso": {
                            int numOficinas;
                            int area;

                            String ids2 = flujoEntrada.next().trim();
                            int id2 = Integer.parseInt(ids2);
                            String arrendados2 = flujoEntrada.next().trim();
                            boolean arrendado2 = Boolean.parseBoolean(arrendados2);
                            String nombreBarrio2 = flujoEntrada.next().trim();
                            String areaConstruidas2 = flujoEntrada.next().trim();
                            int areaConstruida2 = Integer.parseInt(areaConstruidas2);
                            String estratos2 = flujoEntrada.next().trim();
                            int estrato2 = Integer.parseInt(estratos2);
                            String valorArriendos2 = flujoEntrada.next().trim();
                            int valorArriendo2 = Integer.parseInt(valorArriendos2);
                            String areas2 = flujoEntrada.next().trim();
                            int area2 = Integer.parseInt(valorArriendos2);
                            String numOficinass2 = flujoEntrada.next().trim();
                            int numOficinas2 = Integer.parseInt(valorArriendos2);

                            String idDueños = flujoEntrada.next();
                            int idDueño = Integer.parseInt(idDueños);

                            Edificio e = (Edificio) fincaraiz.getInmuebles().get(idDueño);
                            e.addPiso(numOficinas2, area2, nombreBarrio2, estrato2, valorArriendo2, areaConstruida2, arrendado2, id2);

                            break;
                        }
                        default:
                            break;
                    }

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(LogicaFincaRaiz.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
