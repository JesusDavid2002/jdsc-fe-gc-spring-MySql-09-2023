// Generated with g9.

package com.example.ejercicio4.dto;

import java.time.LocalDateTime;
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

@Entity
@Table(name="reservas")
public class Reservas {

    /** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    
    @Column(name="comienzo")
    private LocalDateTime comienzo;
    
    @Column(name="fin")
    private LocalDateTime fin;

    @ManyToOne
    @JoinColumn(name="DNI")
    private Investigadores investigadores;
    
    @ManyToOne
    @JoinColumn(name="num_serie")
    private Equipos equipos;
    
    /** Default constructor. */
    public Reservas() {}

    public int getId() {
        return id;
    }

    public void setId(int aId) {
        id = aId;
    }

    public LocalDateTime getComienzo() {
        return comienzo;
    }

    public void setComienzo(LocalDateTime aComienzo) {
        comienzo = aComienzo;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime aFin) {
        fin = aFin;
    }

    public Investigadores getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(Investigadores investigadores) {
		this.investigadores = investigadores;
	}

	public Equipos getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipos equipos) {
		this.equipos = equipos;
	}

	/**
     * Compares the key for this instance with another Reservas.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Reservas and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Reservas)) {
            return false;
        }
        Reservas that = (Reservas) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Reservas.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Reservas)) return false;
        return this.equalKeys(other) && ((Reservas)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Reservas |");
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
