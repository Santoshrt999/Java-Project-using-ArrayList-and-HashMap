
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Santosh Goteti
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Patient p = new Patient("raj", "california", "coghing", 355345);
        Patient p1 = new Patient("rajdeep", "Amsterdam", "coghing", 123445);
        Patient p2 = new Patient("kulraj", "london", "sneexing", 23215);
        Patient p3 = new Patient("ambaraj", "jersey", "woflign", 123445);

        bday b = new bday(1, new Date(2012, 12, 23, 11, 15, 23), new ArrayList<Patient>());
        b.getPl().add(p);
        System.out.println(b);
        bday b1 = new bday(2, new Date(2022, 12, 25), new ArrayList<Patient>());
        b1.getPl().add(p1);
        bday b2 = new bday(3, new Date(2003, 11, 25), new ArrayList<Patient>());
        b2.getPl().add(p2);
        bday b3 = new bday(4, new Date(2004, 10, 25), new ArrayList<Patient>());
        b3.getPl().add(p3);

//        List<bday> plist = new ArrayList<bday>();
//        plist.add(b);
//        plist.add(b1);
//        System.out.println(b);
        Map<Patient, bday> hmap = new HashMap<Patient, bday>();
        hmap.put(p, b);
        hmap.put(p1, b1);
        hmap.put(p2, b2);
        hmap.put(p3, b3);

        for (Patient px : b.getPl()) {
            System.out.println(px);
            //  System.out.println(hmap.get(p1));

        }

    }
}
