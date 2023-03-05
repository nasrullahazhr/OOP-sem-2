package HW1;

public class nameTutor {
    String fname;
    String lname;
    String mname;

    public nameTutor(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;

    }

    

    public void setFname(String fName){
        // 'this' refers to the class attributes
        this.fname = fName;

    }
    public void setLname(String lName){
        // 'this' refers to the class attricbutes
        this.lname = lName;

    }
    public void setMname(String mName){
        // 'this' refers to the class attributes
        mname = mName;
    }

    public String getfname(){
        return fname;
    }

    public String getmname(){
        return mname;
    }

    public String getlname(){
        return lname;
    }   
}
