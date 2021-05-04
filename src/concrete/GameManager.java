package concrete;

import abstracts.GameService;
import abstracts.SaleService;
import entities.Game;
import entities.Gamer;

public class GameManager implements GameService {
    private SaleService saleService;

    public GameManager(SaleService saleService) {
        this.saleService = saleService;
    }
    public void sale(Gamer gamer,Game game){
        saleService.saleUnit(gamer,game);
    }

    @Override
    public void save(Game game) {
        System.out.println(game.getGameName()+" added");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName()+" updated");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName()+" deleted");
    }
}
