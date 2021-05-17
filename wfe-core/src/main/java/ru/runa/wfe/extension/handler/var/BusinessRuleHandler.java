package ru.runa.wfe.extension.handler.var;

import ru.runa.wfe.execution.ExecutionContext;
import ru.runa.wfe.extension.ActionHandlerBase;
import ru.runa.wfe.extension.decision.GroovyDecisionHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BusinessRuleHandler extends ActionHandlerBase {

    @Override
    public void execute(ExecutionContext executionContext) throws Exception {
        GroovyDecisionHandler groovyDecisionHandler = new GroovyDecisionHandler();
        groovyDecisionHandler.setConfiguration(configuration);
        String function = groovyDecisionHandler.decide(executionContext);
        FormulaActionHandler formulaActionHandler = new FormulaActionHandler();
        formulaActionHandler.setConfiguration(function);
        formulaActionHandler.execute(executionContext);
    }
}
