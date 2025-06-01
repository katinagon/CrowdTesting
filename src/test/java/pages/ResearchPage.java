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

    @Step("Проверка URL страницы Исследование")
    public ResearchPage checkResearchPageURL(String url) {
        webdriver().shouldHave(url(baseUrl + url));
        return this;
    }

    @Step("Проверка заголовка страницы Исследование")
    public ResearchPage checkResearchPageHeader(String header) {
        researchFirstHeader.shouldHave(text(header));
        return this;
    }

    @Step("Проверка текста на боковой панели страницы Исследование")
    public ResearchPage checkResearchPageLSideText(String text) {
        lsideText.shouldHave(text(text));
        return this;
    }
}