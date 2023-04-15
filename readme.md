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
<img width="6%" title="IntelliJ IDEA" src="images/logo/IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure.svg">
<img width="5%" title="Allure TestOps" src="images/logo/allureTestOps.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/Github.svg">
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


 

## <img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Build <a target="_blank" href="https://jenkins.autotests.cloud/job/C17_ruslan_g_r_unit_25/"> Jenkins </a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job//"><img src="images/screens/Jenkins.jpg" alt="Jenkins1"/></a>
</p>

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="images/logo/Allure.svg"> <a href="https://jenkins.autotests.cloud/job/C17_ruslan_g_r_unit_25/6/allure/">Example Allure-report</a>
### Overview

<p align="center">
<img title="Allure Overview" src="images/screens/Allure.jpg">
</p>

### Test result

<p align="center">
<img title="Test Results in Alure" src="images/screens/AllureReportTests.jpg">
</p>

## <img width="4%" title="Allure TestOPS" src="images/logo/allureTestOps.svg"> Integration  [Allure TestOps](https://qameta.io/)

### Main Dashboard

<p align="center">
  <img src="images/screens/AllureTestOpsMain.png" alt="dashboard" width="900">
</p>

### Test case

<p align="center">
  <img src="images/screens/AllureTestOpsTestCases.png" alt="testcase" width="900">
</p>

# Jira integration
<p align="center">
  <img src="images/screens/JiraARHS.png" alt="JiraIntegration" width="950">
</p>



### <img width="4%" style="vertical-align:middle" title="Telegram" src="images/logo/Telegram.svg"> Telegram notifications using a bot

<p align="center">
<img title="telegram" src="images/screens/telegram.jpg">
</p>



### <img width="4%" style="vertical-align:middle" title="Selenoid" src="images/logo/Selenoid.svg"> Video of an example of running a test in Selenoid

A video is attached to each test in the report. One of these videos is shown below.
<p align="center">
  <img title="Selenoid Video" src="images/gif/example.gif">
</p>