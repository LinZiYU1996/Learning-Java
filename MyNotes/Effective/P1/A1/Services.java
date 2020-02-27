package Effective.P1.A1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/27
 * \* Time: 21:11
 * \* Description:
 * \
 */
public class Services {

    private Services() {
    } // Prevents instantiation (Item 4)

    // Maps service names to services
    //服务的注册和访问
    //用一个Map来存放提供这的名字和提供者的对象
    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    // Provider registration API
    //注册默认的提供者
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }
    //所谓注册就是在加入Map
    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    // Service access API
    //使用这个方法创建实例
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    //创建的时候看缓存里有没有provider
    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null)
            throw new IllegalArgumentException(
                    "No provider registered with name: " + name);
        return p.newService();
    }


}
