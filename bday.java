
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santosh Goteti
 */
public class bday {
    
    private int pId;
    private Date birthday;
    private List<Patient> pl;
//    private Time time;

   

//    public Time getTime() {
//        return time;
//    }
//
//    public void setTime(Time time) {
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(birthday);
//        this.time = (Time) cal.getTime();
//    }
    

    public List<Patient> getPl() {
        return pl;
    }

    public void setPl(List<Patient> pl) {
        this.pl = pl;
    }
    
    
    
    

    public bday(int pId, Date birthday, List<Patient> pl ){
        this.pId = pId;
        this.birthday = birthday;
        this.pl=pl;
     //   this.time=time;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

  

    
    public void setBirthday(int year, int month, int date){
    
        Calendar cal = Calendar.getInstance();
        cal.set(pId, pId, pId, pId, pId, pId);
        this.birthday=cal.getTime();
    
    
    }
    
      public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "bday{" + "pId=" + pId + ", birthday=" + birthday + '}';
    }
    
    
}
