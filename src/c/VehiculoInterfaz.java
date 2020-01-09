package c;

import java.util.ArrayList;


public interface VehiculoInterfaz
{
   public  abstract  int indiceVehiculoMasCaro(ArrayList<Vehiculo> listaVehiculos); 
   public abstract int indiceVehiculoMasBarato(ArrayList<Vehiculo> listaVehiculos);    
   public abstract Vehiculo VehiculoModeloQueContieneY(ArrayList<Vehiculo> listaVehiculos);    
}
