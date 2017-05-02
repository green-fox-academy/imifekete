package main.java.music;

/**
 * Created by Fekete Imre on 2017.04.18..
 */
public abstract class Instrument {

  protected String name;

  public Instrument(){
  }

  public Instrument(String name){
    this.name = name;
  }

  abstract void play();
}
