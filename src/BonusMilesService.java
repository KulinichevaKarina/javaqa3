public class BonusMilesService {
    int money = 20;// стоимость 1 мили

    public int calculate(int price) {
        return price / money;
    }
}
