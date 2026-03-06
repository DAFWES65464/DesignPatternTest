package factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CoffeeFactory {
    private static HashMap<String,Coffee> map = new HashMap<String,Coffee>();
    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getResourceAsStream("/resources/bean.properties");
        try {
            p.load(is);
            for(Object key:p.keySet()){
                Class clazz = Class.forName(p.getProperty((String) key));
                Coffee coffee = (Coffee)clazz.newInstance();
                map.put((String) key,coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
