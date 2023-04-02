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

Autotests are written in <code>Java</code> using <code>JUnit 5</code> and <code>Gradle</code>.
For UI tests, the [Selenide] framework (https://selenide.org/) was used.
Tests can be run locally or using [Selenoid](https://aerokube.com/selenoid/).
Also implemented build in <code>Jenkins</code> with generation of an Allure report and sending a notification with the results to <code>Telegram</code> after the run is completed.

Allure report includes:
* test execution steps;
* screenshot of the page in the browser at the end of the autotest;
* Page Source;
* browser console logs;
* video of the autotest.
## :computer: Implemented checks

- [x] *Checking header Top Menu*
- [x] *Verification that the transition was made to the main page*
- [x] *Checking  address, phone, email on the page Contact*
- [x] *Checking CONTACT FORM  on page Contacts*
- [x] *Page News contains 3 chapters*
- [x] *Page News contains article*

# :running_woman: Run tests

### Run tests locally
```
gradle clean test -Denv=local
```

If necessary, you can override the launch options
```
test/MainPage/ContactPage/NewsPage 

```

### Run tests on a remote browser
```
gradle clean test -Denv=remote
```
You can also override launch options if needed.

```
test/MainPage/ContactPage/NewsPage 
```
## :hammer_and_wrench:: Build options in Jenkins:

- remote (remote server address)
- browserSize (browser window size, default 1920x1080)
- browserVersion (browser version, default 100.0)
- browser (browser, chrome by default)


```
## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Allure отчет <a target="_blank" href="https://jenkins.autotests.cloud/job/IBS_test/allure/"></a>
```
## ⛅: Main report
<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/Allure.jpg">
</p>

## 🧪: Test case example
<p align="center">
<img title="AllureSuite" src="images/screens/AllureSuite.jpg">
</p>

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure_TO"/></a> Интеграция с Allure TestOps <a target="_blank" href="https://allure.autotests.cloud/project/1858/dashboards"></a>

## :pinching_hand:: An example of a manual test case
<p align="center">
<img title="AllureTC" src="images/screens/AllureTC.jpg">
</p>

## :bar_chart:: Board
<p align="center">
<img title="AllureDashboard" src="images/screens/AllureDashboard.jpg">
</p>

## :runner:: Runs
<p align="center">
<img title="Allure Tests" src="images/screens/AllureLaunches.jpg">
</p>

## <img src="images/logo/Jira.svg" width="25" height="25"  alt="Jira"/></a> Jira integration <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-519"></a>

<p align="center">
<img title="Jira" src="images/screens/jira.jpg">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Telegram"/></a> Telegram notifications using a bot

<p align="center">
<img title="telegram" src="images/screens/telegram.jpg">
</p>

## <img src="images/logo/Selenoid.svg" width="25" height="25" alt="Jenkins"/></a> Selenoid. Test Run Example. <a target="_blank" href="https://selenoid.autotests.cloud/gif/example.gif"> </a>

<p align="center">
<img title="Selenoid Video" src="images/gif/example.gif" width="250" height="153"  alt="video"> 
</p>