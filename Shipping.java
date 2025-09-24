package B11221009;
import Google.Map;
public class Shipping{
    private String seller;
    private String buyer;
    public Shipping(String seller ,String buyer){
        this.buyer = buyer;
        this.seller = seller;
    }
    public int getShippingDistance(){
        int lo1 = Map.getLongitude(buyer.getAddress());
        int la1 = Map.getLatitude(buyer.getAddress());
        int lo2 = Map.getLongitude(seller.getAddress());
        int la2 = Map.getLatitude(seller.getAddress());
        return Map.getDistance(lo1, la1, lo2, la2);
    }
    public int isSameAddress(){
        int lo1 = Map.getLongitude(buyer.getAddress());
        int la1 = Map.getLatitude(buyer.getAddress());
        int lo2 = Map.getLongitude(seller.getAddress());
        int la2 = Map.getLatitude(seller.getAddress());
        if (lo1 == lo2 && la1 == la2) {
            return ture;
        }else{
            return false;
        }
    }
    public int getShippingCost(){
        int cost;
        int distance = Map.getDistance(Map.getLongitude(buyer,getAddress()),Map.getLatitude(buyer.getAddress()),Map.getLongitude(seller.getAddress()),Map.getLatitude(seller.getAddress()));
        if (distance < 0) {
            if (distance < 10) {
                cost = 50;
                return cost; 
            }else{
                cost = 50 + (distance-10)*8;
                return cost;
            }
        }
    }
}