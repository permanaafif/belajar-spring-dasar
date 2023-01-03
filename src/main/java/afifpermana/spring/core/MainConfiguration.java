package afifpermana.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import afifpermana.spring.core.configuration.BarConfiguration;
import afifpermana.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
