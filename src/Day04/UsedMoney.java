package Day04;

public class UsedMoney {
    public long solution(int price, int money, int count) {
        long used = 0;
        for(int i = 1; i <= count; i++){
            used += (long)price * i;
        }
        return money - used <= 0 ? used - money : 0;
    }
}
