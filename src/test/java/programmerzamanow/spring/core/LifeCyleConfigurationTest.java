package programmerzamanow.spring.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamanow.spring.core.data.Connection;
import programmerzamanow.spring.core.data.Server;

import static org.junit.jupiter.api.Assertions.*;

class LifeCyleConfigurationTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCyleConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    /*
    Bisa pake ini
     */
//    @AfterEach
//    void tearDown() {
//        applicationContext.close();
//    }

    @Test
    void testConnection() {
        Connection connection = applicationContext.getBean(Connection.class);
    }


    @Test
    void testServer(){
        Server server = applicationContext.getBean(Server.class);
    }
}