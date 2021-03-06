package Effective.P15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 16:30
 * \* Description:
 * \
 */
public class Demo {

    /*
    区别设计良好的模块和设计不好的模块，最重要的因素在于，这个模块对于外部的其他模块而言，是否隐藏其内部数据和其他实现细节。设计良好的模块会隐藏所有的实现细节，把它的API于它的实现清晰地隔离开来。然后，模块之间通过它们的API进行通信，一个模块不需要知道其他模块的内部工作情况，这个概念称为信息隐藏或封装。



封装的重要性在于：可以有效地解除组成系统的各模块之间的耦合关系，使得这些模块可以独立地开发、测试、优化、使用、理解和修改。封装本身不会带来更好的性能，但是它可以有效地调节性能：一旦完成一个系统，并通过剖析确定哪些模块影响了系统的性能，这部分模块就可以被进一步优化，而不影响其他模块的正确性，提高软件的可重用性。



Java提供的访问控制机制决定了类、接口和成员的可访问性。实体的可访问性由该实体声明所在的位置，以及该实体声明中所出现的访问修饰符共同决定。



对于顶层的（非嵌套的）类和接口，只有两种可能的访问级别，包级私有的和公有的。如果类或者接口可以被做成包级私有，就应该被做成包级私有，这样它实际上成了包的实现的一部分，而不是该包导出的API的一部分，在以后的发行版本中，可以对它进行修改、替换、删除，而无需担心影响现有的客户端程序。如果被做成公有的，就有责任永远支持它，以保持兼容性。

如果一个包级私有的顶层的类（或者接口）只是在某一个类的内部可以被用到，就应该考虑使它成为唯一使用它的那个类的私有嵌套类。这样可以进一步缩小可访问范围。（这个相比上一条显得不那么重要，因为包级私有的顶层类已经不会成为导出的API了）。



对于成员（域、方法、嵌套类和嵌套接口）有四种可能的访问级别：

私有的（private）——只有在声明该成员的顶层类内部才可以访问这个成员。

包级私有的（package-private）——声明该成员的包内部的任何类都可以访问这个成员。如果没有为成员指定访问修饰符，就采用这个访问级别，“缺省”

受保护的（protected）——声明该成员的子类可以访问这个成员（即使不在同一包），并且声明该成员的包内部任何类也可以访问这个成员

公有的（public）——在任何地方都可以访问该成员



私有成员和包级成员都是一个类的实现中的一部分，一般不会影响它导出的API，然而，如果类实现了Serializable接口，这些域就有可能被“泄漏”到导出的API中。



有一条规则限制了降低方法的可访问性的能力，如果方法覆盖了超类的一个方法，子类的访问级别不允许低于超类中的访问级别。这样可以确保任何可使用超类的实例的地方都可以使用子类的实例。比如，如果一个类实现了一个接口，那么接口中所有的类方法在这个类中也都必须被声明为公有的（接口的所有方法隐含公有访问级别）。



实例域决不能是公有的。如果域是非final，或者是一个指向可变对象的final引用，那么一旦使这个域成为公有的，就放弃了对存储在这个域中的值进行限制的能力。因此，包含公有可变域的类不是线程安全的。即使域是final的，并且引用不可变的对象，当把这个域变成公有的时候，也就放弃了“切换到一种新的内部数据表示法”的灵活性（因为公有的是导出API，必须始终坚持这种数据表示，保证兼容）。
     */

//    长度非零的数组总是可变的，所以，类具有公有的静态final数组域，或者返回这种域的访问方法，这几乎是错误的。这是安全漏洞的一个常见根源：
    public static final Integer[] VALUES

            = {};


//    修正的两种办法：

/*
1.使公有数组变成私有的，并增加一个公有的不可变列表：
 */

    private static final Integer[] PRIVATE_VAULES= {};

    public static final List<Integer> VALUES_LIST =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VAULES));


    /*
    2.使公有数组变成私有的，并添加一个公有方法，返回私有数组的一个备份：
     */

    private static final Integer[] PRIVATE_VAULES_1 = {};

    public static final Integer[] values() {
        return PRIVATE_VAULES_1.clone();
    }



}
