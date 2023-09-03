// Generated with g9.

package com.example.ejercicio1.dto;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="piezas")
public class Piezas{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int codigo;
    @Column(length=100)
    private String nombre;

    @OneToMany(mappedBy = "piezas")
   	private List<Suministra> suministros;
    
    /** Default constructor. */
    public Piezas() {}

    public Piezas(int codigo, String nombre, List<Suministra> suministros) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.suministros = suministros;
	}

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

    /**
     * Compares the key for this instance with another Piezas.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Piezas and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Piezas)) {
            return false;
        }
        Piezas that = (Piezas) other;
        if (this.getCodigo() != that.getCodigo()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Piezas.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Piezas)) return false;
        return this.equalKeys(other) && ((Piezas)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Piezas |");
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
