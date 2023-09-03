// Generated with g9.

package com.example.ejercicio4.dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="investigadores")
public class Investigadores{

    /** Primary key. */
    protected static final String PK = "dni";

    @Id
    @Column(name="DNI", unique=true, nullable=false, length=8)
    private String dni;
    
    @Column(name="nom_apels", length=255)
    private String nomApels;
    
    @ManyToOne
    @JoinColumn(name="facultad")
    private Facultades facultades;

    @OneToMany(mappedBy="investigadores")
    private List<Reservas> reservas;

    /** Default constructor. */
    public Investigadores() {}
    
    public Investigadores(String dni, String nomApels, Facultades facultades, List<Reservas> reservas) {
		this.dni = dni;
		this.nomApels = nomApels;
		this.facultades = facultades;
		this.reservas = reservas;
	}

	public String getDni() {
        return dni;
    }

    public void setDni(String aDni) {
        dni = aDni;
    }

    public String getNomApels() {
        return nomApels;
    }

    public void setNomApels(String aNomApels) {
        nomApels = aNomApels;
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
     * Compares the key for this instance with another Investigadores.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Investigadores and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Investigadores)) {
            return false;
        }
        Investigadores that = (Investigadores) other;
        Object myDni = this.getDni();
        Object yourDni = that.getDni();
        if (myDni==null ? yourDni!=null : !myDni.equals(yourDni)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Investigadores.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Investigadores)) return false;
        return this.equalKeys(other) && ((Investigadores)other).equalKeys(this);
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
        if (getDni() == null) {
            i = 0;
        } else {
            i = getDni().hashCode();
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
        StringBuffer sb = new StringBuffer("[Investigadores |");
        sb.append(" dni=").append(getDni());
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
        ret.put("dni", getDni());
        return ret;
    }

}
