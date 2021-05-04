package concrete;

import abstracts.GamerService;
import abstracts.ValitaionService;
import entities.Gamer;

public class GamerManager implements GamerService {
    private ValitaionService valitaionService;

    public GamerManager(ValitaionService valitaionService) {
        this.valitaionService = valitaionService;
    }

    @Override
    public void save(Gamer gamer) {
        if (valitaionService.validate(gamer)){
            System.out.println(gamer.getFirstName()+" added");
        }
        else {
            System.out.println("Invalid national id");
        }
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" updated");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" deleted");
    }
}
