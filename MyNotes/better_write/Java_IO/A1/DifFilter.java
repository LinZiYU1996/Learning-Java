package better_write.Java_IO.A1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 11:19
 * \* Description:
 * \
 */
public class DifFilter implements FilenameFilter {

    private Pattern pattern;

    public DifFilter(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
