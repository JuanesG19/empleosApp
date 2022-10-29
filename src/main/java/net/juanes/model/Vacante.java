package net.juanes.model;

import java.util.Date;

public class Vacante {

    private Integer id;

    private String nombre;

    private String descripcion;

    private Date fecha;

    private double salario;

    private Integer destacado;

    /**
     * Metodos
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Integer getDestacado() {return destacado;}

    public void setDestacado(Integer destacado) {this.destacado = destacado;}

    @Override
    public String toString() {
        return "Vacante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", salario=" + salario +
                '}';
    }
}
