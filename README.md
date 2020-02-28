# Fitness-Tracker By Swoletics
Swoletics the company who wants to make your health and fitness a priority! The basic concept for this project is keeping track of someone's work outs, food/water in-take and have suggestions based on their fitness plan. 

# IDE Setup
This project can be set up with Eclipse, below are instructions on how to setup the project.

## Download Eclipse Enterprise Edition (EE)
- Suggested Version: [Latest](https://www.eclipse.org/downloads/packages/ "Eclipse Download")
***

# Project Setup

Below are instructions to aid in the setting up of this project.

**Version numbers listed below are not necessarily the only ones that work, they are just ones that work together at the time of this writing.**

## Download and Install Java Development Kit
- Required Minimum Version: [JDK 8u*](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html "JDK Download")
- Add Java to your Windows Path by following steps from [Java's website](https://java.com/en/download/help/path.xml "Setup Java in Windows Path")

## Code Format
Java source code is enforced with [fmt-maven-plugin](https://github.com/coveo/fmt-maven-plugin) against the [google-java-format](https://github.com/google/google-java-format) which follows [Google's code styleguide](https://google.github.io/styleguide/javaguide.html). This check is done when building the project in jenkins and will fail the build if formatting is invalid. The following commands can be ran locally to validate and format the source code:

```
mvn fmt:check     // Validate all java source files
mvn fmt:format    // Format all java source files
```
	
## Download Tomcat server
- Suggested Version: [Latest Stable Release](http://tomcat.apache.org "Tomcat server download")
- Download the Windows zip, not the installer
- Unzip to C:\Program Files\Apache\tomcat, or other preferred permanent location

## Download MySQL Community
- Suggested Version: [Stable Release](http://dev.mysql.com/downloads/file/?id=458782 "MySQL Community Download")
- Install and follow the default installation process to create 'root' user with password 'admin'

## Link to Database
- Create a new schema with name 'fitnesstracker' in MySQL Workbench.
- Under helperFiles folder open dummyData.sql in mySQL Workbench and execute the script.

## Configure Eclipse Java Version
- Check that the appropriate jdk version is installed
	- Window > Preferences > Java > Installed JREs
	- Check the box next to jdk 1.8.0_*
	- If not installed, click Add > Next (standard VM) > JRE Home > select JDK install directory (not JRE folder).
- Check if the project Java version is configured correctly. Right click project > Properties
	- Java Build Path
		- jdk1.8.0_* should be in the build path
		- If not in build path
			- Click 'Add Library'
			- Select 'JRE System Library' > Click Next
			- Select 'Workspace default JRE (jdk 1.8.0_*)
			- Finish
		- If JRE or JavaSE is in build path select it > Click Remove
 	- Java Compiler
 		- Check 'Use default compliance settings'
 		- Select version 1.8
	- Project Facets
		- Change Java version to 1.8

## Enable Eclipse Auto Formatter
- To import formatting preset
	- Open Eclipse
	- Go to Window > Preferences > Java > Code Style > Formatter
	- Click Import and navigate to helperDocuments folder, select formatter
	- Click Apply and Close
- To enable formatting on save
	- Go to Window > Preferences > Java > Editor > Save Actions
	- Check the 'Perform the selected actions on save' checkbox
	- Check the 'Format source code' checkbox
	- Select 'Format all lines'
	- Check the 'Organize imports' checkbox
	- Click Apply and OK

## Setup Project in Eclipse
- Clone the project in Eclipse
	- Clone the project from GitHub
	- Place in a folder on you local drive suggested C:\\Users\\(yourUserName)\\git
	- Go to File > Import > Maven > Existing Maven Project browse project file then select finish

## Link to Tomcat with Eclipse
- Window > Preferences > Server > Runtime Environments > Add
- Select Apache Tomcat (which ever version you downloaded) > Click Next
- Set the installed directory to where the zip was unzipped
- Leave the JRE on Workbench default JRE > Click Finish

## Lombok in Eclipse
- Download the lombok jar from the [lombok website](https://projectlombok.org/download "Lombok jar download")
- Double click the downloaded lombok.jar file
- This starts the eclipse installer which will find the eclipse path and offers to install lombok into the eclipse installation.

## Run Project (Eclipse)
- Right click project > Run As > Run on Server
	- If Run on Server is not available
		- Right click on project > Properties > Project Facets
		- Checkmark Dynamic Web Module > Apply > Click OK
		- Run on Server should now be available
- Select 'Choose an existing server' to choose the server you set up earlier
	- If 'Choose an existing server' is unavailable restart your machine
