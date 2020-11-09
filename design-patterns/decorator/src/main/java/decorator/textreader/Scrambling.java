package decorator.textreader;

import java.util.Base64;

public class Scrambling extends Decorator {

    public Scrambling(TextReader inner) {
        this.inner = inner;
    }

    public void write(String[] s) {
        this.inner.write(s);
        s[0] = Base64.getEncoder().encodeToString(s[0].getBytes());
        System.out.print("encrypt:\n");
    }

    public void read(String[] s) {
        s[0] = new String(Base64.getDecoder().decode(s[0]));
        System.out.print("decrypt:\n");
        this.inner.read(s);
    }
}
