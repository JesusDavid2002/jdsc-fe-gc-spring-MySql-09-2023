// Generated with g9.

package com.example.ejercicio3.dto;

import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="ventas")
public class Ventas {

    /** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    
    @ManyToOne
	@JoinColumn(name="id_cajero")
	private Cajeros cajeros;
    
    @ManyToOne
	@JoinColumn(name="id_producto")
	private Productos productos;
    
    @ManyToOne
	@JoinColumn(name="id_maquina")
	private MaquinasRegistradas maquinas;
    
    /** Default constructor. */
    public Ventas() {}

    public Ventas(int id, Cajeros cajeros, Productos productos, MaquinasRegistradas maquinas) {
		this.id = id;
		this.cajeros = cajeros;
		this.productos = productos;
		this.maquinas = maquinas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cajeros getCajeros() {
		return cajeros;
	}

	public void setCajeros(Cajeros cajeros) {
		this.cajeros = cajeros;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public MaquinasRegistradas getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(MaquinasRegistradas maquinas) {
		this.maquinas = maquinas;
	}

	/**
     * Compares the key for this instance with another Ventas.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Ventas and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Ventas)) {
            return false;
        }
        Ventas that = (Ventas) other;
        if (this.getCajeros() != that.getCajeros()) {
            return false;
        }
        if (this.getMaquinas() != that.getMaquinas()) {
            return false;
        }
        if (this.getProductos() != that.getProductos()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Ventas.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Ventas)) return false;
        return this.equalKeys(other) && ((Ventas)other).equalKeys(this);
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Ventas |");
        sb.append(" cajero=").append(getCajeros());
        sb.append(" maquina=").append(getMaquinas());
        sb.append(" producto=").append(getProductos());
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
        ret.put("cajero", getCajeros());
        ret.put("maquina", getMaquinas());
        ret.put("producto", getProductos());
        return ret;
    }

}
