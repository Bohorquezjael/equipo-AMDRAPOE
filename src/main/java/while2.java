import java.util.Scanner;
public class while2 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
float CP,VT=0,TOV=0,i=1,CNP,PRO,NC,VTT;
System.out.println("INGRESE EL NUMERO DE CLIENTES");
NC=leer.nextInt();
while (i<=NC){
System.out.println("CLIENTE N°" + i);
for (int NP=1;NP<=3;NP++)
{
System.out.println("INGRESE EL COSTO DEL PRODUCTO N°" + NP);
CP=leer.nextFloat();
System.out.println("INGRESE LA CANTIDAD DEL PRODUCTO");
CNP=leer.nextInt();
VTT=CP*CNP;
VT=VT+VTT;
}
i++;
}
PRO=VT/NC;
System.out.println("LA VENTA TOTAL ES:" + VT);
System.out.println("EL PROMEDIO ES:" + PRO);
    }
}
/*prueba de github*/
