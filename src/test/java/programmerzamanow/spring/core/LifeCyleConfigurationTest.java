package programmerzamanow.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamanow.spring.core.data.Connection;

import static org.junit.jupiter.api.Assertions.*;

class LifeCyleConfigurationTest {
    
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCyleConfiguration.class);
    }

    @Test
    void testConnection() {
        Connection connection = applicationContext.getBean(Connection.class);
    }
}