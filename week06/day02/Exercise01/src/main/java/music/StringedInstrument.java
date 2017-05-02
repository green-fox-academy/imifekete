package main.java.music;

/**
 * Created by Fekete Imre on 2017.04.18..
 */
public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  final String formatForPlay ="%s, a %d-stringed instrument that %s\n";

  public StringedInstrument(){
  }

  public StringedInstrument(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument (StringedInstrument name, int numberOfStrings){
    super();
    this.numberOfStrings = numberOfStrings;

  }

}
