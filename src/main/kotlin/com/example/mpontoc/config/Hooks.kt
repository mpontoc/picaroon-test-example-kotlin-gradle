package com.example.mpontoc.config

import io.cucumber.java.*
import io.github.mpontoc.picaroon.core.commands.ActionsCommands
import io.github.mpontoc.picaroon.core.drivers.DriverFactory
import io.github.mpontoc.picaroon.core.execution.Execution
import io.github.mpontoc.picaroon.core.execution.report.Report
import io.github.mpontoc.picaroon.core.utils.Functions
import io.github.mpontoc.picaroon.core.utils.PropertiesVariables


class Hooks {

    @Before
    fun setAppMobile(scenario: Scenario?) {
        ActionsCommands.setScenario(scenario)
        if (PropertiesVariables.BROWSER_OR_MOBILE.contains("mobile")) {
            if (Execution.getAppRunner() === true) {
                DriverFactory.newApp()
            }
        }
    }

    @BeforeStep
    fun reportBeforeStep(scenario: Scenario?) {
        ActionsCommands.setScenario(scenario)
        Execution.setIsFirstRun(true)
        if (ActionsCommands.getPrintedInfo() == null) {
            Functions.printInfoExec()
        }
    }

    @AfterStep
    fun reportAfterStep(scenario: Scenario?) {
        if (DriverFactory.driver != null) {
            Report.printScreenAfterStep(scenario)
        }
    }

    @After
    fun printTimeExecution() {
        if (PropertiesVariables.PRINT_AFTER_STEPS == "false") {
            Report.printScreen()
        }
        Functions.printTimeExecution()
        Execution.setHoraFinalTotal(Functions.retornaData().substring(11))
        Report.cucumberWriteReport(
            "Total execution time until 'moment/final'"
                    + Functions.substractHours(Execution.getHoraInicialTotal(), Execution.getHoraFinalTotal())
        )
        ActionsCommands.setPrintedInfo(null)
    }
}