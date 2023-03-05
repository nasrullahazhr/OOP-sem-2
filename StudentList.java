package HW1;

import java.util.jar.Attributes.Name;



public class StudentList {
    //list of student is an array of students
    int numOfStudent;
    int current_size = 1;


    Student studList[] = new Student[99];



    //method of operation

    //method overloading - parameter needs to be different
    // void insert(Student detail){
    //     studList[current_size++] = detail;

    // }

    void insert(Student s, int i ){
        studList[i] = s;

    }


    //find a particular student
    //checking weather name is the same as that in student
    public boolean find(name n){

        for(int i = 0; i< current_size ; i++){
            if (studList[i].nama == n){
                return true;
            }
        
        }
        return false;

    }
    public String getName(int count){
        return studList[count].nama.mname;

    }
    public float getavg(int count){
        return studList[count].calcAvg();


    }
    public float getMin(int count){
        return studList[count].calcMin();

    }
    public float getMax(int count){
        return studList[count].calcMax();
        
    }



    }







