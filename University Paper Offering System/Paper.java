public class Paper {
    private int Number;
    private String Name;
    private String Belong_Major;
    private int Per_Assignment;
    private int Per_Test;
    private int Per_Exam;
    private String Lecturer_Distance;
    private String Lecturer_Anckland;
    private String Lecturer_PN;


    //The constructor
    public Paper(int number, String name, String major, int per_assignment, int per_test, int per_exam, String lecturer_distance, String lecturer_anckland, String lecturer_pn){
        this.Number = number;
        this.Name = name;
        this.Belong_Major = major;
        this.Per_Assignment = per_assignment;
        this.Per_Exam = per_exam;
        this.Per_Test = per_test;
        this.Lecturer_Distance = lecturer_distance;
        this.Lecturer_Anckland = lecturer_anckland;
        this.Lecturer_PN = lecturer_pn;
    }


    //getters and setters
    public int Get_Number(){
        return Number;
    }
    public String Get_Name(){
        return Name;
    }
    public String Get_Belong_Major(){
        return Belong_Major;
    }
    public int Get_Per_Assignment(){
        return Per_Assignment;
    }
    public int Get_Per_Test(){
        return Per_Test;
    }
    public int Get_Per_Exam(){
        return Per_Exam;
    }
    public String Get_Lecturer_Distance(){
        return Lecturer_Distance;
    }
    public String Get_lecturer_Anckland(){
        return Lecturer_Anckland;
    }
    public String Get_lecturer_PN(){
        return Lecturer_PN;
    }


    public void Set_Number(int number){
        this.Number = number;
    }
    public void Set_Name(String name){
        this.Name = name;
    }
    public void Set_Belong_major(String major){
        this.Belong_Major = major;
    }
    public void Set_Per_Assignment(int per_assignment){
        this.Per_Assignment = per_assignment;
    }
    public void Set_Per_Test(int per_test){
        this.Per_Test = per_test;
    }
    public void Set_Per_Exam(int per_exam){
        this.Per_Exam = per_exam;
    }
    public void Set_Lecturer_Distance(String lecturer_distance){
        this.Lecturer_Distance = lecturer_distance;
    }
    public void Set_Lecturer_Anckland(String lecturer_anckland){
        this.Lecturer_Anckland = lecturer_anckland;
    }
    public void Set_Lecturer_PN(String lecturer_pn){
        this.Lecturer_PN = lecturer_pn;
    }
}
