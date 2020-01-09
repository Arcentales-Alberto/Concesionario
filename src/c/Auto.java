package c;

/**
 *
 * @author dell-1
 */
public class Auto extends Vehiculo
{
    private int puertas;  

    public Auto(String marca,  String modelo, int puertas, Double precio) 
    {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }


    @Override
    protected void mostrarVehiculo(Vehiculo v) 
    {
        System.out.println("Marca: " + v.getMarca() + " // Modelo: " + v.getModelo() +
        " // Puertas: " + puertas + " // Precio: $" + String.format("%.2f", v.getPrecio()));
    }
 
    
}
