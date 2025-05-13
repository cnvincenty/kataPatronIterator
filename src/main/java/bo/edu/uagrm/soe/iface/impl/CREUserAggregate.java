package bo.edu.uagrm.soe.iface.impl;

import bo.edu.uagrm.soe.CREUserIterator;
import bo.edu.uagrm.soe.iface.Aggregate;
import bo.edu.uagrm.soe.iface.Iterator;

public class CREUserAggregate implements Aggregate{

    @Override
    public Iterator createIterator() {
        return new CREUserIterator();
    }

}
