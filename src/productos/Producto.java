package productos;

public abstract class Producto implements Comparable<Producto>{
    protected int precio;
    protected String nombre;
    public Producto(String nombre, int precio){
        this.precio = precio;
        this.nombre = nombre;
    }
    public int getPrecio(){
        return precio;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + " ";
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public int compareTo(Producto producto) {
        return producto.getPrecio()-this.getPrecio();
    }
}
