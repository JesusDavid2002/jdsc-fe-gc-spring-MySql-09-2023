// Generated with g9.

package com.example.ejercicio4.dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="facultades")
public class Facultades{

    /** Primary key. */
    protected static final String PK = "codigo";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int codigo;
    
    @Column(length=100)
    private String nombre;

    @OneToMany(mappedBy="facultades")
    private List<Equipos> equipos;
    
    @OneToMany(mappedBy="facultades")
    private List<Investigadores> investigadores;
    
    /** Default constructor. */
    public Facultades() {}

   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int aCodigo) {
        codigo = aCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String aNombre) {
        nombre = aNombre;
    }
    
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    public List<Equipos> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipos> equipos) {
		this.equipos = equipos;
	}

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
	public List<Investigadores> getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(List<Investigadores> investigadores) {
		this.investigadores = investigadores;
	}


	/**
     * Compares the key for this instance with another Facultades.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Facultades and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Facultades)) {
            return false;
        }
        Facultades that = (Facultades) other;
        if (this.getCodigo() != that.getCodigo()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Facultades.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Facultades)) return false;
        return this.equalKeys(other) && ((Facultades)other).equalKeys(this);
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
        i = getCodigo();
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
        StringBuffer sb = new StringBuffer("[Facultades |");
        sb.append(" codigo=").append(getCodigo());
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
        ret.put("codigo", Integer.valueOf(getCodigo()));
        return ret;
    }

}
