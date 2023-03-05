package HW1;

public class TeacherList {
        //list of student is an array of students
        int numOfStudent;
        int current_size = 0;
    
    
        Teacher studList[] = new Teacher[3];
    
    
    
        //method of operation
    
        //method overloading - parameter needs to be different
        void insert(Teacher detail){
            studList[current_size++] = detail;
    
        }
    
        void insert(Teacher s, int i ){
            studList[i] = s;
    
        }
}
