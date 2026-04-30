# F1 Racing Login Experience (Android)

A polished, multi-screen authentication UI inspired by Formula 1 branding, built for a **Mobile Application Development** university assignment.

## Overview
This project delivers a cohesive login, sign-up, and password recovery experience with consistent styling, custom assets, and smooth navigation between screens. It focuses on clean UI composition, branded visuals, and intuitive user flow across the authentication journey.

## STAR Summary
- **Situation:** The course required a professional-quality authentication flow for a mobile application, showcasing UI/UX design and navigation skills.
- **Task:** Design and implement four interconnected screens (welcome, login, sign-up, forgot password) using Android XML and Java.
- **Action:** Built structured layouts, created reusable visual assets and backgrounds, wired screen navigation via intents, and added password visibility toggles for usability.
- **Result:** Delivered a consistent, F1-themed authentication experience with four complete screens, smooth transitions, and ready-to-demo assets.

## Features
- Welcome screen with clear entry points to login and sign-up
- Login screen with password visibility toggle and social sign-in placeholders
- Sign-up screen with confirm-password handling and visibility toggles
- Forgot password screen with email capture and navigation back to sign-up
- F1-themed visuals and custom drawable backgrounds

## Screens & User Flow
1. **Welcome (MainActivity1)** → Choose **Login** or **Sign Up**
2. **Login (MainActivity)** → Navigate to **Sign Up** or **Forgot Password**
3. **Sign Up (MainActivity3)** → Navigate back to **Login**
4. **Forgot Password (MainActivity4)** → Navigate to **Sign Up**

## Tech Stack
- **Language:** Java
- **UI:** Android XML layouts
- **Framework:** Android SDK (AppCompat)
- **Assets:** PNG icons, custom XML drawables

## Project Structure
```
ASSIGNEMENT2/
├── AndroidManifest.xml
├── java/                    # Activity classes
├── xml/                     # Layout XML files
├── Resources/               # Drawables, icons, and background XMLs
├── apk/                     # Debug APK for quick preview
└── SCREENSHORTWITHXM.pdf    # Original screenshot document
screenshots/                 # Extracted PNG screenshots (used in README)
```

## Getting Started
> **Note:** This repository is a source drop and does not include a full Gradle project.

### Option 1: Preview the APK
- Install `ASSIGNEMENT2/apk/app-debug.apk` on an Android device or emulator.

### Option 2: Import into Android Studio
1. Create a new **Empty Activity** project in Android Studio.
2. Copy the files into your project:
   - `ASSIGNEMENT2/java` → `app/src/main/java/...`
   - `ASSIGNEMENT2/xml` → `app/src/main/res/layout`
   - `ASSIGNEMENT2/Resources` → `app/src/main/res/drawable`
   - `ASSIGNEMENT2/AndroidManifest.xml` → `app/src/main/`
3. Ensure the package name matches `com.example.myapplication1` (or update references accordingly).
4. Build and run the project from Android Studio.

## Screenshots
<details>
<summary>View all screenshots (38)</summary>

![Screenshot 01](screenshots/screenshot-01.png)
![Screenshot 02](screenshots/screenshot-02.png)
![Screenshot 03](screenshots/screenshot-03.png)
![Screenshot 04](screenshots/screenshot-04.png)
![Screenshot 05](screenshots/screenshot-05.png)
![Screenshot 06](screenshots/screenshot-06.png)
![Screenshot 07](screenshots/screenshot-07.png)
![Screenshot 08](screenshots/screenshot-08.png)
![Screenshot 09](screenshots/screenshot-09.png)
![Screenshot 10](screenshots/screenshot-10.png)
![Screenshot 11](screenshots/screenshot-11.png)
![Screenshot 12](screenshots/screenshot-12.png)
![Screenshot 13](screenshots/screenshot-13.png)
![Screenshot 14](screenshots/screenshot-14.png)
![Screenshot 15](screenshots/screenshot-15.png)
![Screenshot 16](screenshots/screenshot-16.png)
![Screenshot 17](screenshots/screenshot-17.png)
![Screenshot 18](screenshots/screenshot-18.png)
![Screenshot 19](screenshots/screenshot-19.png)
![Screenshot 20](screenshots/screenshot-20.png)
![Screenshot 21](screenshots/screenshot-21.png)
![Screenshot 22](screenshots/screenshot-22.png)
![Screenshot 23](screenshots/screenshot-23.png)
![Screenshot 24](screenshots/screenshot-24.png)
![Screenshot 25](screenshots/screenshot-25.png)
![Screenshot 26](screenshots/screenshot-26.png)
![Screenshot 27](screenshots/screenshot-27.png)
![Screenshot 28](screenshots/screenshot-28.png)
![Screenshot 29](screenshots/screenshot-29.png)
![Screenshot 30](screenshots/screenshot-30.png)
![Screenshot 31](screenshots/screenshot-31.png)
![Screenshot 32](screenshots/screenshot-32.png)
![Screenshot 33](screenshots/screenshot-33.png)
![Screenshot 34](screenshots/screenshot-34.png)
![Screenshot 35](screenshots/screenshot-35.png)
![Screenshot 36](screenshots/screenshot-36.png)
![Screenshot 37](screenshots/screenshot-37.png)
![Screenshot 38](screenshots/screenshot-38.png)

</details>
