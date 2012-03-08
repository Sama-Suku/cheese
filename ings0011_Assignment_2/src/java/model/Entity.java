package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Patrick Ings (ings0011@algonquinlive.com)
 */
public class Entity implements Serializable {
    
    private Date dateModified;

    private String entity;

    public Entity() { }
    
    public Entity(String entity){
        super();
        
        this.entity = entity;
        
        dateModified = new Date();
    }

    /**
     * @return the dateModified
     */
    public Date getDateModified() {
        return dateModified;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
        
        dateModified = new Date();
    }
    
    @Override
    public String toString(){
        return entity;
    }
}
