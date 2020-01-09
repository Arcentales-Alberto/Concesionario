package c;


abstract class  Vehiculo implements Comparable<Vehiculo>
{
    private String marca; 
    private String modelo;  
    private Double precio;

    public Vehiculo(String marca, String modelo, Double precio)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca()
    {
        return marca;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public Double getPrecio()
    {
        return precio;
    }

   @Override
   public int compareTo(Vehiculo vehiculo)
   {
      return precio.compareTo(vehiculo.getPrecio());
   }     

   abstract protected void mostrarVehiculo(Vehiculo v);
    
}
