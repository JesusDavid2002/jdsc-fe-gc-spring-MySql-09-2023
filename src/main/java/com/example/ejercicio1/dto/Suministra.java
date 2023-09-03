// Generated with g9.

package com.example.ejercicio1.dto;


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
@Table(name="suministra")
public class Suministra {

    /** Primary key. */
    protected static final String PK = "id";


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    
    @Column(name="precio")
    private int precio;

    @ManyToOne
	@JoinColumn(name = "codigo_pieza")
	private Piezas piezas;
    
    @ManyToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedores proveedores;
    
    /** Default constructor. */
    public Suministra() {}
    
    public Suministra( int id, int precio, Proveedores idProveedor, Piezas codigoPieza) {
		this.id = id;
		this.precio = precio;
		this.proveedores = idProveedor;
		this.piezas = codigoPieza;
	}

	public int getId() {
        return id;
    }

    public void setId(int Id) {
        id = Id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int Precio) {
        precio = Precio;
    }
    
    public Proveedores getIdProveedor() {
        return proveedores;
    }

    public void setIdProveedor(Proveedores IdProveedor) {
    	proveedores = IdProveedor;
    }

    public Piezas getPieza() {
        return piezas;
    }

    public void setPieza(Piezas CodigoPieza) {
    	piezas = CodigoPieza;
    }


    /**
     * Compares the key for this instance with another Suministra.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Suministra and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Suministra)) {
            return false;
        }
        Suministra that = (Suministra) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Suministra.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Suministra)) return false;
        return this.equalKeys(other) && ((Suministra)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Suministra |");
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
