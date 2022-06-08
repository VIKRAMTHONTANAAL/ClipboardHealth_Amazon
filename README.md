
# ClipboardHealth_Amazon 

Single Automation framework to automate web, mobile and api


## Features

- Factory Design Pattern
- Parallel Test Execution
- Dockerization
- Supports Web, Mobile, Local and Remote Executions
- HTML Reports with Base64 Screen capture
- Page Object Model (POM)
- Fluent Test using Method Chaining


## Prerequisites

Clone the repository and below are few dependencies which are required for the project to run:
- Maven 3.8.1 or greater (preferably Maven 3.8.1)
- Java 8 or 11 or higher (preferably Java 11)
- Docker latest
## Installation

To see the output, just run below command in the root project directory and make sure that all prerequisites with regards to dependencies are completed

```bash
 mvn dependency:resolve 
 -AND- 
 mvn install
 -OR- 
 mvn package
```

Creating a docker image The above command builds image for the dockerfile specified in the root project directory

```bash
docker build -t mydockerimage .
```