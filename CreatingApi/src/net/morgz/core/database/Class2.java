package net.morgz.core.database;
 
//import com.j256.ormlite.table.DatabaseTable;
 
//@DatabaseTable(tableName = "users")
public class Class2 {
    
  //  @DatabaseField(generatedId = true)
    private int id;
    
  //  @DatabaseField
    private String username;
    
  //  @DatabaseField
    private String email;
    
    public Class2() {
        // ORMLite needs a no-arg constructor 
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getUsername() {    
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}