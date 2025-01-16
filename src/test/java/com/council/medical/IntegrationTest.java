package com.council.medical;

import com.council.medical.config.AsyncSyncConfiguration;
import com.council.medical.config.EmbeddedSQL;
import com.council.medical.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { MedicalLaboratoryAndClinicalScientistsCouncilApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class }
)
@EmbeddedSQL
public @interface IntegrationTest {
}
