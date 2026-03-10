package mediator;

public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void constact(String message,Mediator mediator){
        mediator.constact(message,this);
    }
    public void getMessage(String message){
        System.out.println(this.name+":收到消息"+message);
    }
}
