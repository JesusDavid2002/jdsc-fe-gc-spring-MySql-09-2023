// Generated with g9.

package com.example.ejercicio2.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="asignado_a")
public class AsignadoA implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    
    @ManyToOne
	@JoinColumn(name="dni_cientifico")
	private Cientificos cientificos;
    
    @ManyToOne
	@JoinColumn(name="id_proyecto")
	private Proyectos proyectos;
    
    /** Default constructor. */
    public AsignadoA() {
        super();
    }
    
	public AsignadoA(int id, Cientificos cientificos, Proyectos proyectos) {
		this.id = id;
		this.cientificos = cientificos;
		this.proyectos = proyectos;
	}

    public int getId() {
        return id;
    }

    public void setId(int aId) {
        id = aId;
    }

    public Cientificos getDniCientifico() {
        return cientificos;
    }

    public void setDniCientifico(Cientificos aDniCientifico) {
    	cientificos = aDniCientifico;
    }

    public Proyectos getIdProyecto() {
        return proyectos;
    }

    public void setIdProyecto(Proyectos aIdProyecto) {
    	proyectos = aIdProyecto;
    }

    

    /**
     * Compares the key for this instance with another AsignadoA.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AsignadoA and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AsignadoA)) {
            return false;
        }
        AsignadoA that = (AsignadoA) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AsignadoA.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AsignadoA)) return false;
        return this.equalKeys(other) && ((AsignadoA)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[AsignadoA |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
