package com.Anilber.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String apellido;

	private String direccion;

	private String dui;

	private int edad;

	private int grupoDeClaseProgramacion3Alquepertenece;

	private String nit;

	private String nombre;

	private double utimaNotaObtenidaEnProgramacion2;

	public Cliente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDui() {
		return this.dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getGrupoDeClaseProgramacion3Alquepertenece() {
		return this.grupoDeClaseProgramacion3Alquepertenece;
	}

	public void setGrupoDeClaseProgramacion3Alquepertenece(int grupoDeClaseProgramacion3Alquepertenece) {
		this.grupoDeClaseProgramacion3Alquepertenece = grupoDeClaseProgramacion3Alquepertenece;
	}

	public String getNit() {
		return this.nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getUtimaNotaObtenidaEnProgramacion2() {
		return this.utimaNotaObtenidaEnProgramacion2;
	}

	public void setUtimaNotaObtenidaEnProgramacion2(double utimaNotaObtenidaEnProgramacion2) {
		this.utimaNotaObtenidaEnProgramacion2 = utimaNotaObtenidaEnProgramacion2;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", apellido=" + apellido + ", direccion=" + direccion + ", dui=" + dui + ", edad="
				+ edad + ", grupoDeClaseProgramacion3Alquepertenece=" + grupoDeClaseProgramacion3Alquepertenece
				+ ", nit=" + nit + ", nombre=" + nombre + ", utimaNotaObtenidaEnProgramacion2="
				+ utimaNotaObtenidaEnProgramacion2 + "]";
	}
	
	
	

}