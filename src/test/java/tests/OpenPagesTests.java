package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("open_pages")
@DisplayName("Тесты на открытие страниц")
public class OpenPagesTests extends TestBase {
    MainPage mainPage = new MainPage();
    ResearchPage researchPage = new ResearchPage();
    TestingPage testingPage = new TestingPage();
    CrowdTestingPage crowdTestingPage = new CrowdTestingPage();
    BlogPage blogPage = new BlogPage();

    @Tag("open_research_page")
    @Feature("Главная страница")
    @Story("Успешное открытие страницы Исследование")
    @Owner("goncharova-ek")
    @DisplayName("Успешное открытие страницы Исследование при нажатии на пункт навигационного меню")
    @Test
    public void openResearchPageTest() {
        mainPage.openMainPage()
                .openResearchPage();
        researchPage.checkOpeningResearchPage();
    }

    @Tag("open_testing_page")
    @Feature("Главная страница")
    @Story("Успешное открытие страницы Тестирование")
    @Owner("goncharova-ek")
    @DisplayName("Успешное открытие страницы Тестирование при нажатии на пункт навигационного меню")
    @Test
    public void openTestingPageTest() {
        mainPage.openMainPage()
                .openTestingPage();
        testingPage.checkOpeningTestingPage();
    }

    @Tag("open_crowdTesting_page")
    @Feature("Главная страница")
    @Story("Успешное открытие страницы Краудтестирование")
    @Owner("goncharova-ek")
    @DisplayName("Успешное открытие страницы Краудтестирование при нажатии на пункт навигационного меню")
    @Test
    public void openCrowdTestingPageTest() {
        mainPage.openMainPage()
                .openCrowdTestingPage();
        crowdTestingPage.checkOpeningCrowdTestingPage();
    }

    @Tag("open_blog_page")
    @Feature("Главная страница")
    @Story("Успешное открытие страницы Блог")
    @Owner("goncharova-ek")
    @DisplayName("Успешное открытие страницы Блог при нажатии на пункт навигационного меню")
    @Test
    public void openBlogPageTest() {
        mainPage.openMainPage()
                .openBlogPage();
        blogPage.checkOpeningBlogPage();
    }

    @Tag("open_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие главной страницы по лого")
    @Owner("goncharova-ek")
    @DisplayName("Успешное открытие главной страницы по лого из страницы Исследования")
    @Test
    public void openMainPageFromResearchPageTest() {
        mainPage.openMainPage()
                .openResearchPage();
        researchPage.checkOpeningResearchPage()
                .openMainPage();
        mainPage.checkOpeningMainPage();
    }

    @Tag("open_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие главной страницы по лого")
    @Owner("goncharova-ek")
    @DisplayName("Успешное открытие главной страницы по лого из страницы Тестирование")
    @Test
    public void openMainPageFromTestingPageTest() {
        mainPage.openMainPage()
                .openTestingPage();
        testingPage.checkOpeningTestingPage()
                .openMainPage();
        mainPage.checkOpeningMainPage();
    }

    @Tag("open_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие главной страницы по лого")
    @Owner("goncharova-ek")
    @DisplayName("Успешное открытие главной страницы по лого из страницы Краудтестирование")
    @Test
    public void openMainPageFromCrowdTestingPageTest() {
        mainPage.openMainPage()
                .openCrowdTestingPage();
        crowdTestingPage.checkOpeningCrowdTestingPage()
                .openMainPage();
        mainPage.checkOpeningMainPage();
    }

    @Tag("open_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие главной страницы по лого")
    @Owner("goncharova-ek")
    @DisplayName("Успешное открытие главной страницы по лого из страницы Блога")
    @Test
    public void openMainPageFromBlogPageTest() {
        mainPage.openMainPage()
                .openBlogPage();
        blogPage.checkOpeningBlogPage()
                .openMainPage();
        mainPage.checkOpeningMainPage();
    }

}
