/*******************************************************************/
/**                                                               **/
/**                                                               **/
/**    Student Name                :  Patrick Ings                **/
/**    EMail Address               :  ings0011@algonquinlive.com  **/
/**    Student Number              :  040 635 941                 **/
/**    Student User ID             :  ings0011                    **/
/**    Course Number               :  CST 8218 Web App 2012       **/
/**    Lab Section Number          :  section 10                  **/
/**    Professor Name              :  Gerald Hurdle               **/
/**    Assignment Name/Number/Date :  JAR Tool/#2/March 16th      **/
/**    Optional Comments           :                              **/
/**                                                               **/
/**                                                               **/
/*******************************************************************/
package model;

import model.Entity;
import java.io.Serializable;
import java.util.ArrayList;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author Patrick Ings (ings0011@algonquinlive.com)
 * @version 1.0
 */
public class JARToolModel implements Serializable {
    
    private ArrayList<Entity> entityList;
    
    private boolean controlCheckbox;
    private boolean detailCheckbox;
    private boolean filtersCheckbox;
    
    public JARToolModel(){
        super();
        
        entityList = new ArrayList<Entity>();
        
        entityList.add(new Entity("test"));
        
        controlCheckbox = true;
        
        detailCheckbox = false;
        
        filtersCheckbox = false;
    }
    
    public int getNumberOfEnteries() {
        return entityList.size();
    }

    /**
     * @return the entityList
     */
    public ArrayList<Entity> getEntityList() {
        return entityList;
    }

    /**
     * @return the controlCheckbox
     */
    public boolean isControlCheckbox() {
        return controlCheckbox;
    }

    /**
     * @return the detailCheckbox
     */
    public boolean isDetailCheckbox() {
        return detailCheckbox;
    }

    /**
     * @return the filtersCheckbox
     */
    public boolean isFiltersCheckbox() {
        return filtersCheckbox;
    }

    /**
     * @param controlCheckbox the controlCheckbox to set
     */
    public void setControlCheckbox(boolean controlCheckbox) {
        this.controlCheckbox = controlCheckbox;
    }

    /**
     * @param detailCheckbox the detailCheckbox to set
     */
    public void setDetailCheckbox(boolean detailCheckbox) {
        this.detailCheckbox = detailCheckbox;
    }

    /**
     * @param filtersCheckbox the filtersCheckbox to set
     */
    public void setFiltersCheckbox(boolean filtersCheckbox) {
        this.filtersCheckbox = filtersCheckbox;
    }
    
    public void append(Entity entity){
        entityList.add( entity );
    }
    
}
