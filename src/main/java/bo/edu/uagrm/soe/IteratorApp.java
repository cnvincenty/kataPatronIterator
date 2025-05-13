package bo.edu.uagrm.soe;

import bo.edu.uagrm.soe.iface.Aggregate;
import bo.edu.uagrm.soe.iface.Iterator;
import bo.edu.uagrm.soe.iface.impl.FacebookUserAggregate;
import bo.edu.uagrm.soe.iface.impl.GoogleUserAggregate;

public class IteratorApp {
    public static void main(String[] args) {

        /* GoogleUser[] googleUsers = GoogleApi.getGoogleUsers();
        List<FacebookUser> facebookUsers = FacebookApi.getFacebookUsers(); */

        //Codigo duplicado
        /* for (int i = 0; i < googleUsers.length; i++) {
            System.out.println(googleUsers[i]);
        }

        for (int i = 0; i < facebookUsers.size(); i++) {
            System.out.println(facebookUsers.get(i));
        } */

        //User Google
        Aggregate googleUserAggregate = new GoogleUserAggregate();
        Iterator googleUserIterator = googleUserAggregate.createIterator();

        /* while (!googleUserIterator.isDone()) {
            System.out.println(googleUserIterator.currentItem());
        } */

        printItemsFrom(googleUserAggregate.createIterator());

        //User Facebbok
        Aggregate facebookUserAggregate = new FacebookUserAggregate();
        Iterator facebookUserIterator = facebookUserAggregate.createIterator();

        /* while (!facebookUserIterator.isDone()) {
            System.out.println(facebookUserIterator.currentItem());
        } */

        printItemsFrom(facebookUserAggregate.createIterator());
    }

    public static void printItemsFrom(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
        }
    }
}