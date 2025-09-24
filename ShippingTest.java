import Google.Map;
public class ShippingTest{
    public static void main(String[]args){
        Person b = new Person("David",Map.getAddress("雲林斗六大學路1號"));//buer
        Person s = new Person("Lisa",Map.getAddress("雲林斗六大學路100號"));//seller
        Shipping ship = new Shipping(b, s);
        
        System.out.println(b.toString());
        System.out.println(s.toString());
        System.out.println(ship.getShippingDistance());
        System.out.println(ship.getShippingCost());
    }
}