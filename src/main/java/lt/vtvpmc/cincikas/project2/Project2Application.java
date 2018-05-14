package lt.vtvpmc.cincikas.project2;

import lt.vtvpmc.cincikas.project2.config.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Project2Application {

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Herojus h = context.getBean("mantukas", Herojus.class );
        System.out.println(h);

	}
}
