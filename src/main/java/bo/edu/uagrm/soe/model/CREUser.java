package bo.edu.uagrm.soe.model;

public class CREUser {
    private int id;
    private UserData userData;

    public CREUser(int id, UserData userData) {
        this.id = id;
        this.userData = userData;
    }

    @Override
    public String toString() {
        return "CREUser [id=" + id + ", userData=" + userData + "]";
    }

}
