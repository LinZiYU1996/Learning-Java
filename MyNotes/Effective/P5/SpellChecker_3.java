package Effective.P5;

import java.util.Objects;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/2
 * \* Time: 21:42
 * \* Description:
 * \
 */
public class SpellChecker_3 {

/*
尝试让SpellChecker支持多个词典，方法是使字典字段为非final域，并添加一个方法来更改现有拼写检查器中的字典，但这在并发时设置会很笨拙，容易出错并且不可行。
静态实用程序类和单例不适用于底层资源作为参数的类(Static utility classes and singletons are inappropriate for classes whose behavior is parameterized by an underlying resource.)。

所需要的是能够支持类的多个实例(在我们的示例中为SpellChecker)，每个实例都使用客户端所需的资源(在我们的示例中为字典)。
满足此要求的简单模式是在创建新实例时将资源传递给构造函数。 这是依赖注入的一种形式：字典是拼写检查器的依赖项，并在创建时注入拼写检查器。

 */
    private final Lexicon dictionary;

    public SpellChecker_3(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

//    public boolean isValid(String word) { ... }
//    public List<String> suggestions(String typo) { ... }
}
