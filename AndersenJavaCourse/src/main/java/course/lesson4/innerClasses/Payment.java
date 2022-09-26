package course.lesson4.innerClasses;


public class Payment {
    private Purchase purchase;
    public static class Purchase {
        private Products products;
        public static class Products {
            public String name;
            public int price;
            public Products(String name, int price) {
                this.name = name;
                this.price = price;
            }

        }

    }
}

