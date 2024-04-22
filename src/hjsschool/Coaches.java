
package hjsschool;

import java.util.ArrayList;

public class Coaches {
    
       
    private int coachNo;
    private String fullname;
    private String email;
    private String password;
    private String contactNo;

    public static ArrayList <Coaches> coachhdata = new ArrayList<>();

    public Coaches(int coachNo, String fullname, String email, String password, String contactNo) {
        this.coachNo = coachNo;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.contactNo = contactNo;
    }

    public int getCoachNo() {
        return coachNo;
    }

    public String getFullname() {
        return fullname;
    }
      
    public static ArrayList<Coaches> getCoaches() {
        
        Coaches c1 = new Coaches(6001,"Tara Matthews","tara@gmail.com","123456","01842 815874");
        Coaches c2 = new Coaches(6002,"Connor Russell","connor@gmail.com","123456","01563 531967");
        Coaches c3 = new Coaches(6003,"Eden Harrison","eden@gmail.com","123456","01924 454116");
        Coaches c4 = new Coaches(6004,"Christopher Patel","christopher@gmail.com","123456","01274 419750");
        Coaches c5 = new Coaches(6005,"Sophie Wright","sophie@gmail.com","123456","01623 651129");
        Coaches c6 = new Coaches(6006,"Jordan Baker","jordan@gmail.com","123456","01463 233032");
        
        Coaches.coachhdata.add(c1);
        Coaches.coachhdata.add(c2);
        Coaches.coachhdata.add(c3);
        Coaches.coachhdata.add(c4);
        Coaches.coachhdata.add(c5);
        Coaches.coachhdata.add(c6);
        
        return coachhdata;
    }

    
    /**
     * Method to find coach by coachNo
     * @param coaches
     * @param coachNum
     * @return 
     */
    public static Coaches findCoachById(ArrayList<Coaches> coaches, int coachNum){
        
        ArrayList<Coaches> coachData = Coaches.getCoaches();
        
        Coaches objData = null;
        for (Coaches obj : coachData) {
            if(obj.getCoachNo() == coachNum){
                objData = obj;
            }
        }
        return objData;
    }
    
}
