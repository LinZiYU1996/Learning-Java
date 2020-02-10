package design_pattern.Prototype_pattern.p1;

public interface Product {

    void use(String s);

    Product createClone();
}
