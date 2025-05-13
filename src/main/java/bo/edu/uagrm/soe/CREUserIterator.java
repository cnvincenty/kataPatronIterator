package bo.edu.uagrm.soe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bo.edu.uagrm.soe.api.CREApi;
import bo.edu.uagrm.soe.iface.Iterator;
import bo.edu.uagrm.soe.model.CREUser;
import bo.edu.uagrm.soe.model.UserData;

public class CREUserIterator implements Iterator{

    private int position;
    private List<CREUser> creUsers;

    public CREUserIterator() {
        this.position = 0;
        this.creUsers = new ArrayList<>();
        for (Map.Entry<Integer, UserData> entry : CREApi.getCREUsers().entrySet()) {
            creUsers.add(new CREUser(entry.getKey(), entry.getValue()));
        }
    }

    @Override
    public boolean isDone() {
         return position >= creUsers.size();
    }

    @Override
    public String currentItem() {
        return creUsers.get(position++).toString();
    }

}
