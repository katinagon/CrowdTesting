package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class BlogPage {
    private final SelenideElement logo = $(".logo");

    @Step("Проверка открытия страницы Блог ")
    public BlogPage checkOpeningBlogPage() {
        webdriver().shouldHave(url(baseUrl + "blog/"));
        return this;
    }

    @Step("Открываем главную страницу по клику лого")
    public BlogPage openMainPage() {
        logo.click();
        return this;
    }

}
