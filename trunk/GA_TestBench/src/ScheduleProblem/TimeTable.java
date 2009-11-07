package ScheduleProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dave
 */
public class TimeTable implements TimeTableInterface, Iterable {

    private List<Timing> times;

    public TimeTable() {
        this.times = new ArrayList<Timing>();
    }

    public TimeTable(List<Timing> times) {
        this.times = times;
    }

        public void addTime(Timing time) {
        times.add(time);
    }

    public int countDuplicates() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Iterator iterator() {
        return times.iterator();
    }
}
