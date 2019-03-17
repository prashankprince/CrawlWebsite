# CrawlWebsite
A maven project which Crawls Redhat website recursively till some maximum depth

## Running the code using the command-line

This project can be built with [Apache Maven](http://maven.apache.org/).

Downlaod/Clone code from [here](https://github.com/prashankprince/CrawlWebsite) and Use the following steps to run the application locally:

1. Execute full Maven build to create the `target/rehdhat-crawler-1.0-SNAPSHOT-jar-with-dependencies.jar` file:

    ```bash
    $ mvn clean install
    ```
    
2. Run Jar file in command prompt using:

    ````
    java -jar rehdhat-crawler-1.0-SNAPSHOT-jar-with-dependencies.jar
    ````
 3. Results/Output will be shown on command prompt console. Dont forget to change layout preference to see full console output.
    
    Alternatively , go to target folder [here](https://github.com/prashankprince/CrawlWebsite) and download `rehdhat-crawler-1.0-SNAPSHOT-jar-with-dependencies.jar` file and run above command in Step 2.
    
## Run code using Eclipse/STS or any IDE

Downlaod/Clone code from [here](https://github.com/prashankprince/CrawlWebsite) and Use the following steps:

1. Import code in Eclipse/STS or any IDE

2. Right click on Project and Click on Run as and do `Maven build`.

3. Right click on Project and then Run as `Java Application`.

4. Results will be shown in console of Eclipse or any IDE.
