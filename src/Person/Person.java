package Person;

public class Person implements Comparable<Person>{
    private String First_Name;
    private String Last_Name;
    private String EmailID;
    private StringBuffer Contact_Number;

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {

        this.First_Name = first_Name;
    }


    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.Last_Name = last_Name;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        this.EmailID = emailID;
    }

    public StringBuffer getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(String contact_Number) {
        if(contact_Number==null) {
            this.Contact_Number = new StringBuffer(contact_Number);
        }
        else{
            this.Contact_Number.append(","+contact_Number);
        }
    }


    @Override
    public String toString(){
        if(this.getEmailID()!="")
            return "-----#-----#-----#-----#-----\n"+
                    "First Name :"+this.getFirst_Name()+"\n"+
                    "Last Name :"+this.getLast_Name()+"\n"+
                    "Email ID :"+this.getEmailID()+"\n"+
                    "Contact Number :"+getContact_Number()+"\n"+
                    "----#-----#-----#------#-----";
        else
            return"-----#-----#-----#-----#-----\n"+
                    "First Name :"+this.getFirst_Name()+"\n"+
                    "Last Name :"+this.getLast_Name()+"\n"+
                    "Contact Number :"+getContact_Number()+"\n"+
                    "----#-----#-----#------#-----";
    }

    @Override
    public int compareTo(Person newPerson) {

        return this.getFirst_Name().compareTo(newPerson.getFirst_Name());
    }
}
