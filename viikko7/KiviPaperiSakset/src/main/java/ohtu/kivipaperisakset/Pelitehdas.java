package ohtu.kivipaperisakset;
import java.util.*;

public class Pelitehdas {

  private HashMap<Character, KPS> pelit;
  private IO io;

  public Pelitehdas(IO io) {
    this.pelit = new HashMap();
    this.io = io;
    alustaPelit();
  }

  public void alustaPelit() {
    pelit.put('a', new KPS(new Ihminen(this.io), new Ihminen(this.io), this.io));
    pelit.put('b', new KPS(new Ihminen(this.io), new Tekoaly(io), this.io));
    pelit.put('c', new KPS(new Ihminen(this.io), new TekoalyParannettu(20), this.io));
  }

  public KPS haePeli(char c) {
    return pelit.get(c);
  }

}
