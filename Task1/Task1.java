public class Task1 {
    String str;

    public Task1(String str) {
        this.str = str;
    }

    public boolean CheckNumberForFloat() {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}