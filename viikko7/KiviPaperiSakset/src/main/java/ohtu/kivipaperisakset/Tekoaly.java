package ohtu.kivipaperisakset;

public class Tekoaly implements Pelaaja{

    int siirto;
    private String siirronNimi;
    private IO io;

    public Tekoaly(IO io) {
        siirto = 0;
        this.io = io;
    }

    public String annaSiirto() {
        siirto++;
        siirto = siirto % 3;

        if (siirto == 0) {
            return "k";
        } else if (siirto == 1) {
            return "p";
        } else {
            return "s";
        }
    }
    @Override
    public void setSiirto() {
        siirto++;
        siirto = siirto % 3;

        if (siirto == 0) {
            this.siirronNimi =  "k";
        } else if (siirto == 1) {
            this.siirronNimi =  "p";
        } else {
            this.siirronNimi =  "s";
        }
        io.print("Tietokone valitsi: " + siirronNimi);
    }
    @Override
    public String getSiirto() {
      return siirronNimi;
    }

    void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään
    }

}
