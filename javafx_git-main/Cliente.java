package com.empresa.javafx_jdbc_sp;

import javafx.beans.property.*;

public class Cliente {
    private final IntegerProperty id;
    private final StringProperty nombre;
    private final StringProperty ciudad;
    private final DoubleProperty facturacion;

    public Cliente(int id, String nombre, String ciudad, double facturacion) {
        this.id = new SimpleIntegerProperty(id);
        this.nombre = new SimpleStringProperty(nombre);
        this.ciudad = new SimpleStringProperty(ciudad);
        this.facturacion = new SimpleDoubleProperty(facturacion);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad.get();
    }

    public StringProperty ciudadProperty() {
        return ciudad;
    }

    public double getFacturacion() {
        return facturacion.get();
    }

    public DoubleProperty facturacionProperty() {
        return facturacion;
    }
}
