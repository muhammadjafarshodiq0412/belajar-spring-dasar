package programmerzamanow.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamanow.spring.core.data.Bar;
import programmerzamanow.spring.core.data.Foo;

import static org.junit.jupiter.api.Assertions.*;

class ScanTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
         applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        this.applicationContext.registerShutdownHook();
    }

    @Test
    void scan_test() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
    }
}