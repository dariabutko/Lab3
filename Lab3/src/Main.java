public class Main {
    public static void main(String[] args) {
        hissInterface hiss = new Hiss("Шипение");
        hiss.silent();
        laughInterface laugh = new Laugh("взрыв смеха");
        laugh.sound();
        gunkaInterface gunka = new Gunka("Незнайкин друг Гунька");
        gunka.laugh();
        gunka.fall();
        gunka.hurt();
        pilulkinInterface pilulkin = new Pilulkin("доктору Пилюлькину");
        pilulkin.treat();
        pilulkin.smear();
        ZnaikaInterface znaika = new Znaika("Знайка");
        znaika.notpayattention();
        znaika.connect();
        znaika.order();
        Air air = new Air("воздух");
        air.begin();
        air.go();
        Balloon balloon = new Balloon(new String("шар"));
        balloon.become();
    }
}
