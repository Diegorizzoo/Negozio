package negozio;

public class Negozio {
    public static void main(String[] args) {
        TipoCapoAbbigliamento a = new TipoCapoAbbigliamento("Colmar", "GiaccaE45", (float) 350.5);
        a.getCosto();
        float b = a.applicaSconto(30);
        System.out.println("il costo scontato è: " + b);
        CapoAbbigliamento c = new CapoAbbigliamento("levis", "jeans", (float) 79.8, 40, 30, 30);
        c.venduto(2);
        c.getDettagli();
    }

}
