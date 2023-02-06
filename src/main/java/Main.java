import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.dataBaseConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(dataBaseConfig.class);

    }
}
