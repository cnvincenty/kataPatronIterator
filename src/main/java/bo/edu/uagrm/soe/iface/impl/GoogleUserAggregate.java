package bo.edu.uagrm.soe.iface.impl;

import bo.edu.uagrm.soe.GoogleUserIterator;
import bo.edu.uagrm.soe.iface.Aggregate;
import bo.edu.uagrm.soe.iface.Iterator;

public class GoogleUserAggregate implements Aggregate{

    @Override
    public Iterator createIterator() {
        return new GoogleUserIterator();
    }

}
