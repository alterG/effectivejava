package builder;

public class Hostel {
    private final int rooms;
    private final int attendees;
    private final boolean isFiveStars;
    private final int toiletCount;
    private final String location;

    private Hostel(Builder builder) {
        this.rooms = builder.rooms;
        this.attendees = builder.attendees;
        this.isFiveStars = builder.isFiveStars;
        this.toiletCount = builder.toiletCount;
        this.location = builder.location;
    }

    public static class Builder {
        // required
        private final int rooms;
        private final int attendees;
        // optional
        private boolean isFiveStars = false;
        private int toiletCount = 1;
        private String location = "unknown";

        public Builder (int rooms, int attendees) {
            this.rooms = rooms;
            this.attendees = attendees;
        }

        public Builder isFiveStars(boolean var) {
            this.isFiveStars = var;
            return this;
        }

        public Builder toiletCount(int var) {
            this.toiletCount = var;
            return this;
        }

        public Builder location(String var) {
            this.location = var;
            return this;
        }

        public Hostel build() {
            return new Hostel(this);
        }
    }


}
