package programmerzamanow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamanow.spring.core.data.Bar;
import programmerzamanow.spring.core.data.Foo;

import static org.junit.jupiter.api.Assertions.*;

class ScopeConfigurationTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testScope() {
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);
        Foo foo3 = applicationContext.getBean(Foo.class);

        Assertions.assertNotSame(foo1,foo2);
        Assertions.assertNotSame(foo1,foo3);
        Assertions.assertNotSame(foo2,foo3);
    }

    @Test
    void testDoubleScope() {
        Bar bar1 = applicationContext.getBean(Bar.class);
        Bar bar2 = applicationContext.getBean(Bar.class);
        Bar bar3 = applicationContext.getBean(Bar.class);
        Bar bar4 = applicationContext.getBean(Bar.class);

        assertSame(bar1,bar3);
        assertSame(bar2,bar4);
        assertNotSame(bar1,bar2);
        assertNotSame(bar3, bar4);
    }
}