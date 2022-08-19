# N11 Favourite Product Project 


n11.com was established in March 2013 in partnership with
Dogus Group and SK Group which is one of the largest technologies Company in South Korea.
n11.com is one of Turkey's  open market concept shopping platforms.

Here is the [Link](https://www.n11.com/genel/hakkimizda-65207) for more information.


## Steps to Create Project
1. Create a maven project called `FavouriteProductScenario`.


2. Add below property section under `pom.xml`.
```xml
<properties>
<maven.compiler.source>8</maven.compiler.source>
<maven.compiler.target>8</maven.compiler.target>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
```
3. Add dependencies
```xml
<dependencies>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.2.0</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.3.4</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.3.4</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>me.jvt.cucumber</groupId>
            <artifactId>reporting-plugin</artifactId>
            <version>7.3.0</version>
        </dependency>
    </dependencies>
```
4. Add Build plugin
```xml
<build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
                <configuration>
                    <parallel>methods</parallel>
                    <!--<useUnlimitedThreads>true</useUnlimitedThreads>-->
                    <threadCount>4</threadCount>
                    <perCoreThreadCount>false</perCoreThreadCount>
                    <testFailureIgnore>true</testFailureIgnore>
                    <includes>
                        <include>**/CukesRunner*.java</include>
                        <include>**/FailedTestRunner*.java</include>
                    </includes>
                </configuration>
            </plugin>
        </plugins>
    </build>
```
5. Add a properties file with exact name `configuration.properties`.
   6. Add following line to properties file
   ```properties
    browser=chrome
    ```
6. Create `resources` folder and `features` package.
6. Create package called `n11` under `test/java/com`.
   1. Create a `pages` package and `basePage.java ` class under `pages`package.
   2. Implement all of WebElement related to `Home Page`


7. Create a package called `runners` and java classes called `CukesRunner` and`FailedTestRunner`.
8. Create a package called `step_definitions`.
   9. Create a java class called `Hooks` which use `@Before` and `@After` annotations.

9. Create a package called `utilities`.
   10. create a java class called `ConfigurationReader` which allow us to take data from `configuration.properties` file.
   11. create a java class called `Driver` which create new Driver for each thread.
10. Create a `features` package under `resources`
    11. favouriteProduct.feature file create in features.package
    ```Feature: N11 Favourite Product
      Description:
      1:The scenario below should happen.
      2:A screenshot of the transition and validity should be taken (added in the reports).
      3:Github should be shared.
      4:A readme file should be added in the project and how it will be run should be written.
      Scenario: Add Favourite Products and delete product
      Given user is on Home page
      And user search "Iphone" on search box
      And verify "Iphone" word is displayed
      And user click second page of iphone page
      And verify 2 nd page is opened
      And user put 3 rd product in shopping cart
      And user move to shopping cart page
      Then user delete this product from shopping cart```
11. Created unimplemented snippets in `step_definitions` package.
12. create java class called a `ProductInShoppingCartStepDefinitions`.
    13. In this class implement code of Test cases.