# Автотесты для сайта CrowdTesting
## :pushpin: Содержание:

- [Технологии и инструменты](#computer-использованный-стек-технологий)
- [Запуск тестов из терминала](#arrow_forward-запуск-тестов-из-терминала)
- [Сборка в Jenkins](#сборка-в-jenkins)
- [Пример Allure-отчета](#пример-allure-отчета)
- [Уведомления в Telegram с использованием бота](#уведомления-в-telegram-с-использованием-бота)
- [Видео примера запуска тестов в Selenoid](#-видео-примера-запуска-теста-в-selenoid)

## :computer: Технологии и инструменты

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="media/icons/Intelij_IDEA.svg">
<img width="6%" title="Java" src="media/icons/Java.svg">
<img width="6%" title="Selenide" src="media/icons/Selenide.svg">
<img width="6%" title="Selenoid" src="media/icons/Selenoid.svg">
<img width="6%" title="Allure Report" src="icons/Allure_Report.svg">
<img width="6%" title="Gradle" src="media/icons/Gradle.svg">
<img width="6%" title="JUnit5" src="media/icons/JUnit5.svg">
<img width="6%" title="GitHub" src="media/icons/GitHub.svg">
<img width="6%" title="Jenkins" src="media/icons/Jenkins.svg">
<img width="6%" title="Telegram" src="media/icons/Telegram.svg">
</p>

- Автотесты написаны на языке <code>Java</code> с использованием фреймворков <code>Selenide</code>, <code>JUnit 5</code>
- Сборщик проекта - <code>Gradle</code> 
- При прогоне тестов браузер запускается в<code> Selenoid</code>
- Для удаленного запуска реализована джоба в <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов в <code>Telegram</code> при помощи бота

## :arrow_forward: Команды для запуска из терминала

### *Локальный запуск:*
```
gradle clean open_pages
```
### *Удалённый запуск через Jenkins:*
```
clean
${TASK}
-Dselenide.pageLoadStrategy=eager
"-Dselenoid.url=${SELENOID_URL}"
-Dselenoid.login=${SELENOID_LOGIN}
-Dselenoid.password=${SELENOID_PASSWORD}
"-Dbrowser=${BROWSER}"
"-Dbrowser.version=${BROWSER_VERSION}"
"-Dbrowser.size=${BROWSER_SIZE}"
```
### *Параметры сборки:*

* <code>TASK</code> – задача для запуска
* <code>BROWSER_VERSION</code> - браузер, в котором будут выполняться тесты. По-умолчанию - <code>chrome</code>.
* <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты. По-умолчанию - <code>128.0</code>.
* <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты. По-умолчанию - <code>1920x1080</code>.

## <img src="media/logo/Jenkins.svg" title="Jenkins" width="4%"/> Сборка в Jenkins
<p align="center">
<img title="Jenkins Build" src="media/screens/JenkinsBuild.png">
</p>

## <img src="media/logo/Allure_Report.svg" title="Allure Report" width="4%"/> Пример Allure-отчета
### Overview

<p align="center">
<img title="Allure Overview" src="media/screens/allureReport.png">
</p>

### Результат выполнения теста

<p align="center">
<img title="Test Results in Alure" src="media/screens/ResultTest.png">
</p>

## <img src="media/logo/AllureTestOps.svg" title="Allure TestOps" width="4%"/> Интеграция с Allure TestOps

Выполнена интеграция сборки <code>Jenkins</code> с <code>Allure TestOps</code>.
Результат выполнения автотестов отображается в <code>Allure TestOps</code>
На Dashboard в <code>Allure TestOps</code> отображена статистика пройденных тестов.

<p align="center">
<img title="Allure TestOps DashBoard" src="media/screens/allureAutotestCloud.png">
</p>

## <img src="media/logo/Jira.svg" title="Jira" width="4%"/> Интеграция с Jira

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в тикете отображается информация, какие тест-кейсы были написаны в рамках задачи и результат их прогона.

<p align="center">
<img title="Jira Task" src="media/screens/jiraTask.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Telegram" src="media/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки, бот созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с результатом.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/screens/notification.png">
</p>

## Видео примера запуска тестов в Selenoid

К каждому тесту в отчете прилагается видео прогона.
<p align="center">
  <img title="Selenoid Video" src="media/screens/video.gif">
</p>

