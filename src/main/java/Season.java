/**
 * Created by I062070 on 18/04/2017.
 */
public class Season {

    private final int toDay;
    private final int fromMonth;
    private final int fromDay;
    private final int toMonth;

    public Season(int fromMonth, int fromDay, int toMonth, int toDay) {
        this.fromMonth = fromMonth;
        this.fromDay = fromDay;
        this.toMonth = toMonth;
        this.toDay = toDay;
    }

    private boolean isBefore(int month, int day, int otherMonth, int otherDay) {
        return month == otherMonth && day < otherDay || month < otherMonth;
    }

    public boolean in(int month, int day) {
        //reveres order from constructor
        if (isBefore(toMonth, toDay, fromMonth, fromDay)) {
            if (isBefore(fromMonth, fromDay, month, day)) {
                return true;
            }
            if (isBefore(month, day, toMonth, toDay)) {
                return true;
            }
            return false;
        } else if (isBefore(month, day, fromMonth, fromDay) || isBefore(toMonth, toDay, month, day)) {
            return false;
        }
        return false;
    }

}
