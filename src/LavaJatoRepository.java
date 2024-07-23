import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import com.j256.ormlite.table.TableUtils;
import java.util.List;
import java.util.ArrayList;

public class LavaJatoRepository
{
    private static Dao<LavaJato, Integer> dao;
    private List<LavaJato> loadedLavaJatos;
    private LavaJato loadedLavaJato; 
    
    public LavaJatoRepository(Database database) {
        LavaJatoRepository.setDatabase(database);
        loadedLavaJatos = new ArrayList<LavaJato>();
    }
    
    public static void setDatabase(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), LavaJato.class);
            TableUtils.createTableIfNotExists(database.getConnection(), LavaJato.class);
        }
        catch(SQLException e) {
            System.out.println(e);
        }            
    }
    
    public LavaJato create(LavaJato LavaJato) {
        int nrows = 0;
        try {
            nrows = dao.create(LavaJato);
            if ( nrows == 0 )
                throw new SQLException("Error: object not saved");
            this.loadedLavaJato = LavaJato;
            loadedLavaJatos.add(LavaJato);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return LavaJato;
    }    

    public void update(LavaJato LavaJato) {
      try {
        dao.update(LavaJato);
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    public void delete(LavaJato LavaJato) {
      try {
        dao.delete(LavaJato);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    
    public LavaJato loadFromId(int id) {
        try {
            this.loadedLavaJato = dao.queryForId(id);
            if (this.loadedLavaJato != null)
                this.loadedLavaJatos.add(this.loadedLavaJato);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedLavaJato;
    }    
    
    public List<LavaJato> loadAll() {
        try {
            this.loadedLavaJatos =  dao.queryForAll();
            if (this.loadedLavaJatos.size() != 0)
                this.loadedLavaJato = this.loadedLavaJatos.get(0);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedLavaJatos;
    }

    // getters and setters ommited...        
}
