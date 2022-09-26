package course.lesson4.innerClasses;

public class Park {
    private Attraction attraction;
    public Address address;

    public class Attraction {
        public String type;
        public String time;
        public int attractionId;
        public int price;

        public Attraction(String type, String time, int attractionId, int price) {
            this.type = type;
            this.time = time;
            this.attractionId = attractionId;
            this.price = price;
        }
    }
        public class Address {
            public String city;
            public String street;

            public Address(String city, String street) {
                this.city = city;
                this.street=street;
            }
        }
    }

