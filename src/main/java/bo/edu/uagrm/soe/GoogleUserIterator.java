package bo.edu.uagrm.soe;

import bo.edu.uagrm.soe.api.GoogleApi;
import bo.edu.uagrm.soe.iface.Iterator;
import bo.edu.uagrm.soe.model.GoogleUser;

public class GoogleUserIterator implements Iterator{

    private int position;
    private GoogleUser[] googleUsers;

    public GoogleUserIterator() {
        this.position = 0;
        this.googleUsers = GoogleApi.getGoogleUsers();
    }

    @Override
    public boolean isDone() {
        return this.position >= googleUsers.length;
    }

    @Override
    public String currentItem() {

        return this.googleUsers[this.position++].toString();
    }

}
