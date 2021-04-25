package config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MainConfig {
    private String mainConfigPath =
            "src\\main\\resources\\config\\theme\\mainConfig";

    private String resourcesPath;
    private String imagesConfigPath;
    private String frameConfigPath;
    private String themePath;

    MainConfig() throws IOException {
        setProperties();
    }

    private void setProperties() throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader(mainConfigPath);
        properties.load(fileReader);
        resourcesPath = (String) properties.get("resourcesPath");
        imagesConfigPath = properties.getProperty("imagesConfigPath");

    }

}
