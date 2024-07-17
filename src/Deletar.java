public class Deletar {
    
    public static void main(String[] args) {
        
        Database db = new Database("banquinho");
        LavaJatoRepository lava = new LavaJatoRepository(db);

        LavaJato lava1 = lava.loadFromId(0);
        LavaJato lava2 = lava.loadFromId(1);

        lava.delete(lava1);
        lava.delete(lava2);
    }
}