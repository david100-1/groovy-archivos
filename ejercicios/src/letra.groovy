/**
 * Created by Sintelti on 11/08/2015.
 */
import Console.*

class letra implements solucion {

    String convertir(String ingresa) {
        // TODO code application logic here




        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el texto " );
        ingresa=ent.nextLine();

        String porcion = "";
        String cadena = "";
        int paso = 0;


        int conta = 1;
        String acum = "";
        int vfin=0;

        for (int c = 0; c < ingresa.length(); c++) {
            //acum=acum+"x";

            if (ingresa.charAt(c) == 'o') {
                for (int a = 0; a < conta; a++) {
                    acum = acum + "x";
                }


                porcion = ingresa.substring(paso, c);
                //System.out.println(porcion);
                paso = c + 1;
                cadena = cadena + porcion + acum;
                porcion = "";
                acum = "";

                conta++;
                vfin=c;
            }
        }
        //System.out.println(cadena);

        int n=ingresa.length();

        char caracf=ingresa.charAt(n-1);
        String cadenamodificada="";

        if(caracf=='o'){
            System.out.println(cadena);
        }
        else{


            //int tamacum=acum.length();
            //int tamtotal=value.length()-tamacum;


            String mm = ingresa.substring(vfin+1,n);
            cadenamodificada=cadena+mm;

            //String mmm=mm+two;
            System.out.println(cadenamodificada);


        }

    }


}
