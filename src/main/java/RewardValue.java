public class RewardValue {
    double cash;
    double miles;

    RewardValue (double miles) {
        this.miles = miles;
    }

    double getCashValue() {
        return cash;
    }

    double getMilesValue() {
        return 0.0035 * miles;
    }
}
