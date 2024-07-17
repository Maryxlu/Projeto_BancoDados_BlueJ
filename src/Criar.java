public class Criar {
    
    public static void main(String[] args) {
        
        Database db = new Database("banquinho");
        LavaJatoRepository lava = new LavaJatoRepository(db);
        LavaJato lava1 = new LavaJato();
        LavaJato lava2 = new LavaJato();

        lava1.setstoreName("LavaJato Marguerite");
        lava1.setId(0);
        lava1.setRegistration(0);
        
        lava2.setstoreName("LavaJato da Maria");
        lava2.setId(1);
        lava2.setRegistration(1);

        lava.create(lava1);
        lava.create(lava2);
    }
}