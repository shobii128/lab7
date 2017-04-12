/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Challenge implements Serializable {
   @Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "id")  
private int id;  

@Column
private String TimeTaken;
@Column
private String C_State;

    public int getId() {
        return id;
    }

    public String getTimeTaken() {
        return TimeTaken;
    }

    public String getC_State() {
        return C_State;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimeTaken(String TimeTaken) {
        this.TimeTaken = TimeTaken;
    }

    public void setC_State(String C_State) {
        this.C_State = C_State;
    }
    
   

    
    
    
}
