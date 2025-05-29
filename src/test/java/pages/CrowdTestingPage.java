package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class CrowdTestingPage {
    private final SelenideElement crowdTestingFirstHeader = $(".title-1 .heading-h1"),
            logo = $(".logo");

    @Step("Проверка открытия страницы Краудтестирование ")
    public CrowdTestingPage checkOpeningCrowdTestingPage() {
        webdriver().shouldHave(url(baseUrl + "crowdtesting/"));
        crowdTestingFirstHeader.shouldHave(text("Краудтестирование"));
        return this;
    }

    @Step("Открываем главную страницу по клику лого")
    public CrowdTestingPage openMainPage() {
        logo.click();
        return this;
    }
}
