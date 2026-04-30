# F1 Login Experience (Android)

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
android-app/                # Android source drop (layouts, Java, assets)
├── AndroidManifest.xml
├── java/                    # Activity classes
├── xml/                     # Layout XML files
├── Resources/               # Drawables, icons, and background XMLs
├── apk/                     # Debug APK for quick preview
└── SCREENSHORTWITHXM.pdf    # Original screenshot document name retained
screenshots/                 # Extracted PNG screenshots (used in README)
```

## Getting Started
> **Note:** This repository is a source drop and does not include a full Gradle project.

### Option 1: Preview the APK
- Install `android-app/apk/app-debug.apk` on an Android device or emulator.

### Option 2: Import into Android Studio
1. Create a new **Empty Activity** project in Android Studio.
2. Copy the files into your project:
   - `android-app/java` → `app/src/main/java/...`
   - `android-app/xml` → `app/src/main/res/layout`
   - `android-app/Resources` → `app/src/main/res/drawable`
   - `android-app/AndroidManifest.xml` → `app/src/main/`
3. Ensure the package name matches `com.example.myapplication1` (or update references accordingly).
4. Build and run the project from Android Studio.

## Screenshots
<details>
<summary>View all screenshots (6)</summary>

![Screenshot 04](screenshots/screenshot-04.png)
![Screenshot 10](screenshots/screenshot-10.png)
![Screenshot 25](screenshots/screenshot-25.png)
![Screenshot 30](screenshots/screenshot-30.png)
![Screenshot 37](screenshots/screenshot-37.png)
![Screenshot 38](screenshots/screenshot-38.png)

</details>
