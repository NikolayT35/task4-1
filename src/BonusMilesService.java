public class BonusMilesService {

    public int calculate(int price) {

        int bonus = 1;
        int eachSpentMonty = 20;
        int miles = price / eachSpentMonty * bonus;

        return miles;
    }
}


