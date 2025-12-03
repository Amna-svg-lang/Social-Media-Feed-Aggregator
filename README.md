
# Social Media Feed Aggregator
## Project Description
A Java-based system that aggregates posts from mock Instagram, Twitter, and TikTok APIs into a single feed.
Uses **Adapter, Factory, Observer, and Singleton patterns** for unified data, notifications, and global feed management.
## How to Run
1. Open project in any Java IDE (IntelliJ / Eclipse / VS Code).
2. Compile all Java files:
javac adapter/*.java factory/*.java model/*.java observer/*.java singleton/*.java main/*.java
3. Run the main program:
java main.Main
## Dependencies
* Java JDK 17+
* No external libraries
## Folder Structure
src/
 ├── adapter/
 ├── factory/
 ├── model/
 ├── observer/
 ├── singleton/
 └── main/
## Known Issues
* Console-based output only
* Uses mock APIs; no persistent storage

