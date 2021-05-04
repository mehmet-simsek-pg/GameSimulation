package concrete;

import abstracts.SaleService;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService {

    @Override
    public void saleUnit(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName()+" bought "+game.getGameName()+"\nGame prices:"+game.getPriceAfterCampaign());
    }
}
