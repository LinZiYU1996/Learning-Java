package JDK_8.functional_interface.BooleanSupplier_IntSupplier_LongSupplier_and_DoubleSupplier_Example;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:18
 * \* Description:
 * \
 */
public class Item {


    //Java 8 has introduced supplier for different data type as functional interface. These are BooleanSupplier, IntSupplier, LongSupplier and DoubleSupplier classes. In this page we will learn these supplier by the example.
    //To create supplier we need a class which consist method that will return value to be used in our example.



    private Boolean status;
    private Integer val;
    public Item(Boolean status, Integer val){
        this.status=status;
        this.val=val;
    }
    public Boolean isStatus() {
        return status;
    }
    public Integer getVal() {
        return val;
    }


}
