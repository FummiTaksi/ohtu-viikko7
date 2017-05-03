package ohtu.kivipaperisakset;


public class Kayttoliittyma {
  private IO io;

  public Kayttoliittyma() {
    this.io = new IO();
  }

  public void kaynnista() {
    while (true) {
        io.print("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");

        String vastaus = io.readLine();
        if (vastaus.endsWith("a")) {
            io.print("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            KPS kaksinpeli = new KPS(new Ihminen(io), new Ihminen(io), io);
            kaksinpeli.pelaa();
        } else if (vastaus.endsWith("b")) {
            System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            KPS  yksinpeli= new KPS(new Ihminen(io), new Tekoaly(), io);
            yksinpeli.pelaa();
        } else if (vastaus.endsWith("c")) {
            io.print("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            KPS pahaYksinpeli = new KPS(new Ihminen(io), new TekoalyParannettu(20), io);
            pahaYksinpeli.pelaa();
        } else {
            break;
        }
    }
  }
}
