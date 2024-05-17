package DecoratorPattern;

public class orderPizza {
    public static void main(String[] args) {
        BasePizza pizza1 = new Mushroom(new ExtraCheese(new FarmHouse()));
        BasePizza pizza2 = new ExtraCheese(new ExtraCheese(new VegDelight()));
        System.out.println("pizza1 cost : " + pizza1.cost());
        System.out.println("pizza2 cost : " + pizza2.cost());
    }
}
