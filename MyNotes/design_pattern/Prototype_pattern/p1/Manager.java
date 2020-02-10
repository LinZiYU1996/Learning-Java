package design_pattern.Prototype_pattern.p1;

import java.util.HashMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/9
 * \* Time: 21:50
 * \* Description:
 * \
 */
public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name,Product proto){
        showcase.put(name,proto);
    }

    public Product create(String protoname){
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
