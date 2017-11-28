/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Oferta 
 */
package AgenciaEmpleo;

import AgenciaSwing.BusquedaCandidatoParaOferta;
import java.io.Serializable;
import java.util.Date;

/**
 * Oferta: Implementa Serializable
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Oferta implements Serializable {
    
    //Declaración de Atributos
    private Oficina oficina;
    private Date fechaAper;//fecha de inicio de la oferta
    private Date fechaCadu;//fecha limite de la oferta
    private double SalMin;//Sueldo mínimo de la oferta
    private double SalMax;//Sueldo máximo
    public String tipo;//tipo de jornada: completa o parcial
    private double grado;//Se refiere a la dedicacion
    private String[] claves;//palabras claves por las que buscar la Oferta 
    private String ocupacion;
    private Estado estadoActual;

    /**
     * Constructor de la clase
     *
     * @param oficina
     * @param fechaAper
     * @param fechaCadu
     * @param SalMin
     * @param SalMax
     * @param claves
     * @param ocupacion
     */
    public Oferta(Oficina oficina, Date fechaAper, Date fechaCadu, double SalMin, double SalMax, String[] claves, String ocupacion) {
        this.oficina = oficina;
        this.fechaAper = fechaAper;
        this.fechaCadu = fechaCadu;
        this.SalMin = SalMin;
        this.SalMax = SalMax;
        this.claves = claves;
        this.ocupacion = ocupacion;
        this.estadoActual = new EstadoDisponible();
    }

    /**
     * Constructor vacio
     */
    public Oferta() {
    }

    /**
     * Toma los datos de la clase Oficina.
     * @return oficina
     */
    public Oficina getOficina() {
        return oficina;
    }

    /**
     * Método set.
     * @param oficina
     */
    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    /**
     *
     * @return fechaAper.
     */
    public Date getFechaAper() {
        return fechaAper;
    }

    /**
     *
     * @param fechaAper
     */
    public void setFechaAper(Date fechaAper) {
        this.fechaAper = fechaAper;
    }

    /**
     *
     * @return
     */
    public Date getFechaCadu() {
        return fechaCadu;
    }

    /**
     *
     * @param fechaCadu
     */
    public void setFechaCadu(Date fechaCadu) {
        this.fechaCadu = fechaCadu;
    }

    /**
     *
     * @return SalMin.
     */
    public double getSalMin() {
        return SalMin;
    }

    /**
     *
     * @param SalMin
     */
    public void setSalMin(double SalMin) {
        this.SalMin = SalMin;
    }

    /**
     *
     * @return SalMax.
     */
    public double getSalMax() {
        return SalMax;
    }

    /**
     *
     * @param SalMax
     */
    public void setSalMax(double SalMax) {
        this.SalMax = SalMax;
    }

    /**
     *
     * @return tipo.
     */
    public String getTipo() {
        return tipo;
    }
/**
 * 
 * @param tipo 
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
/**
 * 
 * @return grado.
 */
    public double getGrado() {
        return grado;
    }
/**
 * 
 * @param grado 
 */
    public void setGrado(double grado) {
        this.grado = grado;
    }
/**
 * 
 * @return claves.
 */
    public String[] getClaves() {
        return claves;
    }
/**
 * 
 * @param claves 
 */
    public void setClaves(String[] claves) {
        this.claves = claves;
    }

    /**
     *
     * @return ocupacion.
     */
    public String getOcupacion() {
        return ocupacion;
    }
    /**
     * 
     * @param ocupacion 
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    /**
     * 
     * @return estadoActual. 
     */
    public Estado getEstadoActual() {
        return estadoActual;
    }
    /**
     * 
     * @param estadoActual 
     */
    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }
    
     /**
     * 
     * @param ventana 
     */   
    public void cambiar(BusquedaCandidatoParaOferta ventana){
    estadoActual.ejecutar(this,ventana);
    }
    /**
     * 
     * @return cadena 
     */
    public String clavesArray(){
    String cadena = null;
        for (int i = 0; i < claves.length; i++) {
            cadena += claves[i] +",";
            
        }
        return cadena;
    }

}
