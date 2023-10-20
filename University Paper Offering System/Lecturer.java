public class Lecturer {
    private int ID;
    private String FirstName;
    private String LastName;
    private String Campus;
    private int Howmany;


    //The constructor
    public Lecturer(int id, String firstname, String lastname, String campus, int howmany){
        this.ID = id;
        this.FirstName = firstname;
        this.LastName = lastname;
        this.Campus = campus;
        this.Howmany = howmany;
    }


    //getters and setters
    public int Get_id(){
        return ID;
    }
    public String Get_FirstName(){
        return FirstName;
    }
    public String Get_LastName(){
        return LastName;
    }
    public String Get_campus(){
        return Campus;
    }
    public int Get_Howmany(){
        return Howmany;
    }


    public void Set_id(int id){
        this.ID = id;
    }
    public void Set_FirstName(String firstname){
        this.FirstName = firstname;
    }
    public void Set_LastName(String lastname){
        this.LastName = lastname;
    }
    public void Set_Campus(String campus){
        this.Campus = campus;
    }
    public void Set_Howmany(int howmany){
        this.Howmany = howmany;
    }
}
