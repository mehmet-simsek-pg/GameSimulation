package abstracts;
import entities.Gamer;

public interface GamerService {
    void save(Gamer gamer);
    void update(Gamer gamer);
    void delete(Gamer gamer);
}
