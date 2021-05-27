import java.util.ArrayList;
import java.util.Scanner;
public class NuevaT{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<MiProducto> lacteos = new ArrayList<MiProducto>();
       
        
        lacteos.add(new MiProducto(20.99, 13, "NutriLeche"));
          int opc;

        for (MiProducto x : lacteos) {
            System.out.print("\n\n" + x.getNombre_Producto() + " " + x.cantidad_Producto + " " + x.precio);
        }

        System.out.print("\n\n" + lacteos.get(0).getNombre_Producto() + "\n\n");

        System.out.println("Welcome");
        System.out.println("Menu: ");
        System.out.println("1. Compra");
        System.out.println("2.Producto");
        opc = sc.nextInt();

        switch(opc){
            case 1:
            int opc1;
            System.out.println("Ingrese el dia");
            System.out.println("Menu Dia: ");
            System.out.println("1.sabado & Domingo");//No Promo
            System.out.println("2. Martes");//Promo 2x1
            System.out.println("3. Dias restantes");
            opc1 = sc.nextInt();

            switch(opc1){
                case 1:
                String dato;

                System.out.println(" Ingrese el producto");
                dato = sc.nextLine();
                for(int i=0; i < lacteos.size(); i++){
                    if(dato.comparaTo(lacteos.get(i).getNombre_Producto())
                
                        System.out.println("2.Producto");
                }
                break;
            }
        
            opc = sc.nextInt();
            

            break;
            case 2:
            System.out.println(":v");
            break;
        }


        int tamano = lacteos.size();

        System.out.print("el tamaño es: " + tamano + "\n\n");

    }

}