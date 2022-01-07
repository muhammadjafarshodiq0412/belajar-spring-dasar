package programmerzamanow.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "programmerzamanow.spring.core.repository",
        "programmerzamanow.spring.core.service"
})
public class ComponentConfiguration {
}
