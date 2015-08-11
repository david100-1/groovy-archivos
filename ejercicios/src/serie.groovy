/**
 * Created by Sintelti on 11/08/2015.
 */
class serie {

    void ver(){
        Scanner leer=new Scanner(System.in);
        int entra;
        System.out.println("Ingrese el nemero de repeticiones " );
        entra=leer.nextInt();


        int var=0;
        int inicia=1;
        int sig=0;

        for(int a=0;a<entra;a++) {

            var = inicia + sig;
            inicia = sig;
            sig = var;
            System.out.println(var);
        }




    }
}
