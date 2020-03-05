package Effective.P10;

import java.util.Objects;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/5
 * \* Time: 17:35
 * \* Description:
 * \
 */
public class CaseInsensitiveString {

    // 实现一个区分大小写的字符串
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        }

        if (obj instanceof String) {
            return s.equalsIgnoreCase((String) obj);
        }

        return false;
    }
}
