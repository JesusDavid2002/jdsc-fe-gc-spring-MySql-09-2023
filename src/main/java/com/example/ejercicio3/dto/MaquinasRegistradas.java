// Generated with g9.

package com.example.ejercicio3.dto;

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

@Entity
@Table(name="maquinas_registradas")
public class MaquinasRegistradas{

    /** Primary key. */
    protected static final String PK = "codigo";
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int codigo;
    private int piso;

    @OneToMany(mappedBy = "maquinas")
   	private List<Ventas> ventas;
    
    /** Default constructor. */
    public MaquinasRegistradas() {}

    public MaquinasRegistradas(int codigo, int piso) {
		this.codigo = codigo;
		this.piso = piso;
	}

	public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int aCodigo) {
        codigo = aCodigo;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int aPiso) {
        piso = aPiso;
    }

    /**
     * Compares the key for this instance with another MaquinasRegistradas.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MaquinasRegistradas and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MaquinasRegistradas)) {
            return false;
        }
        MaquinasRegistradas that = (MaquinasRegistradas) other;
        if (this.getCodigo() != that.getCodigo()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MaquinasRegistradas.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MaquinasRegistradas)) return false;
        return this.equalKeys(other) && ((MaquinasRegistradas)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[MaquinasRegistradas |");
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
