import java.util.ArrayList;

public class Tiendita {
    public static void main(String[] args) {
        ArrayList<Lacteos> lacteos = new ArrayList<Lacteos>();
      
        
        lacteos.add(new Lacteos(20.99, 13, "NutriLeche"));
        

        for (Lacteos x : lacteos) {
            System.out.print("\n\n" + x.getNombre_Producto() + " " + x.cantidad_Producto + " " + x.precio);
        }

        System.out.print("\n\n" + lacteos.get(0).getNombre_Producto() + "\n\n");

        int tamano = lacteos.size();

        System.out.print("el tamaño es: " + tamano + "\n\n");

    }

}