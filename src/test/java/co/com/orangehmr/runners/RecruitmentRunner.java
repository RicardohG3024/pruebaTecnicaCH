package co.com.orangehmr.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/recruitment.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.orangehmr.stepsdefinitions"
)
public class RecruitmentRunner {
}
