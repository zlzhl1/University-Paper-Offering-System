/*
ID: 21012755; Name: Zhaohui Liang
*/
import java.lang.Math;

public class Main {

    private static void displayInfo(){
        System.out.println("*************************************");
        System.out.println("Assignment 1, 159.234 Semester 1 2022");
        System.out.println("Submitted by: Zhaohui, Liang, ID: 21012755");
        System.out.println("My Major at Massey : Computer Science");
        System.out.println("*************************************");
        System.out.println();
    }


    //Store papers' information
    private static Paper [] papers = new Paper[7];
    //Store lecturers' information
    private static Lecturer [] lecturers = new Lecturer[10];


    //Use constructors to import information
    private static void Load_papers(){
        papers[0] = new Paper(158100,"Information Technology Principles","IT IS",
                70,30,0, "", "", "");
        papers[1] = new Paper(158120,"Web-based IT Fundamentals ","IT IS",
                60,40,0, "", "", "");
        papers[2] = new Paper(159101,"Applied Programming","IT IS CS DS SE",
                50,50,0, "", "", "");
        papers[3] = new Paper(159201,"Algorithms and Data Structures","CS DS SE IS",
                40,20,40, "", "", "");
        papers[4] = new Paper(159234,"Object-Oriented Programming","CS SE",
                50,10,40, "", "", "");
        papers[5] = new Paper(158337,"Database Development","IT SE DS",
                60,0,40, "", "", "");
        papers[6] = new Paper(158345,"Professionalism in the Information Sciences","IT IS CS DS SE",
                100,0,0, "", "", "");
    }


    //Use constructors to import information
    private static void Load_lectures(){
        lecturers[0] = new Lecturer(1105236,"Amy","Sheffield","PN",0);
        lecturers[1] = new Lecturer(1235894,"Victoria","Jensen","PN",0);
        lecturers[2] = new Lecturer(7225669,"James","Lee","PN",0);
        lecturers[3] = new Lecturer(1328991,"Colin","Delmont","PN",0);
        lecturers[4] = new Lecturer(1562347,"Thomas","Becker","Auckland",0);
        lecturers[5] = new Lecturer(5664789,"Steven","Hobbs","Auckland",0);
        lecturers[6] = new Lecturer(3658947,"Andrew","Jackson","Auckland",0);
        lecturers[7] = new Lecturer(6332698,"Jonathon","Wood","Auckland",0);
        lecturers[8] = new Lecturer(12345678,"Mickey","Mouse","Auckland",0);
        lecturers[9] = new Lecturer(21012755,"Liang","Zhaohui","Auckland",0);
    }


    private static void Assignment(){                   //Assign lessons to teachers
        for(int i = 0; i < papers.length; i ++){
            int index = 0;
            //Random number generation
            do {index = (int)(Math.random() * lecturers.length);}
            //Each teacher teaches a maximum of four subjects
            while(lecturers[index].Get_Howmany() == 4);
            lecturers[index].Set_Howmany(lecturers[index].Get_Howmany() + 1);
            //Import teacher information into the course
            papers[i].Set_Lecturer_Distance(lecturers[index].Get_FirstName() + " " + lecturers[index].Get_LastName());


            //Random number generation
            do {index = (int)(Math.random() * lecturers.length);}
            //Each teacher teaches a maximum of four subjects and lecturer in Anckland can't give PN's papers' Line class
            while(lecturers[index].Get_Howmany() == 4 || lecturers[index].Get_campus().equals("PN"));
            lecturers[index].Set_Howmany(lecturers[index].Get_Howmany() + 1);
            //Import teacher information into the course
            papers[i].Set_Lecturer_Anckland(lecturers[index].Get_FirstName() + " " + lecturers[index].Get_LastName());


            //Random number generation
            do {index = (int)(Math.random() * lecturers.length);}
            //Each teacher teaches a maximum of four subjects and lecturer in Anckland can't give Anckland's papers' Line class
            while(lecturers[index].Get_Howmany() == 4 || lecturers[index].Get_campus().equals("Anckland"));
            lecturers[index].Set_Howmany(lecturers[index].Get_Howmany() + 1);
            //Import teacher information into the course
            papers[i].Set_Lecturer_PN(lecturers[index].Get_FirstName() + " " + lecturers[index].Get_LastName());


            System.out.println(papers[i].Get_Number() + "  " + "Distance" + "\t" + papers[i].Get_Lecturer_Distance());
            System.out.println(papers[i].Get_Number() + "  " + "Anckland" + "\t" + papers[i].Get_lecturer_Anckland());
            System.out.println(papers[i].Get_Number() + "  " + "PN      " + "\t" + papers[i].Get_lecturer_PN());
        }
    }


    public static void main(String[] args) {
        displayInfo();


        System.out.println("-------------- Task 1 ---------------------");
        System.out.println("School Full Name: School of Mathematical and Computational Sciences");
        System.out.println();
        Load_papers();


        System.out.println("-------------- Task 2 ---------------------");
        System.out.println("All papers details: ");
        for(int i = 0; i < papers.length; i ++){
            System.out.println(papers[i].Get_Number() + " " + papers[i].Get_Name() + " " + "(" + papers[i].Get_Belong_Major() + " )");
        }
        System.out.println();


        System.out.println("-------------- Task 3 ---------------------");
        System.out.println("Papers that belong to Major CS: ");
        int l = 0;
        for(int i = 0; i < papers.length; i ++){
            //Determine if CS is included
            if(papers[i].Get_Belong_Major().contains("CS")){
                System.out.println("Paper - " + papers[i].Get_Number() + " " + papers[i].Get_Name());
                l ++;
            }
        }
        System.out.println("Total matching papers in specified Major - CS :" + l);
        System.out.println();


        System.out.println("-------------- Task 4 ---------------------");
        System.out.println("Paper that have exam: ");
        int k = 0;
        for(int i = 0; i < papers.length; i ++){
            //Determine whether it contains exam
            if(papers[i].Get_Per_Exam() != 0){
                System.out.println("Paper - " + papers[i].Get_Number() + " " + papers[i].Get_Name());
                k ++;
            }
        }
        System.out.println("Total number of papers that have exam: "+ k);
        System.out.println();


        System.out.println("-------------- Task 5 ---------------------");
        System.out.println("Paper that their assignment weight higher than 50.0%: ");
        int m = 0;
        for(int i = 0; i < papers.length; i ++){
            //Judge the ratio of assignment
            if(papers[i].Get_Per_Assignment() > 50){
                System.out.println("Paper - " + papers[i].Get_Number() + " " + papers[i].Get_Name());
                m ++;
            }
        }
        System.out.println("Total number of papers that have assignments weighted more than 50%: "+ m);
        System.out.println();


        Load_lectures();
        System.out.println("-------------- Task 6 ---------------------");
        System.out.println("Paper offering details: ");
        Assignment();
        System.out.println();


        System.out.println("-------------- Task 7 ---------------------");
        System.out.println("The paper offerings that I teach: ");
        int n = 0;
        for(int i = 0; i < papers.length; i ++){
            //Check if the teacher's name matches mine
            //the third judge about PN could be ingored, because I'm Anckland
            if(papers[i].Get_Lecturer_Distance().equals("Liang Zhaohui") || papers[i].Get_lecturer_Anckland().equals("Liang Zhaohui")
                    || papers[i].Get_lecturer_PN().equals("Liang Zhaohui")){
                System.out.println("Paper - " + papers[i].Get_Number() + " " + papers[i].Get_Name());
                n ++;
            }
        }
        System.out.println("I'm teaching " + n + " paper(s)");
        System.out.println();


        System.out.println("-------------- Task 8 ---------------------");
        System.out.println("The lecturer of Anckland offering of 159234: ");
        for(int i = 0; i < papers.length; i ++){
            //Location of courses
            if(papers[i].Get_Number() == 159234){
                System.out.println("Lecturer's Name: " + papers[i].Get_lecturer_Anckland());
                for(int j = 0; j < lecturers.length; j ++){
                    //Extract the name of the teacher at the location
                    if((lecturers[j].Get_FirstName() + " " + lecturers[j].Get_LastName() ).equals(papers[i].Get_lecturer_Anckland())){
                        System.out.println("This lecturer is teaching " + lecturers[j].Get_Howmany() + " paper(s)");
                    }
                }
            }
        }
        System.out.println();
    }
}
