// Generated with g9.

package com.example.ejercicio4.dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="equipos")
public class Equipos{

    /** Primary key. */
    protected static final String PK = "numSerie";

    @Id
    @Column(name="num_serie", unique=true, nullable=false, length=4)
    private String numSerie;
    
    @Column(length=100)
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name="facultad")
    private Facultades facultades;

    @OneToMany(mappedBy="equipos")
    private List<Reservas> reservas;
    
    /** Default constructor. */
    public Equipos() {}

    public Equipos(String numSerie, String nombre, Facultades facultades) {
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.facultades = facultades;
	}

	public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String aNumSerie) {
        numSerie = aNumSerie;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    public Facultades getFacultades() {
		return facultades;
	}

	public void setFacultades(Facultades facultades) {
		this.facultades = facultades;
	}
	
	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
	public List<Reservas> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reservas> reservas) {
		this.reservas = reservas;
	}

	/**
     * Compares the key for this instance with another Equipos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Equipos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Equipos)) {
            return false;
        }
        Equipos that = (Equipos) other;
        Object myNumSerie = this.getNumSerie();
        Object yourNumSerie = that.getNumSerie();
        if (myNumSerie==null ? yourNumSerie!=null : !myNumSerie.equals(yourNumSerie)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Equipos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Equipos)) return false;
        return this.equalKeys(other) && ((Equipos)other).equalKeys(this);
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
        if (getNumSerie() == null) {
            i = 0;
        } else {
            i = getNumSerie().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[Equipos |");
        sb.append(" numSerie=").append(getNumSerie());
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
        ret.put("numSerie", getNumSerie());
        return ret;
    }

}
