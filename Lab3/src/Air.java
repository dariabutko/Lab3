public class Air extends Characters{
    Air(String name){
        super(name);
    }

    public void begin(){
        System.out.print("В котел начал поступать свежий "+this.getName()+", а ");
    }

    public void go(){
        System.out.print("нагретый "+this.getName()+" по трубке проходил прямо в шар. ");
    }
}