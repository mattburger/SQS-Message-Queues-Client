# SQS-Message-Queues-Client
## Overview
This Application receives messages from an SQS instance [QCDriver.java](https://github.com/mattburger/SQS-Message-Queues-Client/blob/master/src/main/java/SQS/Message/Queues/Client/QCDriver.java)

## Setup
You must first ensure that you have SQS instances running on your AWS console. The following link steps you through the setup process [SQS setup](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-setting-up.html);

## Running Application
- You have to have your AWS credientals setup on you machine first using the following [instructions](https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-install.html).
- The application can be run either in an IDE environment by running the QPDriver and QCDriver files respectfully. 
- You can also run the application in the terminal/command line using the following command:
  - to be added
  
- You can play with the speed of receiving messages by increasing or decreasing the integer value within the ```Thread.sleep()``` method. If you manipulate the code, you must recomplie before running in order to see the changes.

- Upon running the QCDriver, you'll be prompted to enter the name of an SQS instance (a queue you already created). After that random messages will be received and displayed in the terminal/command line.
- Either stop the application via the stop function in your IDE or by typing ```control + c``` in your terminal.