package chapter_5.c_5_9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:44 2019/12/25
 */
public class Burrito {


//    一个特别好的功能是枚举可在switch语句内使用的方式
    Spiciness degree;
    public Burrito(Spiciness degree) { this.degree = degree;}
    public void describe() {
        System.out.print("This burrito is ");
        switch(degree) {
            case NOT: System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM: System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
            default: System.out.println("maybe too hot.");
        }
    }
    public static void main(String[] args) {
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }


}
