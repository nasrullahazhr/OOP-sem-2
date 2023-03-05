package HW1;

// createed by team in Bangalore
public class Teacher {
    // data
    nameTutor name;
    String ic;
    addressTutor address;
    int numyearexp;
    String qualification;
    
    // op
    // set
    public void setName(nameTutor name){
        this.name = name; 
    }
    public void setAddress(addressTutor address){
        this.address = address;
    }
    public void setYearExp(int year){
        numyearexp = year;
    }
    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    //getter
    public nameTutor getName(){
        return name;
    }
    
    public int getYearExp(){
        return numyearexp;

    }
    public String getQual(){
        return qualification;

    }
    
    
    
}