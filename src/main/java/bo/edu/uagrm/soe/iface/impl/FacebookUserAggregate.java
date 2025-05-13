package bo.edu.uagrm.soe.iface.impl;

import bo.edu.uagrm.soe.FacebookUserIterator;
import bo.edu.uagrm.soe.iface.Aggregate;
import bo.edu.uagrm.soe.iface.Iterator;

public class FacebookUserAggregate implements Aggregate{

    @Override
    public Iterator createIterator() {
        return new FacebookUserIterator();
    }

}
