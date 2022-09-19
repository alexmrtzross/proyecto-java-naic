package Producto;

public class Producto {

    private int tenis;
    private int playera;
    private int pans;
    private int pantaloneta;
    private int gorra;
    private int precio;
    private String producto;
    private int cantidad;

    public Producto(String producto, int precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecioTenis() {
        return 100;
    }

    public int getPrecioPlayera() {
        return 70;
    }

    public int getPrecioPans() {
        return 80;
    }

    public int getPrecioPantaloneta() {
        return 50;
    }

    public int getPrecioGorra() {
        return 65;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTenis() {
        return tenis;
    }

    public void setTenis(int  tenis) {
        this.tenis = tenis;
    }


    public int getPlayera() {
        return playera;
    }

    public void setPlayera(int playera) {
        this.playera = playera;
    }


    public int getPans() {
        return pans;
    }

    public void setPans(int pans) {
        this.pans = pans;
    }


    public int getPantaloneta() {
        return pantaloneta;
    }

    public void setPantaloneta(int pantaloneta) {
        this.pantaloneta = pantaloneta;
    }
    

    public int getGorra() {
        return gorra;
    }

    public void setGorra(int gorra) {
        this.gorra = gorra;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }  

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMontoTotal() {
        return precio * cantidad;
    }
    
    public void setProducto(int producto) {
        this.cantidad = producto;
    }

    public int getCantidadTen(){
        return tenis * cantidad;
    }

    public int getCantidadPlay(){
        return playera * cantidad;
    }

    public int getCantidadPans(){
        return pans * cantidad;
    }

    public int getCantidadPant(){
        return pantaloneta * cantidad;
    }

    public int getCantidadGorra(){
        return gorra * cantidad;
    }


    
}
