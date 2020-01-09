package c;

import java.util.ArrayList;
import java.util.Collections;

public class Controlador
{
   private ArrayList<Vehiculo> listaVehiculos;
   private BusquedaVehiculoImpl  bvi;
   private Vehiculo vehiculo;
   private int indice = 0;
   
   public Controlador()
   {
       listaVehiculos = new ArrayList<>();
       bvi = new  BusquedaVehiculoImpl();
   }
   
   public void almacenar()
   {
       listaVehiculos.add(new Auto("Peugeot", "206", 4, 200000.00));
       listaVehiculos.add(new Moto("Honda", "Titan", "125c", 60000.00));
       listaVehiculos.add(new Auto("Peugeot", "208", 5, 250000.00));
       listaVehiculos.add(new Moto("Yamaha", "YBR", "160c", 80500.00));
   }

    public void mostrar() 
    {
        listaVehiculos.forEach((vehiculo) -> {
            vehiculo.mostrarVehiculo(vehiculo);
       });
        
        indice = bvi.indiceVehiculoMasCaro(listaVehiculos);
        vehiculo = listaVehiculos.get(indice);
        System.out.println("===================================");
        System.out.println("Vehículo más caro: " + vehiculo.getMarca() + " " + 
                            vehiculo.getModelo());
        
        indice = bvi.indiceVehiculoMasBarato(listaVehiculos);
        vehiculo = listaVehiculos.get(indice);
        System.out.println("Vehículo más barato: " + vehiculo.getMarca() + " " + 
                            vehiculo.getModelo());
        
        vehiculo = bvi.VehiculoModeloQueContieneY(listaVehiculos);
        
        if(vehiculo != null)
              System.out.println("Vehículo que contiene en el modelo la letra 'Y': " +
                            vehiculo.getMarca() + " " + vehiculo.getModelo() + " $" + 
                            vehiculo.getPrecio());
        else
           System.out.println("Ningún modelo de vechículo empieza con la letra 'Y'");
    
        
        Collections.sort(listaVehiculos, Collections.reverseOrder());
        
        System.out.println("===================================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        
        for(Vehiculo vehiculo : listaVehiculos)
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());


    }

}
