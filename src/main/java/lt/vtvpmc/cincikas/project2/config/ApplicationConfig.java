package lt.vtvpmc.cincikas.project2.config;


import lt.vtvpmc.cincikas.project2.Herojus;
import lt.vtvpmc.cincikas.project2.Sarvai;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    Herojus mantukas(){
        Herojus herojus = new Herojus("Mantas", false, sarvai());
        return herojus;
    }

    @Bean
    Sarvai sarvai(){
        Sarvai sarvai =  new Sarvai("Popieriniai", 0.7);
        return sarvai;
    }
}
