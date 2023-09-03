// Generated with g9.

package com.example.ejercicio1.dto;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="proveedores")
public class Proveedores{

    /** Primary key. */
    protected static final String PK = "id";

    @Id
    @Column(unique=true, nullable=false, length=4)
    private String id;
    @Column(length=100)
    private String nombre;

    @OneToMany(mappedBy = "proveedores")
   	private List<Suministra> suministros;
    
    /** Default constructor. */
    public Proveedores() {}
    
    public Proveedores(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
        return id;
    }

    
    public void setId(String Id) {
        id = Id;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String Nombre) {
        nombre = Nombre;
    }
    
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    public List<Suministra> getSuministros() {
		return suministros;
	}
    
    /**
     * Compares the key for this instance with another Proveedores.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Proveedores and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Proveedores)) {
            return false;
        }
        Proveedores that = (Proveedores) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Proveedores.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Proveedores)) return false;
        return this.equalKeys(other) && ((Proveedores)other).equalKeys(this);
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
        if (getId() == null) {
            i = 0;
        } else {
            i = getId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Proveedores |");
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
        ret.put("id", getId());
        return ret;
    }

}
