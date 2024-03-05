package SeminarOOP2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{

    private List<Actor> actorsQueue = new ArrayList<>();
   

@Override
public void takeInQueue(Actor actor) {
    actorsQueue.add(actor);
       
}

@Override
public void takeOrders() {
    System.out.println(actorsQueue.get(0).getName()+" Ваш заказ принят");
    giveOrders();

}

@Override
public void giveOrders() {
    System.out.println(actorsQueue.get(0).getName()+" Ваш заказ готов");
    releaseFromQueue();

}

@Override
public void releaseFromQueue() {
        System.out.println(actorsQueue.get(0).getName()+" До свидания!");

    }

@Override
public void acceptToMarket(Actor actor) {
    if(actor.isMakeOrder){
        takeOrders();
    }else{
        System.out.println(actorsQueue.get(0).getName()+" Такого заказа нет");
    }
         
}

@Override
public void releaseFromMarket(List<Actor> actors) {
    actorsQueue.remove(0);
    update();
}

@Override
public void update() {
    if(!actorsQueue.isEmpty()){
        acceptToMarket(actorsQueue.get(0));
        releaseFromMarket(actorsQueue);

    }else{
        System.out.println("Очередь пуста");
    }
      
}

}
