package builder.demon2;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("Intel")
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .build();
        System.out.println(phone);
    }
}
