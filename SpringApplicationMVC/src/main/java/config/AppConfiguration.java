package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("controller")
@EnableWebMvc
public class AppConfiguration {

    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setPrefix("/");
        return internalResourceViewResolver;
    }
}