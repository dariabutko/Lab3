import java.util.Objects;

public class Balloon extends Characters{
    Balloon (Object name){
        super((String) name);

    }

    private final String biggerandBigger = " все больше и больше ";

    public boolean equals(Balloon obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Balloon balloon = (Balloon) obj;
        return Objects.equals(biggerandBigger, balloon.biggerandBigger);
    }
    @Override
    public int hashCode(){
        return Objects.hash(biggerandBigger)*33;
    }

    public void become(){
        System.out.print(Time.GRADUALLY.getTimeName()+" "+this.getName()+" под сеткой становился"+biggerandBigger+"и уже начал вылезать из корзины.");
    }
}
