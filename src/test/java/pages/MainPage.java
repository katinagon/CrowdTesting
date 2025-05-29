package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class MainPage {
    private final SelenideElement researchNavItem = $(".nav-item [href=\"/research/\"]"),
            testingNavItem = $(".nav-item [href=\"/testing/\"]"),
            crowdTestingNavItem = $(".nav-item [href=\"/crowdtesting/\"]"),
            blogNavItem = $(".nav-item [href=\"/blog/\"]"),
            firstBlockText = $(".block-1 .txt");

    @Step("Открываем главную страницу")
    public MainPage openMainPage() {
        open(baseUrl);
        return this;
    }

    @Step("Открываем страницу Исследования")
    public void openResearchPage() {
        researchNavItem.click();
    }

    @Step("Открываем страницу Тестирование")
    public void openTestingPage() {
        testingNavItem.click();
    }

    @Step("Открываем страницу Краудтестинг")
    public void openCrowdTestingPage() {
        crowdTestingNavItem.click();
    }

    @Step("Открываем страницу Блог")
    public void openBlogPage() {
        blogNavItem.click();
    }

    @Step("Проверка открытия главной страницы ")
    public MainPage checkOpeningMainPage() {
        webdriver().shouldHave(url(baseUrl));
        firstBlockText.shouldHave(text("Делаем цифровые сервисы и продукты полезными, удобными и понятными для " +
                "миллионов людей"));
        return this;
    }
}
