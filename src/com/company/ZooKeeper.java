import java.util.ArrayList;

public class ZooKeeper {
    String name;
}

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(Animal[] animalsToFeed, String food){
        System.out.print(name+" is feeding "+food+" to "+ animalsToFeed.length+" of "+Animal.population+" total animals");
        for(int i=0;i<animalsToFeed.length;i++){
            animalsToFeed[i].eat(food);
        }
    }
}