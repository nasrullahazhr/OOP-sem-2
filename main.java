package HW1;

import lab.lab2.studentList;
import java.util.Scanner;

public class main{
    // application code
	public static void main(String[] args) {
        Student adila = new Student();
        Student imran = new Student();
        Teacher cikguminah = new Teacher();
        Scanner input = new Scanner(System.in);


        name Name;
        nameTutor tutorname;


        
        Student akmal = new Student();

        //creating a batch object   
        StudentList sb2023 = new StudentList();
        sb2023.insert(akmal, 0);

        //creating teacher list object
        TeacherList tutorList = new TeacherList();
        tutorList.insert(cikguminah, 0);


        

        //declare a method that allows for the following
        //tutor's name
        System.out.println("TUTOR\n-------------------------------");
        System.out.print("Enter your first name: ");
        String tutFname = input.next();

        System.out.print("Enter your middle name: ");
        String tutMname = input.next();

        System.out.print("Enter your last name: ");
        String tutLname = input.next();

        tutorname = new nameTutor(tutFname, tutMname, tutLname);
        cikguminah.setName(tutorname);  
        
        System.out.println("Address");
        System.out.print("Enter your no unit: ");
        String tutNounit = input.next();

        System.out.print("Enter address road: ");
        String tutRoad = input.next();

        System.out.print("Enter the district: ");
        String tutDistrict = input.next();

        System.out.print("Enter postcode: ");
        String tutPostcode = input.next();

        System.out.print("Enter state: ");
        String tutState = input.next();

        addressTutor adrsTutor = new addressTutor(tutNounit, tutRoad, tutDistrict, tutPostcode, tutState);
        cikguminah.setAddress(adrsTutor);


        boolean opt = true;
        int counter = 0;
        while(opt == true){
            akmal = new Student();
        
            System.out.println("STUDENT\n-------------------------------");
            System.out.print("Enter first name: ");
            String studFname = input.next();


            System.out.print("Enter middle name: ");
            String studMname = input.next();

            System.out.print("Enter last name: ");
            String studLname = input.next();

            Name = new name(studFname, studMname, studLname);
            akmal.setName(Name);

            System.out.println("Address");
            System.out.print("Enter your no unit: ");
            String studNounit = input.next();

            System.out.print("Enter address road: ");
            String studRoad = input.next();

            System.out.print("Enter the district: ");
            String studDistrict = input.next();

            System.out.print("Enter postcode: ");
            String studPostcode = input.next();

            System.out.print("Enter state: ");
            String studState = input.next();

            addressStud adrsStud = new addressStud(studNounit, studRoad, studDistrict, studPostcode, studState);
            akmal.setAddress(adrsStud);





            // boolean isIn = sb2023.find(akmal.nama);
            // System.out.print(isIn);


            
            
            for (int i=0; i<5; i++)
                try{
                System.out.println("Enter your mark for subject " + i + ": ");
                float mark = input.nextFloat();
                akmal.setMark(mark, i);
                } catch(Exception ex){
                    
                System.out.println("Cannot Continue");
                ex.printStackTrace();
                }
            sb2023.insert(akmal, counter); 
            counter++;           
            // calculate and print the avg
            // float avg = 0;
            // avg = akmal.calcAvg();
            // System.out.println("Avg Mark for "+ akmal.nama.mname + ":" + avg);
            
            // // calculate the min marks for student
            // System.out.println("Min = " + akmal.calcMin());

            System.out.print("Do you want to register for another student? [y/n]: ");
                String opt2 = input.next();
                switch(opt2){
                    case ("n"):
                        opt = false;
                        break;
                    case ("y"):
                        opt = true;
                        break;
                    
                }

            
        }
        for(int i = 0; i < counter; i++){
            System.out.println("\nName: " + sb2023.getName(i));
            
            // calculate and print the avg
            float avg = 0;
            avg = akmal.calcAvg();
            System.out.println("Avg Mark:" + avg);
            
            // calculate the min marks for student
            System.out.println("Min = " + sb2023.getMin(i));
            
            System.out.println("Max = " + sb2023.getMax(i)); 
        }   
	}
}
