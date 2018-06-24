package science.mengxin.java.jhipster.cucumber.stepdefs;

import science.mengxin.java.jhipster.JhipsterDemoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterDemoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
