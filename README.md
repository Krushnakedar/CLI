📂 Java Command-Line File Organizer
1. Problem Description

In daily use, my computer’s Downloads folder becomes cluttered with many different types of files such as PDF documents, images, videos, ZIP archives, and software installers.
Because these files are mixed together, it becomes difficult and time-consuming to locate important files.

Manually organizing these files every few days is repetitive and inefficient.
To solve this real problem, I decided to create a simple Java command-line utility that automatically organizes files into appropriate folders.

2. Objective of the Project

The objective of this project is to:

Solve a real, practical problem faced on my system

Demonstrate understanding of core Java concepts

Write clean, readable, and well-structured code

Handle errors safely

Explain design decisions clearly

3. Solution Overview

This project is a Java-based command-line program that:

Accepts a folder path from the user

Scans all files in that folder

Identifies file types using file extensions

Automatically creates category folders

Moves files into the correct folders

The program uses only Java standard libraries and does not depend on any external frameworks.

4. Features

Automatically organizes files by type

Uses Java standard libraries only

Safe file movement with proper error handling

Simple and easy-to-use command-line interface

Prevents accidental modification of subfolders

5. Technologies Used

Programming Language: Java

Java Version: JDK 8 or above

Libraries Used:

java.io

java.nio.file

No third-party libraries or frameworks were used.

6. How to Run the Program
Step 1: Compile the Program

Open a terminal in the directory containing the source file and run:

javac FileOrganizer.java

Step 2: Execute the Program
java FileOrganizer "C:/Users/HP/Downloads"


Note: Forward slashes (/) are recommended in Windows paths to avoid escape-character issues.

7. Program Output

After successful execution, the terminal displays:

Files organized successfully!


The target folder will be organized into:

PDFs/
Images/
Videos/
Archives/
Installers/
Others/

8. Design Decisions and Assumptions

File extensions were used to determine file type because this method is simple and reliable.

The program processes only files and ignores subfolders to prevent accidental data loss.

Files with unknown or unsupported extensions are placed in the Others folder.

Files.move() from java.nio.file was used to ensure safe file operations.

The design prioritizes clarity, safety, and ease of understanding.

9. Error Handling

The program includes basic error handling:

Displays an error message if the provided folder path is invalid.

Skips directories and processes only regular files.

Handles file movement errors without terminating the program abruptly.

10. Sample Screenshots

The submission includes:

Screenshot of the folder before execution

Screenshot of the terminal output

Screenshot of the folder after organization

11. Video Demonstration

A 3–5 minute unlisted YouTube video is included demonstrating:

The problem statement

Execution of the program

Explanation of the code

Design choices and assumptions

Note: The video uses AI-generated narration for clear explanation.

12. Conclusion

This project provides a simple and effective solution to a common real-world problem using Java.
It demonstrates my understanding of Java fundamentals, file handling, clean coding practices, and basic software design principles.
