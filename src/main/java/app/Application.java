package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        //AnimalsCage bean2 = applicationContext.getBean(AnimalsCage.class);
        AnimalsCage cage = applicationContext.getBean(AnimalsCage.class);
        cage.whatAnimalSay();
        cage.getTimer();
    }

}
