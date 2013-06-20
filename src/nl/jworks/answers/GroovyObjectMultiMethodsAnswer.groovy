class Cheese {
    int value
}

class Flower {
    int price
}

class Printer {

    void print(Cheese cheese) {
        println cheese.value
    }

    void print(Flower flower) {
        println flower.price
    }
}

new Printer().print(new Cheese(value:10))
new Printer().print(new Flower(price: 20))