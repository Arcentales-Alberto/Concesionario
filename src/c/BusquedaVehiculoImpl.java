package c;

import java.util.*;

public class BusquedaVehiculoImpl implements VehiculoInterfaz
{   
    @Override
    public int indiceVehiculoMasCaro(ArrayList<Vehiculo> listaVehiculos)
    {
        int indice = 0;
        double precio = listaVehiculos.get(0).getPrecio();
        
        for(Vehiculo vehiculo : listaVehiculos)
            if(vehiculo.getPrecio() > precio)
            {
                precio = vehiculo.getPrecio();
                indice = listaVehiculos.indexOf(vehiculo);  
            }
                
        return indice;
    }

    @Override
    public int indiceVehiculoMasBarato(ArrayList<Vehiculo> listaVehiculos) 
    {
        int indice = 0;
        double precio = listaVehiculos.get(0).getPrecio();
        
        for(Vehiculo vehiculo : listaVehiculos)
            if(vehiculo.getPrecio() < precio)
            {
                precio = vehiculo.getPrecio();
                indice = listaVehiculos.indexOf(vehiculo);  
            }
                
        return indice;
    }

    @Override
    public Vehiculo VehiculoModeloQueContieneY(ArrayList<Vehiculo> listaVehiculos)
    {
        String primeraLetra;
        Vehiculo vehiculoEncontrado = null;
        
        for(Vehiculo vehiculo : listaVehiculos)
        {
           primeraLetra = Character.toString(vehiculo.getModelo().charAt(0));
           
           if(primeraLetra.equals("Y") || primeraLetra.equals("y"))
               vehiculoEncontrado = vehiculo;
        }
            
        return vehiculoEncontrado;
    } 

}
