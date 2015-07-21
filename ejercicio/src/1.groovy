/**
 * Created by Sintelti on 21/07/2015.
 */
/**
 * Created by Sintelti on 21/07/2015.
 */
/**
 * Created by Sintelti on 21/07/2015.
 */
/**
 * Created by Sintelti on 21/07/2015.
 */

public static void main(String[] args) {
    String mens = "Ynkxquip Nuqrky, wak ks as vxñsiñvñu Jueqk zksñg vxkbñyzu qqgrgx\n" +
            "Ynkxxñsluxj, ky as jkzkizñbk vxñbgju, gqzu, jkqmgju, lxñu, ñxusñiu,\n" +
            "ñsmksñuyu k ñszkqkizagqrkszk ñswañkzu. Cgzyus qu jkyixñhk lñyñigrkszk\n" +
            "jkq yñmañkszk ruju gq vuiu jk iusuikxyk\n" +
            "\n" +
            "Ya kyzgzaxg yuhxkvgyghg quy ykñy vñky, e kxg zgs kdzxguxjñsgxñgrkszk\n" +
            "ksoazu, wak vxujaiñg qg ñrvxkyñus jk ykx gas rgy gqzu. Zksñg qg rñxgjg\n" +
            "gmajg e vkskzxgszk, e ya sgxñf, lñsg e gmañqktg, jghg gq iusoaszu jk yay\n" +
            "lgiiñusky as gñxk jk bñbkfg e jk xkyuqaiñus.\n" +
            "\n" +
            "Gaswak rainuy ngs skmgju kyzg uviñus, kq kyixñzux hgyu ya jkyixñviñus\n" +
            "jk Nuqrky ks as gszñmau grñmu jk qg lgiaqzgj, qqgrgju Ynkxxñsluxj, kq\n" +
            "iagq qqkmu g luxrgx vgxzk jk Yiuzqgsj Egxj, mxgs grñmu e gqñgju jk iusgs\n" +
            "jueqk e iaegy jkyixñviñusky jk bñbksiñgy vuqñiñgigy ñsyvñxgxus raingy jk\n" +
            "yay uhxgy.";

//String mayuz=mens.toUpperCase();


    char []arremens     = mens.toCharArray(); //

    String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
    char []arreabecedario     = abecedario.toCharArray(); //

    String traduccion = "UVWXYZABCDEFGHIJKLMNÑOPQRSTuvwxyzabcdefghijklmnñopqrstuvwxyz";
    char[] arreTraducido     = traduccion.toCharArray(); //
    String r2;
    String resultado = "";
    char letra;
    char letra2;

    char[] apellido     = new char[mens.length()]; //


    for (int i = 0; i < arremens.length; i++) {

        for (int j = 0; j < arreabecedario.length; j++) {
            if (arremens[i] == arreabecedario[j]) {

                //apellido[j]=arreTraducido[j];
                letra = (arreTraducido[j]);
                //resultado= resultado + String.valueOf(arreTraducido[j]);
                resultado = resultado + letra;
            }


        }

        if (arremens[i] == ' ' || arremens[i] == '.' || arremens[i] == ',' || arremens[i] == '\n') {
            letra2 = (arremens[i]);
            //apellido[i]=arremens[i];
            resultado = resultado + String.valueOf(arremens[i]);
        }


    }


    System.out.print(resultado);
}

// System.out.print("\n");

//System.out.print(resultado);
//System.out.print("uno");