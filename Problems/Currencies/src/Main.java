enum Currency {
        USD ("United States dollar"),
        EUR ("Euro"),
        GBP ("Pound sterling"),
        RUB ("Russian ruble"),
        UAH ("Ukrainian hryvnia"),
        KZT ("Kazakhstani tenge"),
        CAD ("Canadian dollar"),
        JPY ("Japanese yen"),
        CNY ("Chinese yuan");
        private String name;
        Currency (String curr) {
            this.name = curr;
        }
        public String getName() {
            return this.name;
        }

        }// declare your enum here