import java.util.SplittableRandom;

interface ZnaikaInterface {
    public void notpayattention();
    public void connect();
    public void order();
}

public class Znaika extends Characters implements ZnaikaInterface{

    Znaika(String name) {
        super(name);
    }

    private String kotelsharom = "котел с шаром длинной трубкой";

    public String connectkotel(){
        return this.kotelsharom;
    }

    @Override
    public void notpayattention() {
        System.out.print("Но "+this.getName()+" " +Time.THISTIME.getTimeName()+" не обратил на насмешки внимания. ");
    }

    @Override
    public void connect() {
        System.out.print("Он соединил "+connectkotel());
    }
    @Override
    public String toString(){
        return kotelsharom;
    }

    @Override
    public void order(){
        System.out.print(" и приказал качать насос. ");
    }
}
