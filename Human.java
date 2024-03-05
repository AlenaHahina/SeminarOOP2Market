package SeminarOOP2;

public class Human extends Actor{
    public Human(String name, boolean isMakeOrder){
        this.name=name;
        this.isMakeOrder=isMakeOrder;
    }
    @Override
    public String getName() {
    return name;
    }
    
    @Override
    public void setMakeOrder() {
    isMakeOrder = true;
    }
    
    @Override
    public void setTakeOrder() {
    isTakeOrder = true;
    }
    
    @Override
    public boolean isMakeOrder() {
    return isMakeOrder;
    }
    
    @Override
    public boolean isTakeOrder() {
    return isTakeOrder;
    }

    @Override
    public String toString() {
        return "Human";
    }

    
    }