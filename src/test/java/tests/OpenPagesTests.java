package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static data.PagesText.*;

@Tag("open_pages")
@DisplayName("Тесты на открытие страниц")
@Owner("goncharova-ek")
public class OpenPagesTests extends TestBase {
    MainPage mainPage = new MainPage();
    ResearchPage researchPage = new ResearchPage();
    TestingPage testingPage = new TestingPage();
    CrowdTestingPage crowdTestingPage = new CrowdTestingPage();
    BlogPage blogPage = new BlogPage();

    @Tag("open_from_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие страницы Исследование")
    @DisplayName("Успешное открытие страницы Исследование при нажатии на пункт навигационного меню")
    @Test
    public void openResearchPageTest() {
        mainPage.openMainPage()
                .openResearchPage();
        researchPage.checkResearchPageURL(researchUrl)
                .checkResearchPageHeader(researchHeader)
                .checkResearchPageLSideText(researchLSideText);
    }

    @Tag("open_from_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие страницы Тестирование")
    @DisplayName("Успешное открытие страницы Тестирование при нажатии на пункт навигационного меню")
    @Test
    public void openTestingPageTest() {
        mainPage.openMainPage()
                .openTestingPage();
        testingPage.checkTestingPageURL(testingUrl)
                .checkTestingPageHeader(testingHeader)
                .checkTestingPageLSideText(testingLSideText);
    }

    @Tag("open_from_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие страницы Краудтестирование")
    @DisplayName("Успешное открытие страницы Краудтестирование при нажатии на пункт навигационного меню")
    @Test
    public void openCrowdTestingPageTest() {
        mainPage.openMainPage()
                .openCrowdTestingPage();
        crowdTestingPage.checkCrowdTestingPageURL(crowdTestingUrl)
                .checkCrowdTestingPageHeader(crowdTestingHeader);
    }

    @Tag("open_from_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие страницы Блог")
    @DisplayName("Успешное открытие страницы Блог при нажатии на пункт навигационного меню")
    @Test
    public void openBlogPageTest() {
        mainPage.openMainPage()
                .openBlogPage();
        blogPage.checkBlogPageURL(blogURL);
    }

    @Tag("open_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие главной страницы по лого")
    @DisplayName("Успешное открытие главной страницы по лого из страницы Исследование")
    @Test
    public void openMainPageFromResearchPageTest() {
        mainPage.openMainPage()
                .openResearchPage();
        researchPage.checkResearchPageURL(researchUrl)
                .openMainPage();
        mainPage.checkMainPageURL()
                .checkMainPageText(mainText);
    }

    @Tag("open_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие главной страницы по лого")
    @DisplayName("Успешное открытие главной страницы по лого из страницы Тестирование")
    @Test
    public void openMainPageFromTestingPageTest() {
        mainPage.openMainPage()
                .openTestingPage();
        testingPage.checkTestingPageURL(testingUrl)
                .openMainPage();
        mainPage.checkMainPageURL()
                .checkMainPageText(mainText);
    }

    @Tag("open_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие главной страницы по лого")
    @DisplayName("Успешное открытие главной страницы по лого из страницы Краудтестирование")
    @Test
    public void openMainPageFromCrowdTestingPageTest() {
        mainPage.openMainPage()
                .openCrowdTestingPage();
        crowdTestingPage.checkCrowdTestingPageURL(crowdTestingUrl)
                .openMainPage();
        mainPage.checkMainPageURL()
                .checkMainPageText(mainText);
    }

    @Tag("open_main_page")
    @Feature("Главная страница")
    @Story("Успешное открытие главной страницы по лого")
    @DisplayName("Успешное открытие главной страницы по лого из страницы Блог")
    @Test
    public void openMainPageFromBlogPageTest() {
        mainPage.openMainPage()
                .openBlogPage();
        blogPage.checkBlogPageURL(blogURL)
                .openMainPage();
        mainPage.checkMainPageURL()
                .checkMainPageText(mainText);
    }

}
