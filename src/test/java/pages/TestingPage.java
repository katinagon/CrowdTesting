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

    @Step("Проверка открытия страницы Исследования ")
    public TestingPage checkOpeningTestingPage() {
        webdriver().shouldHave(url(baseUrl + "testing/"));
        testingFirstHeader.shouldHave(text("Тестирование"));
        lsideText.shouldHave(text("Функциональное, интеграционное, приемочное и кроссплатформенное тестирование с " +
                "помощью крупнейшего сообщества тестировщиков в любой точке России и мира"));
        return this;
    }

    @Step("Открываем главную страницу по клику лого")
    public TestingPage openMainPage() {
        logo.click();
        return this;
    }
}
