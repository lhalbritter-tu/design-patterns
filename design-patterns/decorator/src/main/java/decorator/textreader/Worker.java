package decorator.textreader;

import java.io.IOException;

public class Worker implements TextReader {
  public void write( String[] s ) {
    System.out.print( "Input:\t\t" );
    try {
      s[0] = in.readLine();
    } catch (IOException ex) { ex.printStackTrace(); }
  }
  public void read( String[] s ) {
    System.out.println( "Output:\t\t" + s[0] );
  }
}
