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
package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import model.Entity;
import model.JARToolModel;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author Patrick Ings (ings0011@algonquinlive.com)
 * @version 1.0
 */
@ManagedBean(name="controller")
@SessionScoped

public class JARToolController implements Serializable {
    
    private JARToolModel model;
    
    public JARToolController(){
        super();
        
        model = new JARToolModel();
    }
    
    public int compareEnteries(Object todo1, Object todo2){
        return todo1.toString().compareToIgnoreCase(todo2.toString());
    }

    /**
     * @return the model
     */
    public JARToolModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(JARToolModel model) {
        this.model = model;
    }
    
    public void handleJAR(FileUploadEvent event){
        Entity entity = new Entity("JUST WORK ALREADY");
        model.append(entity);
    }

}
