/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise1;

/**
 *
 * @author ASUS
 */
public class Bicycle {
    private String ownerName;
    private String tagNo;
    private String id;
    
    public Bicycle() {
        ownerName = "Unknown";
        tagNo = "Unknown";
    }
    
    public Bicycle (String name, String ids){
        this.id=ids;
        this.ownerName=name;
    }
    
    public String getOwnerName(){
        return ownerName;
    } //setOwnerName is an instance method
    
    public String getTagNo(){
        return tagNo;
    }
    
    public void setOwnerName (String name){
        ownerName = name;
    }
    public void setTagNo (String number) {
        tagNo = number;
    }
}
