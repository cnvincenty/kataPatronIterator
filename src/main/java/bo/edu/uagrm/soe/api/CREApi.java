package bo.edu.uagrm.soe.api;

import java.util.HashMap;
import java.util.Map;

import bo.edu.uagrm.soe.model.UserData;

public class CREApi {

    public static Map<Integer, UserData> getCREUsers() {
        Map<Integer, UserData> creusers = new HashMap<>();

        creusers.put(1, new UserData("crea", "dir1", 200.00));
        creusers.put(2, new UserData("creb", "dir2", 150.00));
        creusers.put(3, new UserData("crec", "dir2", 300.00));

        return creusers;
    }
}
