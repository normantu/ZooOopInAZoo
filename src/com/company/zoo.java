public class zoo {

    public static void main(String[] args) {
        zoo z = new zoo();
        zoo s = new zoo();
        z.sleep("Tigger");
        s.eat("Tigger");

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity=new Unicorn("Rarity");
        rarity.eat("marshmallows");

        Giraffe gemma=new Giraffe("Gemma");
        gemma.eat("meat");

        Bee stinger=new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        Animal[] animalsToFeed= {tigger,pooh,rarity,gemma,stinger};

        Zookeeper zoebot=new Zookeeper("Zoebot");
        zoebot.feedAnimals(animalsToFeed, "Spaghetti");
    }

    public void sleep(String name) {
        System.out.print(name + " sleeps for 8 hours");
    }
    public void eat(String bacon) {
        System.out.print("YUM!!!" + bacon + "wants more bacon");
    }


}
