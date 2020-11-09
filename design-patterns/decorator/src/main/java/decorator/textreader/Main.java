package decorator.textreader;

public class Main {

  public static void main( String[] args ) {
    System.out.println( "main:\t\tlet's start!");

    //two decorators are called (Authentication and Scrambling) if there are more implemented, there could be as many decorators as possible
    TextReader stream = new Authentication( new Scrambling( new Worker() ) );
    //This could also look like this:
    //TextReader stream = new Scrambling(new Authentication(new Worker()));
    String[] str =  { new String() };
    stream.write( str );
    System.out.println( "main:\t\t" + str[0] );
    stream.read( str );
  }
}
