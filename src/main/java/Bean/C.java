package Bean;

public class C {
    private String cid;
    private String cname;
    private String teacher;
    private String PID;

    public C() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    @Override
    public String toString() {
        return "C{" +
                "Cid='" + cid + '\'' +
                ", Cname='" + cname + '\'' +
                ", teacher='" + teacher + '\'' +
                ", PID='" + PID + '\'' +
                '}';
    }
}
