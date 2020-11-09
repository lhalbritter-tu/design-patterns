package decorator.textreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * API for the core class and Decorator of a simple TextReader Software
 * using the Decorator Design Pattern
 */
public interface TextReader {
  BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  void write(String[] s);
  void read(String[] s);
}
