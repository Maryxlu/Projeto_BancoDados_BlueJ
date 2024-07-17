/**
 * Atualizar
 */
public class Atualizar {

    public static void main(String[] args) {
        Database db = new Database("banquinho");
        LavaJatoRepository lava = new LavaJatoRepository(db);

        LavaJato lava1 = lava.loadFromId(0);
        LavaJato lava2 = lava.loadFromId(1);

        lava1.setstoreName("LavaJato da Maluzinha");
        lava2.setstoreName("LavaJato da Mandraquinha");

        lava.update(lava1);
        lava.update(lava2);
    }
    
}
