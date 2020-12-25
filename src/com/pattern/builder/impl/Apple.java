package com.pattern.builder.impl;

public final class Apple {
    private final String name;
    private final Color color;
    private final int size;
    private final int prices;
    private final String brand;
    private final String date;

    private Apple(AppleBuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.size = builder.size;
        this.prices = builder.prices;
        this.brand = builder.brand;
        this.date = builder.date;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                ", prices=" + prices +
                ", brand='" + brand + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public static class AppleBuilder {
        private final String name;
        private final Color color;
        private int size;
        private int prices;
        private String brand;
        private String date;

        public AppleBuilder(String name, Color color) {
            if (name == null || color == null) {
                throw new IllegalArgumentException("name and color can not be null");
            }
            this.name = name;
            this.color = color;
        }

        public AppleBuilder withSize(int size) {
            this.size = size;
            return this;
        }

        public AppleBuilder withPrices(int prices) {
            this.prices = prices;
            return this;
        }

        public AppleBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public AppleBuilder withDate(String date) {
            this.date = date;
            return this;
        }

        public Apple build() {
            return new Apple(this);
        }

    }

}
