package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ResearchPage {
    private final SelenideElement researchFirstHeader = $(".lside h1"),
            lsideText = $(".lside .text"),
            logo = $(".logo");

    @Step("Открываем главную страницу по клику лого")
    public ResearchPage openMainPage() {
        logo.click();
        return this;
    }

    @Step("Проверка открытия страницы Исследования ")
    public ResearchPage checkOpeningResearchPage() {
        webdriver().shouldHave(url(baseUrl + "research/"));
        researchFirstHeader.shouldHave(text("Исследования"));
        lsideText.shouldHave(text("Качественные и количественные исследования цифровых сервисов и продуктов во всех " +
                "странах мира от идеи до запуска"));
        return this;
    }
}
