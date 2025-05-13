package bo.edu.uagrm.soe.api;

import bo.edu.uagrm.soe.model.GoogleUser;

public class GoogleApi {

    public static GoogleUser[] getGoogleUsers() {
        GoogleUser[] googleUsers = {
            new GoogleUser("ga", "a@gmail.com"),
            new GoogleUser("gb", "b@gmail.com"),
        };
        return googleUsers;
    }
}
