import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "student")
public class LavaJato
{   
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String storeName;
    
    @DatabaseField
    public int registration;

//Start GetterSetterExtension Source Code

    /**GET Method Propertie id*/
    public int getId(){
        return this.id;
    }//end method getId

    /**SET Method Propertie id*/
    public void setId(int id){
        this.id = id;
    }//end method setId

    /**GET Method Propertie storeName*/
    public String getstoreName(){
        return this.storeName;
    }//end method getstoreName

    /**SET Method Propertie storeName*/
    public void setstoreName(String storeName){
        this.storeName = storeName;
    }//end method setstoreName

    /**GET Method Propertie registration*/
    public int getRegistration(){
        return this.registration;
    }//end method getRegistration

    /**SET Method Propertie registration*/
    public void setRegistration(int registration){
        this.registration = registration;
    }//end method setRegistration

//End GetterSetterExtension Source Code


}//End class