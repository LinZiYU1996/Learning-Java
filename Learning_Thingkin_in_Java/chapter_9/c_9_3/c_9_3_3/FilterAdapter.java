package chapter_9.c_9_3.c_9_3_3;

import chapter_9.c_9_3.c_9_3_1.Filter;
import chapter_9.c_9_3.c_9_3_1.Waveform;
import chapter_9.c_9_3.c_9_3_2.Processor;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:50 2019/12/29
 */
public class FilterAdapter implements Processor {

    Filter filter;
    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }
    public String name() { return filter.name(); }
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }


}
