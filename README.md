# Overview

ListedNotes is a baseline journal application designed for Android. It allows users to write 
down thoughts, categorize them, and track their mood through an interface. To use the app, click
on the button in the bottom corner to open the dialog, fill in your details, and save. Entries
will appear instantly in a scrollable list, where they can also be deleted. 

I created this app to practice and further my understanding of Kotlin syntax and mobile development
I ended up learning more about MVVM (Model-View-ViewModel) architecture and start with how
State Management works in Jetpack Compose.

Here's a walkthrough of the code and how to use the app:
[Software Demo Video](http://youtube.link.goes.here)

# Development Environment
To develop this app, I used Android Studio. This environment allowed me to use Logcat for 
and the emulator for android. This app is written with Kotlin, using Jetpack Compose for the UI.
Key libraries and components where
- Material Design: For UI components such as Cards, Scaffolds and TopAppBars
- ViewModel and State: To manage data through configuration changes (screen rotation)
- Kotlin Coroutines: To handle async logic, ensuring the UI is responsive.

# Setup
To run this project on your local machine, follow these steps:

### Clone the Repository:
Open your terminal or GitHub Desktop and clone the project using:
- git clone https://github.com/M-Raquel/ListedNotes.git

### Open in Android Studio
1. Launch Android Studio, select File then Open, and navigate to cloned ListedNotes folder 
2. Important! Make sure to wait for Android Studio to finish Gradle Sync, this may take a few minutes
### Running the App
1. Ensure you have an Android Emulator (API ## or up) or a physcical Android device connected via USB Debugging
2. Click the Green Play button in the top toolbar of Android Studio

# Useful Websites

* [Android Basics with Compose](https://developer.android.com/courses/android-basics-compose/course)
* [Create your first Android app – Kotlin](https://developer.android.com/codelabs/basic-android-kotlin-compose-first-app#0)
* [Kotlin Playground: Edit, Run, Share Kotlin Code Online](https://play.kotlinlang.org)
* [How to Build a Simple Notes App in Android? – GeeksforGeeks](https://www.geeksforgeeks.org/android/how-to-build-a-simple-notes-app-in-android/)
* [AppCompatActivity | API reference | Android Developers](https://developer.android.com/reference/androidx/appcompat/app/AppCompatActivity)
* [Room | Jetpack | Android Developers](https://developer.android.com/jetpack/androidx/releases/room)
* [Save data in a local database using Room | App data and files | Android Developers](https://developer.android.com/training/data-storage/room)
* [Kotlin flows on Android | Android Developers](https://developer.android.com/kotlin/flow)
* [ViewModel overview | App architecture | Android Developers](https://developer.android.com/topic/libraries/architecture/viewmodel)
* [Data Classes Kotlin | KotlinLang](https://kotlinlang.org/docs/data-classes.html)

# AI Disclosure
This project was developed with the assistance of Gemini (Google’s AI). 
The use of AI was integrated into the development process in the following ways:

- Architecture & Troubleshooting: I used AI to help pivot the project from a complex Room/Clean 
Architecture model to a stable In-Memory MVVM pattern after significant Gradle and dependency integration errors occured.
I had initially made the scope of the project too big and after numerous hours decided to cut out
what didn't belong.

- Debugging: AI assisted in interpreting Gradle build logs and resolving Kotlin compilation errors, 
specifically regarding missing UI unit imports and Material 3 component syntax.

- GitHub: AI helped in formatting the installation and setup found in this README file

All final code implementation, UI design choices, and project logic were reviewed, written 
and finalized by me.

# Future Work

* Future Storage using Room database so entries persist after the app is closed.
* Photo Attachment Feature. Allow users to associate a visual memory with their entries
* Advanced search/filtering. Adding a search bar to filter the LazyColumn by mood or category
* Cleaner Design and customization