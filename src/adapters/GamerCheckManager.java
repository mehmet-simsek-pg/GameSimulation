package adapters;

import abstracts.ValitaionService;
import entities.Gamer;

public class GamerCheckManager implements ValitaionService {
    @Override
    public boolean validate(Gamer gamer) {
        return !gamer.getNationalIdentityNummer().startsWith("0") && gamer.getNationalIdentityNummer().length() <= 11;
    }
}
