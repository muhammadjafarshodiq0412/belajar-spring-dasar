package programmerzamanow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamanow.spring.core.data.Foo;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateBeanTest {

    @Test
    void testDuplicateBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBean.class);
//        context.getBean(Foo.class);  // error karna Bean yg return object FOO ada 2 cara panggilnya harus pake nama bean nya
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, ()->{
            Foo foo = context.getBean(Foo.class);
        });
    }

    @Test
    void testGetBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBean.class);

        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }

}