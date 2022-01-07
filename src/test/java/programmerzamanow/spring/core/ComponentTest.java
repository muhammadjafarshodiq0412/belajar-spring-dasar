package programmerzamanow.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamanow.spring.core.repository.ProductRepository;
import programmerzamanow.spring.core.service.ProductService;

import static org.junit.jupiter.api.Assertions.*;

class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void component_test() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

        assertSame(productService1,productService2);
    }

    @Test
    void constructorDependencyInjection_test(){
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        ProductService productService = applicationContext.getBean(ProductService.class);

        assertSame(productRepository, productService.getProductRepository());
    }
}