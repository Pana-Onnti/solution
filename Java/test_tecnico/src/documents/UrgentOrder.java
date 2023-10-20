package documents;

public class UrgentOrder extends Order {
    private boolean isUrgent;

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;

    }
}