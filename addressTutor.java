package HW1;

public class addressTutor {
    String nounit;
    String road;
    String district;
    String postcode;
    String state;


    public addressTutor(String nounit, String road, String district, String postcode, String state){
        this.nounit = nounit;
        this.road = road;
        this.district = district;
        this.postcode = postcode;
        this.state = state;

    }

    

    public void setNounit(String nounit){
        // 'this' refers to the class attributes
        this.nounit = nounit;

    }
    public void setRoad(String road){
        // 'this' refers to the class attricbutes
        this.road = road;

    }
    public void setDistrict(String district){
        // 'this' refers to the class attributes
        this.district = district;
    }
    public void setPostcode(String postcode){
        // 'this' refers to the class attributes
        this.postcode = postcode;
    }
    public void setState(String state){
        // 'this' refers to the class attributes
        this.state = state;
    }

    public String getNounit(){
        return nounit;
    }

    public String getRoad(){
        return road;
    }

    public String getDistrict(){
        return district;
    }
    public String getPostcode(){
        return postcode;
    }
    public String getState(){
        return state;
    }    
}       
