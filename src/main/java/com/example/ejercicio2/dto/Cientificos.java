// Generated with g9.

package com.example.ejercicio2.dto;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cientificos")
public class Cientificos {

    /** Primary key. */
    protected static final String PK = "dni";

    @Id
    @Column(name="DNI", unique=true, nullable=false, length=8)
    private String dni;
    @Column(name="nom_apels", length=225)
    private String nomApels;

    @OneToMany(mappedBy = "cientificos")
   	private List<AsignadoA> asignados;
    
    /** Default constructor. */
    public Cientificos() {}

    public Cientificos(String dni, String nomApels) {
		this.dni = dni;
		this.nomApels = nomApels;
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

    /**
     * Compares the key for this instance with another Cientificos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Cientificos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Cientificos)) {
            return false;
        }
        Cientificos that = (Cientificos) other;
        Object myDni = this.getDni();
        Object yourDni = that.getDni();
        if (myDni==null ? yourDni!=null : !myDni.equals(yourDni)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Cientificos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Cientificos)) return false;
        return this.equalKeys(other) && ((Cientificos)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Cientificos |");
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
