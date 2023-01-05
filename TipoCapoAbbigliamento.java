package negozio;

public class TipoCapoAbbigliamento {
    String marca, modello;
    float costo;

    public TipoCapoAbbigliamento(String marca, String modello, float costo) {
        this.marca = marca;
        this.modello = modello;
        this.costo = costo;
    }

    void getCosto() {
        System.out.println("costo: " + costo);
    }

    float applicaSconto(float sconto) {
        sconto = costo - (sconto * costo / 100);
        return sconto;
    }

    void modificaCosto(float newcosto) {
        costo = newcosto;
    }
}