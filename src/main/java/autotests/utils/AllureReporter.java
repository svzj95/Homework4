package autotests.utils;


import gherkin.formatter.model.Result;
import io.qameta.allure.cucumberjvm.AllureCucumberJvm;
import autotests.steps.BaseSteps;


public class AllureReporter extends AllureCucumberJvm {

    @Override
    public void result(final Result result) {
        if (result.getStatus().equals("failed")){
           BaseSteps.takeScreenshot();
        }
        super.result(result);
    }

}
