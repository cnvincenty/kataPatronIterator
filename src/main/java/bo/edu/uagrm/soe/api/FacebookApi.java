package bo.edu.uagrm.soe.api;

import java.util.Arrays;
import java.util.List;

import bo.edu.uagrm.soe.model.FacebookUser;

public class FacebookApi {

    public static List<FacebookUser> getFacebookUsers() {
        List<FacebookUser> facebookusers =
            Arrays.asList(
                new FacebookUser("fa"),
                new FacebookUser("fb"),
                new FacebookUser("fc")
            );
        return facebookusers;
    }
}
