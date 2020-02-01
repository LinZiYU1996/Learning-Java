package JDK_8.functional_interface.Java_Custom_Functional_Interface.Functional_Interface_with_Generic_and_Default_Methods;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:40
 * \* Description:
 * \
 */
public class Project {

    private String pname;
    private String teamLead;
    private String location;
    public Project(String pname, String teamLead) {
        this.pname = pname;
        this.teamLead = teamLead;
    }


    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(String teamLead) {
        this.teamLead = teamLead;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pname='" + pname + '\'' +
                ", teamLead='" + teamLead + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
