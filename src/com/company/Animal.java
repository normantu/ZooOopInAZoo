class Animal {
    String name;
    String FavoriteFood;
    static int population = 0;

    public Animal(String name, String FavoriteFood) {
        this.name = name;
        this.FavoriteFood = FavoriteFood;
        population = population + 1;
    }
    public void sleep() {
        System.out.println(name + "sleep for eight hours");
    }
    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(FavoriteFood)) {
            System.out.println("YUM!! " + name + " wants more " + food);
        } else {
            this.sleep();
        }
    }
}
