package Effective.P5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/2
 * \* Time: 21:41
 * \* Description:
 * \
 */
public class SpellChecker_2 {

    /*
    将这些类实现为单例
     */
    private final Lexicon dictionary = new Lexicon();

    private SpellChecker_2() {

    }

    public static SpellChecker_2 INSTANCE = new SpellChecker_2();

//    public boolean isValid(String word) { ... }
//    public List<String> suggestions(String typo) { ... }

}
