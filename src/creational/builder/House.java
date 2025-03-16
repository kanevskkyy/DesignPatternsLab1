package creational.builder;

public record House(String foundation, String walls, String roof, String windows, Garage garage, Garden garden) {

    private House(Builder builder) {
        this(builder.foundation, builder.walls, builder.roof, builder.windows, builder.garage, builder.garden);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("This is a house with a ")
                .append(foundation)
                .append(" foundation, ")
                .append(walls)
                .append(" walls, and a ")
                .append(roof)
                .append(" roof");
        if (windows != null) {
            sb.append(", featuring ").append(windows).append(" windows");
        }
        if (garage != null) {
            sb.append(", and a ").append(garage);
        }
        if (garden != null) {
            sb.append(", complemented by a ").append(garden);
        }
        sb.append('.');
        return sb.toString();
    }

    /**
     * The builder class.
     */
    public static class Builder {

        private final String foundation;
        private final String walls;
        private final String roof;
        private String windows;
        private Garage garage;
        private Garden garden;

        /**
         * Constructor.
         */
        public Builder(String foundation, String walls, String roof) {
            if (foundation == null || walls == null || roof == null) {
                throw new IllegalArgumentException("foundation, walls, and roof cannot be null");
            }
            this.foundation = foundation;
            this.walls = walls;
            this.roof = roof;
        }

        public Builder withWindows(String windows) {
            this.windows = windows;
            return this;
        }

        public Builder withGarage(Garage garage) {
            this.garage = garage;
            return this;
        }

        public Builder withGarden(Garden garden) {
            this.garden = garden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}