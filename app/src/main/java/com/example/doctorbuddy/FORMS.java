package com.example.doctorbuddy;

public class FORMS {

    String id;
    String NAME;
    String Email;
    String GENDER;
    String BLOOD;
    String CAT;
    String TEST;
    String YES;
    String ADDRESS;
    Integer AGE;
    Integer DOB;
    String MEDICAL;
    Integer INSURANCE;
    String PHYSICAL;
    String MARITAL;
    Integer MOBILE;
    String DOCTOR;


    public FORMS(){


    }

    public FORMS(String id,String NAME, String email, String GENDER, String BLOOD, String CAT, String TEST, String YES, String ADDRESS, Integer AGE, Integer DOB, String MEDICAL, Integer INSURANCE, String PHYSICAL, String MARITAL, Integer MOBILE,String DOCTOR) {
        this.id = id;
        this.NAME = NAME;
        this.Email = email;
        this.GENDER = GENDER;
        this.BLOOD = BLOOD;
        this.CAT = CAT;
        this.TEST = TEST;
        this.YES = YES;
        this.ADDRESS = ADDRESS;
        this.AGE = AGE;
        this.DOB = DOB;
        this.MEDICAL = MEDICAL;
        this.INSURANCE = INSURANCE;
        this.PHYSICAL = PHYSICAL;
        this.MARITAL = MARITAL;
        this.MOBILE = MOBILE;
        this.DOCTOR=DOCTOR;
    }

    public String getId() {
        return id;
    }

    public String getNAME() {
        return NAME;
    }

    public String getEmail() {
        return Email;
    }

    public String getGENDER() {
        return GENDER;
    }

    public String getBLOOD() {
        return BLOOD;
    }

    public String getCAT() {
        return CAT;
    }

    public String getTEST() {
        return TEST;
    }

    public String getYES() {
        return YES;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public Integer getAGE() {
        return AGE;
    }

    public Integer getDOB() {
        return DOB;
    }

    public String getMEDICAL() {
        return MEDICAL;
    }

    public Integer getINSURANCE() {
        return INSURANCE;
    }

    public String getPHYSICAL() {
        return PHYSICAL;
    }

    public String getMARITAL() {
        return MARITAL;
    }

    public Integer getMOBILE() {
        return MOBILE;
    }

    public String getDOCTOR() {
        return DOCTOR;
    }
}
