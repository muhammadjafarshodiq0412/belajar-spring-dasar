package programmerzamanow.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "programmerzamanow.spring.core.configuration"
})
public class ScanConfiguration {
}
