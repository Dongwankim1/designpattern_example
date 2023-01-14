package com.visitor.youtube;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * \* Created with JIRANDATA.
 * \* @author: kim-dong-wan
 * \* Date: 2023/01/13
 * \* Time: 4:31 오후
 * \* Description:
 * \
 */

public class ItemList implements Unit{
    private ArrayList<Unit> list = new ArrayList<Unit>();

    public ItemList(ArrayList<Unit> list) {
        this.list = list;
    }

    public void add(Unit unit){
        list.add(unit);
    }

    @Override
    public void accept(Visitor visitor) {
        Iterator<Unit> iterator = list.iterator();

        while(iterator.hasNext()){
            Unit unit = iterator.next();
            visitor.visit(unit);
        }
    }
}
