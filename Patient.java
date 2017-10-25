/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santosh Goteti
 */
public class Patient {
    private String patientname;
    private String address;
    private String allergyname;
    private int phonenum;
    

    public Patient(String patientname, String address, String allergyname, int phonenum) {
        this.patientname = patientname;
        this.address = address;
        this.allergyname = allergyname;
        this.phonenum = phonenum;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAllergyname() {
        return allergyname;
    }

    public void setAllergyname(String allergyname) {
        this.allergyname = allergyname;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientname=" + patientname + ", address=" + address + ", allergyname=" + allergyname + ", phonenum=" + phonenum + '}';
    }
    
    
}
