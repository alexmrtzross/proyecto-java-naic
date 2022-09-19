package Factura;
import Producto.*;
import Cliente.*;

public class Factura {
    static Producto producto = new Producto();
    static Cliente cliente = new Cliente();
    private int noFactura;
    private String nombre;
    private String nit;
    private String direccion;
    private int montoTotal;
    private String mes;
    private int anio;
    private String pago;
    /*private String producto;*/


    public Factura(int noFact, String nombre, String nit, String direccion, int montoTotal, String mes, int anio,
            String pago, Producto producto) {
        this.noFactura = noFact;
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.montoTotal = montoTotal;
        this.mes = mes;
        this.anio = anio;
        this.pago = pago;
    }

    public String getProducto() {
        return producto.getProducto();
    }

    public Factura() {
    }

    public int getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public String getNombre() {
        return nombre.toLowerCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /* 
    public String getProducto() {
        return producto.toLowerCase();
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    */
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion.toLowerCase();
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMes() {
        return mes.toLowerCase();
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPago() {
        return pago.toLowerCase();
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public int getCantidad() {
        return producto.getCantidad();
    }

    public void setCantidad(int cantidad) {
        producto.setCantidad(cantidad);
    }

    public int getPrecio() {
        return producto.getPrecio();
    }

    public void setPrecio(int precio) {
        producto.setPrecio(precio);
    }


    public void setTenis(int tenis) {
        producto.setTenis(tenis);
    }

    public void setPlayera(int Playera) {
        producto.setPlayera(Playera);
    }


    public void setPans(int pans) {
        producto.setPans(pans);
    }

    public void setPantaloneta(int pantaloneta) {
        producto.setPantaloneta(pantaloneta);
    }

    public void setGorra(int gorra) {
        producto.setGorra(gorra);
    }

    public int getTenis() {
        return producto.getTenis() + producto.getPrecio() * producto.getCantidad();
    }

    public int getPrecioTenis() {
        return 100;
    }

    public int getPlayera() {
        return producto.getPlayera() + producto.getPrecio() * producto.getCantidad();
    }

    public int getPrecioPlayera() {
        return 70;
    }

    public int getPans() {
        return producto.getPans() + producto.getPrecio() * producto.getCantidad();
    }

    public int getPrecioPans() {
        return 80;
    }

    public int getPantaloneta() {
        return producto.getPantaloneta() + producto.getPrecio() * producto.getCantidad();
    }

    public int getPrecioPantaloneta() {
        return 50;
    }

    public int getGorra() {
        return producto.getGorra() + producto.getPrecio() * producto.getCantidad();
    }

    public int getPrecioGorra() {
        return 65;
    }


    @Override
    public String toString() {
        return "Factura no." + noFactura + "\nNombre: " + nombre + "\nNit: " + nit + "\nDireccion: " + direccion
                + "\nMonto Total: " + montoTotal + "\nMes: " + mes + "\nAño: " + anio + "\nPago: " + pago;
    }
}
