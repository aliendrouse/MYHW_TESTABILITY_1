public class BonusMilesService {
    public int calculate(int price) {

        int rublesForMile = 20;

        return price / rublesForMile;
    }
}