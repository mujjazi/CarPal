How to setup this project on your computer:

Requirements:

JDK
Eclipse IDE 2018-12
Selenium Webdriver
TestNG Libraries
maven

See this link for detailed installation guidelines, http://digitalappconsultancy.com/site/eclipse-selenium-java-testng-project-setup/

Setup:
After completing Java JDK, Selenium and Eclipse installation, Launch the project using Eclipse IDE 2018-12
Note that this is a maven based project which means that all dependencies are maintained using maven.
Now when project is launched then a lot of errors should be displayed to you and they are mostly due to missing libraries and plugins in your Eclipse IDE.
Navigate to Eclipse Marketplace and install Selenium and TestNG from there by searching it.

Resolving Dependencies:
There are two ways to resolve these dependencies related errors, We will go with downloading jar files from mvnrepository and adding it to the project build path.
How to add an external jar to the project's build path:
Right click on project > Properties > Java Build path > Libraries > Add External JARs > Add all downloaded jar files here (You will download jar files from mvnrepository.com)
After adding all the jar files to the project build path, Go back to project and open any test case (Errors should disappear now)
If there are still some errors present then they will be due to Chromedriver, Geckodriver missing (Replace the path of webdrivers with your system's path)
After resolving all errors, Understand the structure of how tests, pages and whole project is organized so that you can execute the existing and create new tests using same model.

Project Directory Structure Abstract Layout:

The project is created following Page Object Model and is divided into Pages and Tests, Every New Page created must extend the BasePage class and Every new test created must extend the BaseTest class.
All test cases can be run directly through their test classes.
All web Elements (UI Locators) and Page Methods (Test Flow) are written in Page classes whereas Test classes are used as runners by just calling the page methods and including instantiations.

Project Directory Structure Physical Layout:

Root Directory > src > test > resources > contains all drivers and images files used during tests.
Root Directory > src > test > java > Pages/Tests (These are all the pages and their tests)
pom.xml for maven dependencies and TestNG.xml for test suites definition are inside the root directory of project.
	
Executing tests individually:
In order to execute CreateBUTest, Right click on the CreateBUTest.java file and run as TestNG Test, Test should execute after some delay of starting webdriver.
Repeat same steps to execute all other tests.

Executing tests as a Test Suite:
If you want to execute a test suites containing multiple tests then you are going to need TestNG.xml file.

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite"  >
    <test name="LoginTest">
        <classes>
            <class name="Tests.CreateBUTest"/>
		ADD ALL THE TEST CASES CLASSES HERE YOU WANT IN TEST SUITE
        </classes>
    </test>
</suite>

Adding New Tests:
In Order to Add new tests to the framework, Two classes are required.
First create a new Class named after PBI you are automating, For Example if you are automating Create a User then name your Class CreateUserPage.java and extend BasePage.java class.
Now Create another class named CreateUserTest.java and extend BaseTest.java, Add tests here.

