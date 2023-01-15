public class Articulo {
    private String codigo = "LIBRE";
    private String nombre;
    private String descripcion;
    private double precioV;
    private double precioC;
    private int cantidad = 0;

    public Articulo(String codigo, String nombre, String descripcion, double v, double c){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioV = v;
        this.precioC = c;
    }

    public Articulo(){}

    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public double getPrecioV(){
        return this.precioV;
    }
    public void setPrecioV(double precioV){
        this.precioV = precioV;
    }

    public double getPrecioC(){
        return this.precioC;
    }
    public void setPrecioC(double precioC){
        this.precioC = precioC;
    }

    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public String toString(){
        return "Código: " + this.codigo + "\nNombre: " + this.nombre + "\nDescripción: " + this.descripcion + "\nPrecio Venta: " + this.precioV + "\nPrecio Compra: " + this.precioC + "\nStock: " + this.cantidad;
    }

}
