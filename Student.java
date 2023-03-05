package HW1;

import java.security.PublicKey;
import java.lang.Float;

// created by team in KL
public class Student {
    // data/attributes
    name nama;
    String kp;
    addressStud address;
    String schoolname;
    String fname;
    String adds[] = new String[6];
    float marks[] = new float[5];
    
    // methods or operations
    public void setIC(String kp){
        this.kp = kp; 
    }
    public String getIC(){
        return kp;
    }

    public void setSchoolName(String schName){
        schoolname = schName;
    }
    public void setAddress(addressStud address){
        this.address = address;
    }
    public float calcAvg() {
        float avg = 0, sum = 0;
        for(int i = 0; i < marks.length ;i++ ){
            sum += marks[i];

        }
        avg = sum/5;
        return avg;
    }
    
    public float calcMin() {
        float lowest = 100;
        for (int i = 0; i < marks.length ; i++){
            if (marks[i] < lowest ){
                lowest = marks[i];

            }
        }
        return lowest;
    }

    public float calcMax(){
        float highest = 0;
        for (int i = 0; i < marks.length ; i++){
            if (marks[i] > highest ){
                highest = marks[i];

            }
        }
        return highest;
    }

    public void setName(name thename) {
        nama = thename;
    }

    
    public void setMark(float mark, int i) throws Exception {
        // if (mark > 0){
        //     marks[i] = mark;
        // }
        // else 
        //     System.out.println("error!");

        if (mark < 0){
            throw new Exception("Error in mark detected");

        }
        marks[i] = mark;
        if (i > 4){
            throw new Exception("index out of bound");
        }
    }

    // void displayMarks(){ // debug the code
    //     for (int x = 0; x < marks.length; x++){
    //         System.out.println("Student" + x + ": " + marks[x]); 

    //     }
    // }



    // public static void main(String args[]){
    //     Student stud0 = new Student();

    //     try { // try block something in here can cause exception
    //         stud0.setMark(10, 0);
    //         stud0.setMark(-10, 1);
    //     } catch (Exception ex){ // catch; action to be taken in case of exception

    //         System.out.println("Cannot Continue");
    //         ex.printStackTrace();

    //     }
    //     stud0.displayMarks();
    
    // }
}