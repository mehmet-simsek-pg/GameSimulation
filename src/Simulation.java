
import adapters.GamerCheckManager;
import concrete.GameManager;
import concrete.GamerManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import java.util.Calendar;
import java.util.Date;

public class Simulation {
    public static void main(String[] args) {
        GamerManager gamerManager=new GamerManager(new GamerCheckManager());
        gamerManager.save(new Gamer(1,"mehmet","tokat","12345678910",new Date(1993,Calendar.JANUARY,9)));


        GameManager gameManager=new GameManager(new SaleManager());
        gameManager.sale(new Gamer(4,"mehmet","simsek","123456789101",new Date(1993, Calendar.JANUARY,9)),
               new Game(2,5000,"GTA 5",new Campaign(5,"2 buy 1 pay",20)));



    }
}