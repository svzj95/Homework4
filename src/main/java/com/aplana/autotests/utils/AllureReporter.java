package com.aplana.autotests.utils;


import com.aplana.autotests.steps.BaseSteps;
import gherkin.formatter.model.*;
import io.qameta.allure.cucumberjvm.AllureCucumberJvm;




/**
 * Created by 777 on 08.05.2017.
 */
public class AllureReporter extends AllureCucumberJvm {

    @Override
    public void result(final Result result) {
        if (result.getStatus().equals("failed")){
            BaseSteps.takeScreenshot();
        }
        super.result(result);
    }


}
