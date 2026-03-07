package facade;

public class SmartApplicancesFacade {
    private Light light;
    private Tv tv;
    private AirConditon airConditon;

    public SmartApplicancesFacade() {
        this.light = new Light();
        this.tv = new Tv();
        this.airConditon = new AirConditon();
    }

    public void say(String message){
        if(message.contains("打开")){
            this.on();
        }
        else if(message.contains("关闭")){
            this.off();
        }
    }

    private void on(){
        this.tv.on();
        this.airConditon.on();
        this.light.on();
    }

    private void off(){
        this.tv.off();
        this.airConditon.off();
        this.light.off();
    }
}
