package creational.builder;

public class Garden {
    private final boolean hasFlowers;
    private final boolean hasTrees;
    private final boolean hasFountain;

    public Garden(boolean hasFlowers, boolean hasTrees, boolean hasFountain) {
        this.hasFlowers = hasFlowers;
        this.hasTrees = hasTrees;
        this.hasFountain = hasFountain;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("garden with");
        if (hasFlowers) {
            sb.append(" flowers,");
        }
        if (hasTrees) {
            sb.append(" trees,");
        }
        if (hasFountain) {
            sb.append(" a fountain,");
        }
        if (sb.length() > 11) {
            sb.setLength(sb.length() - 1);
        } else {
            sb.append(" nothing special");
        }
        return sb.toString();
    }
}