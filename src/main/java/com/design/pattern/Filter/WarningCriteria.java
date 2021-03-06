package com.design.pattern.Filter;

import java.util.ArrayList;
import java.util.List;

public class WarningCriteria implements Criteria{

    @Override
    public List<Event> meetCriteria(List<Event> events) {
        List<Event> warningEvents = new ArrayList<Event>();
        for(Event event: events){
            if(event.getLevel() == EventType.WARNING){
                warningEvents.add(event);
            }
        }
        return warningEvents;
    }
}
