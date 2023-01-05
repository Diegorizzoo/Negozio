package negozio;

public class CapoAbbigliamento extends TipoCapoAbbigliamento {
    int taglia, quantitaAquistata, quantitaDisponibile;

    public CapoAbbigliamento(String marca, String modello, float costo, int taglia, int quantitaAquistata,
            int quantitaDisponibile) {
        super(marca, modello, costo);
        this.taglia = taglia;
        this.quantitaAquistata = quantitaAquistata;
        this.quantitaDisponibile = quantitaDisponibile;
    }

    void venduto(int capiVenduti) {
        int capiRimanendti = quantitaDisponibile - capiVenduti;
        if (quantitaDisponibile > capiRimanendti) {
            quantitaDisponibile -= capiVenduti;
        }
    }

    void getDettagli() {
        System.out.println("marca: " + marca + " modello: " + modello + " costo: " + costo + " taglia:" + taglia);
        System.out
                .println("quantita acquistata: " + quantitaAquistata + " quantita disponibile: " + quantitaDisponibile);
    }

}
