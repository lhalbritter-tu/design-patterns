package decorator.textreader;

import java.io.IOException;

public class Authentication extends Decorator {

    private String pw;

    public Authentication(TextReader inner) {
        this.inner = inner;
    }

    public void write(String[] s) {
        System.out.print( "PASSWORD:\t\t" );
        try {
            this.pw = in.readLine();
            s[0] = this.pw;
        } catch (IOException ex) { ex.printStackTrace(); }
        this.inner.write(s);
    }

    public void read(String[] s) {
        System.out.print("PASSWORD:\t\t");
        String pass = "";
        try {
            pass = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (this.pw.equals(pass)) {
            this.inner.read(s);
        }else{
            System.out.print("Output:\t\tWrong Password!");
        }
    }
}
