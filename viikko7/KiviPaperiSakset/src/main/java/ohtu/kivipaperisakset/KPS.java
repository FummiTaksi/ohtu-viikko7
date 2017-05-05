package ohtu.kivipaperisakset;
import ohtu.*;

import java.util.Scanner;


public class KPS {

  public Pelaaja pelaaja1;
  public Pelaaja pelaaja2;
  public IO io;

  public KPS(Pelaaja p1, Pelaaja p2, IO io) {
    this.pelaaja1 = p1;
    this.pelaaja2 = p2;
    this.io = io;
  }

  public void pelaa() {
      Tuomari tuomari = new Tuomari();
      pelaaVuoro(pelaaja1);
      pelaaVuoro(pelaaja2);
      while (onkoOkSiirto(pelaaja1.getSiirto()) && onkoOkSiirto(pelaaja2.getSiirto())) {
          tuomari.kirjaaSiirto(pelaaja1.getSiirto(), pelaaja2.getSiirto());
          io.print(tuomari.toString());
          io.print("");

          pelaaVuoro(pelaaja1);
          pelaaVuoro(pelaaja2);
      }

      io.print("");
      io.print("Kiitos!");
      io.print(tuomari.toString());
  }

  public void pelaaVuoro(Pelaaja pelaaja) {
    pelaaja.setSiirto();
  }

  private static boolean onkoOkSiirto(String siirto) {
      return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
  }
}
