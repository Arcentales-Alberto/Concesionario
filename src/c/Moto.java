package c;

/**
 *
 * @author dell-1
 */
public class Moto extends Vehiculo
{
  private String cilindrada;  

    public Moto( String marca, String modelo, String cilindrada, Double precio)
    {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    
    @Override
    protected void mostrarVehiculo(Vehiculo v) 
    {
        System.out.println("Marca: " + v.getMarca() + " // Modelo: " + v.getModelo() +
         " // Cilindrada: " + cilindrada + " // Precio: $" + String.format("%.2f", v.getPrecio()));
    }
    
 
}
