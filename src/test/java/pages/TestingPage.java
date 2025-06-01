package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class TestingPage {
    private final SelenideElement testingFirstHeader = $(".lside h1"),
            lsideText = $(".lside .text"),
            logo = $(".logo");

    @Step("Открываем главную страницу по клику лого")
    public TestingPage openMainPage() {
        logo.click();
        return this;
    }

    @Step("Проверка URL страницы Тестирование")
    public TestingPage checkTestingPageURL(String url) {
        webdriver().shouldHave(url(baseUrl + url));
        return this;
    }

    @Step("Проверка заголовка страницы Тестирование")
    public TestingPage checkTestingPageHeader(String header) {
        testingFirstHeader.shouldHave(text(header));
        return this;
    }

    @Step("Проверка текста на боковой панели страницы Тестирование")
    public TestingPage checkTestingPageLSideText(String text) {
        lsideText.shouldHave(text(text));
        return this;
    }
}