package Modelos.src;

public class Conversor {
    public static double conversor(String base, double valor, String destino) {

        double valorConvertido = 0;

        /*conversao para USD*/

        if (!base.equals("USD")) {
            if (base.equals("BRL")) valor = valor / 5.7098;
            if (base.equals("COP")) valor = valor / 4188.2872;
            if (base.equals("ARS")) valor = valor / 1137.0;
            if (base.equals("USD")) valorConvertido = valor;
        }

        /*converter de USD para moeda destino*/

        if (destino.equals("BRL")) valorConvertido = valor * 5.7098;
        if (destino.equals("COP")) valorConvertido = valor * 4188.2872;
        if (destino.equals("ARS")) valorConvertido = valor * 1137.0;
        if (destino.equals("USD")) valorConvertido = valor;

        return valorConvertido;
    }
}

