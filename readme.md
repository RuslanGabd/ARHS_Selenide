# :stars: Test automation project ARHS
<a target="_blank" href="https://arhs-group.com"></a>
## :card_file_box: Content
- [Technologies and tools](#earth_africa-stack technologies)
- [Implemented checks](#computer-implemented-checks)
- [Building in Jenkins](#earth_africa-Jenkins-job)
- [Run from terminal](#earth_africa-Running-tests-from-terminal)
- [Allure report](#earth_africa-Allure-report)
- [Integration with Allure TestOps](#earth_africa-Integration-Allure-TestOps)
- [Integration with Jira](#earth_africa-Integration-c-Jira)
- [Notification in Telegram](#earth_africa-Notification-in-Telegram-bot-assisted)
- [Video examples of passing tests](#earth_africa-test-passing-video examples)

## :bookmark: Technologies and tools
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure_TO"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://https://telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

## <img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Сборка <a target="_blank" href="https://jenkins.autotests.cloud/job/C17_ruslan_g_r_unit_14/"> Jenkins </a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job//"><img src="images/screens/Jenkins.jpg" alt="Jenkins1"/></a>
</p>

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="5%" title="Allure TestOps" src="images/logo/allureTestOps.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Jira" src="images/logo/Jira.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

Автотесты написаны на <code>Java</code> с использованием <code>JUnit 5</code> и <code>Gradle</code>.
Для UI-тестов использован фреймворк [Selenide](https://selenide.org/).
Запуск тестов можно осуществлять локально или с помощью [Selenoid](https://aerokube.com/selenoid/).
Также реализована сборка в <code>Jenkins</code> с формированием Allure-отчета и отправкой уведомления с результатами в <code>Telegram</code> после завершения прогона.

## :hammer_and_wrench:: Параметры сборки в Jenkins:
- remote (адрес удаленного сервера)
- browserSize (размер окна браузера, по умолчанию 1920x1080)
- browserVersion (версия браузера, по умолчанию 100.0)
- browser (браузер, по умолчанию chrome)

## :bookmark: Запуск тестов из терминала
Локальный запуск:
```
gradle clean jet_test
```

Удаленный запуск:
```
clean
jet_test
"-Dremote=${remote_url}"
"-DbrowserName=${browserName}"
"-DbrowserVersion=${browserVersion}"
"-DbrowserSize =${displaySize}"
```
## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Allure отчет <a target="_blank" href="https://jenkins.autotests.cloud/job/IBS_test/allure/"></a>

## ⛅: Основной отчет
<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/Allure.jpg">
</p>

## 🧪: Пример тест кейса
<p align="center">
<img title="AllureSuite" src="images/screens/AllureSuite.jpg">
</p>

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure_TO"/></a> Интеграция с Allure TestOps <a target="_blank" href="https://allure.autotests.cloud/project/1858/dashboards"></a>

## :pinching_hand:: Пример ручного тест-кейса
<p align="center">
<img title="AllureTC" src="images/screens/AllureTC.jpg">
</p>

## :bar_chart:: Доска
<p align="center">
<img title="AllureDashboard" src="images/screens/AllureDashboard.jpg">
</p>

## :runner:: Прогоны
<p align="center">
<img title="Allure Tests" src="images/screens/AllureLaunches.jpg">
</p>

## <img src="images/logo/Jira.svg" width="25" height="25"  alt="Jira"/></a> Интеграция с Jira <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-519"></a>

<p align="center">
<img title="Jira" src="images/screens/jira.jpg">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Telegram"/></a> Уведомления в телеграм с использованием бота

<p align="center">
<img title="telegram" src="images/screens/telegram.jpg">
</p>

## <img src="images/logo/Selenoid.svg" width="25" height="25" alt="Jenkins"/></a> Selenoid. Пример прогона тестов. <a target="_blank" href="https://selenoid.autotests.cloud/gif/example.gif"> </a>

<p align="center">
<img title="Selenoid Video" src="images/gif/example.gif" width="250" height="153"  alt="video"> 
</p>