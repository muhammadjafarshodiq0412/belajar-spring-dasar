package programmerzamanow.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerzamanow.spring.core.data.Connection;

@Configuration
public class LifeCyleConfiguration {

    @Bean
    public Connection connection(){
        return new Connection();
    }
}
