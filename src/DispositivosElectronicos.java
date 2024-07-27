public class DispositivosElectronicos {

    // Atributos
    private String marca;
    private String modelo;
    private String color;
    private double precio;


    // Constructor
    public DispositivosElectronicos(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
        this.color = "#000000";
        this.modelo = modelo;
    }

    // Métodos
    public void encender() {
        System.out.println("El dispositivo está encendido.");
    }

    public void apagar() {
        System.out.println("El dispositivo está apagado.");
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

