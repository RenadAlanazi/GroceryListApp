🛒 Grocery List Real-Time App



About the App

The Grocery List Real-Time App is an Android application designed to help users create and manage their shopping lists with ease.
Users can add items including the name, quantity, type, image, and price, then view, update, or delete them at any time. All data is stored and 
synchronized in real time using Firebase Realtime Database, meaning any change made is instantly reflected without needing to refresh.


Features

The app supports adding new grocery items with full details including a product image uploaded from the device gallery.
Users can search for any item instantly using the search bar, or sort the list by newest, oldest, or alphabetical order using the filter button. 
Each item can be edited or deleted at any time, with a confirmation dialog shown before deletion to prevent mistakes. All data stays synced across 
devices in real time through Firebase.


Architecture & Technology Stack

The application is built using Java for Android with Material 3 UI components, following a clean MVC architecture pattern.
Activities handle user interaction, Adapters manage how data is displayed in the RecyclerView, and Models represent the data structure.
The backend is powered by Firebase Realtime Database for storing item data and Firebase Storage for handling product images. 
This separation of concerns makes the codebase easy to maintain and scale.


App Screens

The app opens with a Splash Screen that displays the logo and a loading message while connecting to Firebase in the background.
The Main Screen shows the full grocery list with a search bar, filter options, and a floating action button to add new items. 
The Add and Edit screens provide a simple form where users can fill in item details and pick an image from their gallery. Finally,
the About Us screen displays the names and student IDs of the project team members.


Data Model

Each grocery item is represented by a GroceryItem object containing an ID, name, quantity, type, timestamp, image URL, and price.
Firebase operations include pushing new items with a generated key, reading all data through a ValueEventListener, updating existing entries,
and removing items using removeValue after user confirmation. Product images are stored separately in Firebase Storage and linked to each item through a URL.


Getting Started

To run this project, clone the repository and open it in Android Studio.
Connect it to your own Firebase account through Tools → Firebase, and set up the Realtime Database and Storage. 
Then run the app on an emulator or physical Android device with API level 21 or higher.


