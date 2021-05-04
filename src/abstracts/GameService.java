package abstracts;

import entities.Game;

public interface GameService {
    void save(Game game);
    void update(Game game);
    void delete(Game game);
}
