package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Ihminen implements Pelaaja {

  private IO io;
  private String siirto;

  public Ihminen(IO io) {
    this.io = io;
  }
  @Override
  public void setSiirto() {
    this.siirto = io.readLine();
  }
  @Override
  public String getSiirto() {
    return siirto;
  }
  @Override
  public boolean tekoAlynOhjaama() {
    return false;
  }
}
