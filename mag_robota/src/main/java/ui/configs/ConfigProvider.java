package ui.configs;

import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {

    private static final String CONFIG_PATH = "config.properties";

    private static final Properties prop = initProperties();

    public static final String BROWSER = prop.getProperty("browser");

    public static final String BASE_URL = prop.getProperty("base.url");

    public static final String EN_URL = prop.getProperty("assert.url");

    public static final String UNI_PHONENUMBER = prop.getProperty("uni.phonenumber");

    public static final String SCHEDULE_URL = prop.getProperty("url.schedule");

    public static final String PAYMENT_URL = prop.getProperty("url.payment");

    public static final String SEARCH_CHECK = prop.getProperty("assert.search");

    public static final String SPECIALTY_SEARCH = prop.getProperty("assert.specialty");

    public static final String TEACHER_SEARCH = prop.getProperty("assert.teacher");

    public static final String PAYMENT_RAH = prop.getProperty("assert.paymentrah");

    public static final String UNI_ADDRESS = prop.getProperty("uni.address");

    public static final String FINAL_HEIGHT = prop.getProperty("img.height");

    public static final String FINAL_WIDTH = prop.getProperty("img.width");

    public static final String FINAL_P = prop.getProperty("final.pidrozdili");

    public static final String FINAL_PARTNERS = prop.getProperty("assert.partners");

    public static final String FINAL_MAP = prop.getProperty("map.url");

    public static final String FINAL_COLOR = prop.getProperty("header.color");

    public static final String FINAL_BANK = prop.getProperty("bank.url");

    public static final String FINAL_F = prop.getProperty("assert.f");

    public static final String FINAL_PM = prop.getProperty("assert.pm");

    private static Properties initProperties() {
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemResourceAsStream(CONFIG_PATH));
        } catch (IOException e) {
            throw new RuntimeException("Could not load properties file: " + CONFIG_PATH);
        }
        return properties;
    }

}
