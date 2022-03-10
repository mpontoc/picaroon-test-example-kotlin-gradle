package com.example.mpontoc

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import io.github.mpontoc.picaroon.core.execution.ControlExecution
import io.github.mpontoc.picaroon.core.utils.Functions
import io.github.mpontoc.picaroon.core.utils.Prop
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(

    tags = ["@test"],
    features = ["src/test/resources/features"],
    glue = ["com.example.mpontoc.steps" , "com.example.mpontoc.config"],
    plugin = [
                "pretty",
                "json:target/reports/results.json",
                "html:target/cucumber-reports/runner_backend",
    ],
    monochrome = true,
    dryRun = false,
    strict = true,
    stepNotifications = true,
)

object Runner : ControlExecution() {
    @Test
    @BeforeClass @JvmStatic fun setup() {
        Prop.setPropAndSave("browserOrMobile", "false")
        Functions.setPathReport("runner_backend")
        Functions.setupExecution()
    }
}


