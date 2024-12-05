package guru.springframework.spring6di.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"UAT", "EN"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController controller;

    @Test
    void getEnv() {
        System.out.println(controller.getEnv());
    }
}