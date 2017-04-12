/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Shoaib
 */
@Entity
@Table(name="Scheme")
public class Scheme implements Serializable {
     @Id
    private int id;
     @Column
    private String schemeName;
     @Column
    private String Time;
    
    @Column
    private String State;

    public void setId(int id) {
        this.id = id;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getId() {
        return id;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public String getTime() {
        return Time;
    }

    public String getState() {
        return State;
    }
   
     
    
}
