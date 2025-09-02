TSHIAMO NKGE - ST10473572

STEPHEN CHRISTIE -

TAMIKA SINGH -


# Empowering the Nation - Android App

A comprehensive mobile application for skills training and professional development courses in South Africa.

## Overview

Empowering the Nation is an Android application that provides information about educational courses designed to upskill individuals and improve their marketability. The app offers both 6-month professional learnerships and 6-week short skills training programs.

## Features

### Core Functionality
- **Course Catalog**: Browse 6-month and 6-week courses
- **Fee Calculator**: Calculate total cost for selected courses
- **Location Finder**: Find training centers across South Africa
- **Course Details**: Comprehensive information about each program
- **Daily Quotes**: Inspirational quotes with sharing capabilities

### App Screens
1. **Home Screen**: Main navigation with course categories
2. **About Us**: Mission, vision, and company information
3. **6-Month Courses**: Professional learnership programs (R1500 each)
4. **6-Week Courses**: Short skills training programs (R750 each)
5. **Fee Calculator**: Interactive pricing calculator
6. **Locations**: Three training centers across South Africa
7. **Quote Screen**: Daily inspirational quotes


## Screenshots

WELCOME SCREEN

<img width="500" height="600" alt="EMP Welcome Screen" src="https://github.com/user-attachments/assets/0c41ae53-6caa-4f3e-b7fc-4bc7f34dcefa" />



ABOUT US SCREEN

<img width="500" height="600" alt="EMP About Screen" src="https://github.com/user-attachments/assets/4d8bfb4f-a1df-4cbd-a823-a49e8d1b86cf" />


6 MONTHS COURSES SCREEN

<img width="500" height="600" alt="EMP 6 Month Courses" src="https://github.com/user-attachments/assets/422fadc5-9724-44e1-ac2c-22581cc726cd" />



6 WEEKS COURSES SCREEN

<img width="500" height="600" alt="EMP 6 Weeks Courses" src="https://github.com/user-attachments/assets/3a7029e8-14fc-4dac-bb8e-8263aa777f57" />



SEWING SCREEN 

<img width="500" height="600" alt="EMP Sewing" src="https://github.com/user-attachments/assets/8df3c213-59b3-47ad-8be2-ae0bef33a2db" />



CHILD MINDING SCREEN

<img width="500" height="600" alt="EMP Child Minding" src="https://github.com/user-attachments/assets/0a673fca-fb53-4f51-b691-43519d160f62" />


FEE CALCULATOR SCREEN

<img width="500" height="600" alt="EMP Fee Calculator" src="https://github.com/user-attachments/assets/f7236069-8ed3-4382-949c-7f7e8b257732">



LOCATION SCREEN

<img width="500" height="600" alt="EMP Locations" src="https://github.com/user-attachments/assets/3d0638a9-bef2-4b77-9d58-b8c6bba9bc97" />



MAPS SCREEN

<img width="500" height="600" alt="EMP Map" src="https://github.com/user-attachments/assets/d198c29a-3e67-4da6-9a7f-ba2b7576643e" />



QUOTATION SCREEN

<img width="500" height="200" alt="EMP Quotation" src="https://github.com/user-attachments/assets/29e9490e-b168-44a0-9e30-0357a39d2e66" />



## Technical Specifications

### Requirements
- **Minimum SDK**: API 21 (Android 5.0)
- **Target SDK**: API 34 (Android 14)
- **Language**: Kotlin
- **Build System**: Gradle

### Dependencies
```gradle
implementation 'androidx.core:core-ktx:1.12.0'
implementation 'androidx.appcompat:appcompat:1.6.1'
implementation 'com.google.android.material:material:1.10.0'
implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
implementation 'androidx.cardview:cardview:1.0.0'
implementation 'androidx.recyclerview:recyclerview:1.3.2'
```

## Project Structure

### Activities
```
MainActivity.kt              - Home screen with navigation cards
AboutScreen.kt              - Company information and mission
SixMonthCourses.kt          - Professional learnership courses
SixWeekCourses.kt           - Short skills training courses
FeeCalculator.kt            - Fee calculation functionality
Locations.kt                - Training center locations
QuoteScreen.kt              - Daily inspirational quotes
CourseDetailActivity.kt     - Generic course detail screen
FirstAidDetail.kt           - First Aid course details
SewingDetail.kt             - Sewing course details
LifeSkillsDetail.kt         - Life Skills course details
LandscapingDetail.kt        - Landscaping course details
ChildMindingDetail.kt       - Child Minding course details
CookingDetail.kt            - Cooking course details
GardenMaintenanceDetail.kt  - Garden Maintenance course details
```

### Layout Files
```
activity_main.xml           - Home screen layout
about_screen.xml           - About us page layout
courses_list.xml           - Courses list container
item_course.xml            - Individual course item layout
course_detail.xml          - Course detail page layout
fee_calculator.xml         - Calculator interface layout
locations.xml              - Locations page layout
quote_card.xml             - Quote card component
quote_screen.xml           - Quote screen layout
```

### Data Classes
```
Course.kt                  - Data class for course information
CourseAdapter.kt           - RecyclerView adapter for courses
QuoteSharer.kt             - Utility for sharing quotes
```

## Layout Architecture

### Main Activity (activity_main.xml)
- **Header**: Gradient background with app title and menu button
- **Navigation Grid**: 2x2 grid of category cards (About, 6-Month, 6-Week, Calculator)
- **Quote Section**: Inspirational quote with SMS/Email sharing buttons
- **Status Bar**: Custom status bar with time and battery indicators

### About Screen (about_screen.xml)
- **Hero Section**: Gradient header with back button and title
- **Content Area**: ScrollView with mission statement, statistics, and offerings
- **Card Components**: Mission card with gradient background
- **Image Integration**: Growth/empowerment imagery

### Courses List (courses_list.xml)
- **Header Bar**: Back button and dynamic title
- **RecyclerView**: Container for course items using CardView
- **Responsive Design**: Adapts to different screen sizes

### Course Item (item_course.xml)
- **Card Layout**: Elevated card with rounded corners
- **Information Display**: Course name, description, fee, and duration
- **Clickable Interface**: Entire card is clickable for navigation

### Course Detail (course_detail.xml)
- **ScrollView**: For detailed content scrolling
- **Info Cards**: Duration and fee in separate card components
- **Structured Layout**: Clear hierarchy with descriptions and details
- **Back Navigation**: Consistent back button placement

### Fee Calculator (fee_calculator.xml)
- **Header**: Gradient background with title
- **Checkbox Sections**: Organized by course duration (6-month vs 6-week)
- **Total Display**: Prominent total amount card with gradient background
- **Menu Integration**: Consistent menu button placement

### Locations (locations.xml)
- **Header**: Gradient background with location title
- **Location Cards**: Individual cards for each city (Johannesburg, Cape Town, Durban)
- **Contact Information**: Address, phone, email, and hours
- **Action Buttons**: Call and Directions buttons for each location
- **Image Integration**: City-specific imagery

### Quote System (quote_card.xml & quote_screen.xml)
- **Card Design**: Gradient background with inspirational text
- **Sharing Options**: SMS and Email sharing buttons
- **Clean Layout**: Centered text with proper spacing

## Color Scheme

### Primary Colors (res/values/colors.xml)
```xml
<color name="primary_green">#32CD32</color>
<color name="dark_green">#228B22</color>
<color name="gold">#FFD700</color>
<color name="orange">#FF8C00</color>
<color name="blue">#1E90FF</color>
<color name="red">#FF6347</color>
<color name="background_light">#f8f9fa</color>
<color name="white">#FFFFFF</color>
<color name="black">#000000</color>
<color name="text_dark">#333333</color>
```

### Gradient Drawables
- **header_gradient**: Green gradient for headers
- **about_card_gradient**: Blue gradient for about cards
- **six_month_gradient**: Professional course gradient
- **six_week_gradient**: Skills training gradient
- **calculator_gradient**: Calculator-specific gradient
- **status_bar_gradient**: Status bar background

## Course Offerings

### 6-Month Courses (R1500 each)
1. **First Aid Training**
   - Comprehensive first aid and emergency response
   - CPR and resuscitation techniques
   - Industry-recognized certification

2. **Business Management**
   - Professional business skills
   - Financial planning and leadership
   - Management principles

3. **Computer Literacy**
   - Digital skills training
   - Microsoft Office and internet usage
   - Basic to advanced computer skills

4. **Child Minding**
   - Professional childcare training
   - Child development theories
   - Safety procedures and educational activities

5. **Cooking**
   - Culinary arts training
   - Food preparation and nutrition
   - Menu planning and kitchen safety

6. **Landscaping**
   - Garden and landscape design
   - Plant selection and maintenance
   - Hardscaping techniques

7. **Life Skills**
   - Personal development
   - Communication and problem-solving
   - Financial literacy

### 6-Week Courses (R750 each)
1. **Sewing**
   - Basic sewing skills
   - Pattern reading and garment construction
   - Basic alterations

2. **Garden Maintenance**
   - Garden care basics
   - Plant care and pruning
   - Watering systems and pest control

3. **Basic Computer Skills**
   - Introduction to computers
   - Typing skills and software usage
   - Internet navigation

4. **Home Care**
   - Home maintenance skills
   - Cleaning techniques and organization
   - Household management

5. **Food Handling**
   - Food safety training
   - Hygiene practices and storage methods
   - Preparation techniques

6. **Customer Service**
   - Service skills training
   - Customer interaction and communication
   - Conflict resolution

7. **Communication Skills**
   - Effective communication
   - Verbal and written skills
   - Professional etiquette

## Installation Instructions

### Prerequisites
1. Android Studio (latest version)
2. Android SDK API 21 or higher
3. Gradle 8.0+

### Setup Steps

1. **Create New Project**
   ```bash
   # Create new Android project in Android Studio
   # Choose "Empty Activity" template
   # Set minimum SDK to API 21
   # Set package name: vcmsa.ci.empoweringthenation
   ```

2. **Add Dependencies**
   - Open `app/build.gradle`
   - Add required dependencies:
   ```gradle
   dependencies {
       implementation 'androidx.core:core-ktx:1.12.0'
       implementation 'androidx.appcompat:appcompat:1.6.1'
       implementation 'com.google.android.material:material:1.10.0'
       implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
       implementation 'androidx.cardview:cardview:1.0.0'
       implementation 'androidx.recyclerview:recyclerview:1.3.2'
   }
   ```
   - Sync project

3. **Directory Structure**
   ```
   app/src/main/
   ├── java/vcmsa/ci/empoweringthenation/
   ├── res/
   │   ├── drawable/           # Add all images and gradients
   │   ├── layout/             # All XML layout files
   │   ├── menu/               # main_menu.xml
   │   └── values/             # colors.xml, strings.xml, etc.
   ```

4. **Add Resource Files**
   - Copy all XML layout files to `res/layout/`
   - Create `res/menu/main_menu.xml` for navigation menu
   - Create `res/values/colors.xml` with color definitions
   - Add all drawable resources to `res/drawable/`

5. **Add Kotlin Files**
   - Copy all Kotlin activity files to `java/vcmsa/ci/empoweringthenation/`
   - Ensure package names match: `package vcmsa.ci.empoweringthenation`

6. **Update AndroidManifest.xml**
   ```xml
   <application
       android:allowBackup="true"
       android:icon="@mipmap/ic_launcher"
       android:label="@string/app_name"
       android:theme="@style/Theme.AppCompat.Light.NoActionBar">
       
       <activity android:name=".MainActivity">
           <intent-filter>
               <action android:name="android.intent.action.MAIN" />
               <category android:name="android.intent.category.LAUNCHER" />
           </intent-filter>
       </activity>
       
       <activity android:name=".AboutScreen" />
       <activity android:name=".SixMonthCourses" />
       <activity android:name=".SixWeekCourses" />
       <activity android:name=".FeeCalculator" />
       <activity android:name=".Locations" />
       <activity android:name=".QuoteScreen" />
       <activity android:name=".CourseDetailActivity" />
       <activity android:name=".FirstAidDetail" />
       <activity android:name=".SewingDetail" />
       <activity android:name=".LifeSkillsDetail" />
       <activity android:name=".LandscapingDetail" />
       <activity android:name=".ChildMindingDetail" />
       <activity android:name=".CookingDetail" />
       <activity android:name=".GardenMaintenanceDetail" />
       
   </application>
   ```

### Required Images

Add these images to `res/drawable/`:

**Course Images:**
- `growth.jpg` - Educational/team setting
- `first_aid.jpg` - Medical training scene
- `sewing.jpg` - Sewing machine/fabric
- `landscaping.jpg` - Garden/plants
- `life_skills.jpg` - Office/professional setting
- `child_minding.jpg` - Childcare/nursery
- `cooking.jpg` - Kitchen/cooking

**Location Images:**
- `joburg.jpg` - Johannesburg cityscape
- `capetown.jpg` - Cape Town cityscape  
- `durban.jpg` - Durban cityscape

**Icon Images:**
- `ic_arrow_back.png` - Back arrow icon
- `graduation3.png` - Graduation icon
- `ic_course.png` - Course icon
- `coins5.png` - Currency/calculator icon
- `about_screen.png` - About icon

**Gradient Drawables:**
Create these XML files in `res/drawable/`:
- `header_gradient.xml`
- `about_card_gradient.xml`
- `six_month_gradient.xml`
- `six_week_gradient.xml`
- `calculator_gradient.xml`
- `status_bar_gradient.xml`
- `circle_button_bg.xml`
- `action_button_bg.xml`
- `quote_background.xml`

## Key Features Implementation

### Navigation System
- **PopupMenu**: Consistent menu across all activities
- **Intent Navigation**: Seamless screen transitions
- **Back Button Handling**: Proper activity stack management

### RecyclerView Implementation
- **CourseAdapter**: Handles both 6-month and 6-week courses
- **ViewHolder Pattern**: Efficient view recycling
- **Click Listeners**: Item click handling for detail navigation

### Fee Calculator Logic
- **Real-time Calculation**: Updates total as checkboxes change
- **Price Mapping**: Correct pricing for different course types
- **Visual Feedback**: Checkbox state changes with animation

### Location Services Integration
- **Phone Intent**: Direct calling functionality
- **Maps Integration**: Google Maps directions
- **Fallback Handling**: Web maps if Google Maps not available

### Quote Sharing System
- **SMS Sharing**: Pre-formatted message with quote
- **Email Sharing**: Email intent with subject and body
- **Error Handling**: Toast messages for failed sharing attempts

## Design System

### Typography Hierarchy
- **Headers**: 26sp bold (titles), 24sp bold (section headers)
- **Body Text**: 16sp regular, 15sp secondary
- **Labels**: 14sp subtle, 16sp bold for important information
- **Buttons**: 14sp-16sp with bold weight

### Spacing and Layout
- **Padding**: Consistent 16dp-25dp margins
- **Card Elevation**: 4dp-15dp for depth hierarchy
- **Corner Radii**: 8dp-22dp for rounded elements
- **Line Spacing**: 1.4-1.7 multipliers for readability

### Interactive Elements
- **Buttons**: Gradient backgrounds with white text
- **Checkboxes**: Standard Material Design with proper spacing
- **Cards**: Elevated with shadow effects and rounded corners
- **Images**: Center-cropped with proper aspect ratios

## Testing

### Manual Testing Checklist
- [ ] Navigation between all screens works correctly
- [ ] Back buttons function properly in all activities
- [ ] Menu dropdown appears and navigates correctly
- [ ] Calculator updates totals accurately when checkboxes change
- [ ] Phone calls initiate from location buttons
- [ ] Maps open from direction buttons with correct coordinates
- [ ] All images display correctly without stretching
- [ ] Scrolling works smoothly on all scrollable screens
- [ ] Quote sharing works via both SMS and Email
- [ ] Course details display correctly for all course types
- [ ] RecyclerView displays all courses with correct information

### Device Testing
- Test on various Android devices (phones/tablets)
- Verify responsiveness across different screen sizes
- Check performance on older Android versions (API 21+)
- Test both landscape and portrait orientations

## Deployment

### Debug Build
1. Connect Android device or start emulator
2. Click "Run" in Android Studio
3. Select target device
4. App installs automatically

### Release Build
1. Generate signed APK/Bundle in Android Studio
2. Build > Generate Signed Bundle/APK
3. Create keystore if needed
4. Build release version for distribution

## Troubleshooting

### Common Issues

**Images Not Displaying:**
- Verify all image files are in `res/drawable/`
- Check file names match exactly (case-sensitive)
- Ensure image formats are supported (JPG, PNG, WebP)

**Layout Inflation Errors:**
- Verify all XML layout files are in correct directory
- Check that all referenced drawables exist
- Ensure all custom attributes are properly defined

**Navigation Issues:**
- Verify all activities are registered in AndroidManifest.xml
- Check Intent declarations and extra data passing
- Ensure package names are consistent throughout

**Calculator Not Updating:**
- Verify checkbox IDs match between layout and Kotlin files
- Check price mapping logic in FeeCalculator.kt
- Ensure OnCheckedChangeListener is properly set up

**Gradle Build Errors:**
- Clean and rebuild project (Build > Clean Project)
- Check dependency versions for compatibility
- Sync project with Gradle files
- Invalidate caches and restart (File > Invalidate Caches)

### Performance Optimization
- Use appropriate image sizes for different screen densities
- Implement view recycling in adapters
- Consider using Glide/Picasso for image loading in production
- Optimize gradient drawables for performance

## Support

For technical support or questions about implementation:
1. Check Android Studio documentation and logs
2. Verify all file paths and naming conventions
3. Test on physical device if emulator issues occur
4. Review LogCat output for runtime errors and warnings

## License

This project is developed for educational purposes and community skill development. All course content and branding are property of Empowering the Nation organization.

