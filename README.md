# Empowering the Nation - Android Application

A comprehensive mobile application for skills training and professional development courses in South Africa.

## Project Overview

Empowering the Nation is an Android application designed to provide accessible educational course information for individuals seeking to enhance their skills and marketability. The app features both 6-month professional learnerships and 6-week short skills training programs.

## Application Features

### Core Functionality
- **Course Catalog**: Browse comprehensive 6-month and 6-week courses
- **Fee Calculator**: Interactive tool to calculate total costs for selected courses
- **Location Finder**: Locate training centers across South Africa
- **Course Details**: Detailed information about each educational program
- **Quotation System**: Generate course quotations with special offers

### Application Screens
1. **Home Screen**: Primary navigation with course categories and inspirational quotes
2. **About Us**: Organization mission, vision, and establishment details
3. **6-Month Courses**: Professional learnership programs (R1500 each)
4. **6-Week Courses**: Short skills training programs (R750 each)
5. **Fee Calculator**: Dynamic pricing calculator with discount functionality
6. **Locations**: Training center locations with contact information
7. **Course Details**: Individual course descriptions and specifications
8. **Quotation**: Course pricing and special offer information

## SCREENSHOTS

**WELCOME SCREEN**
<img width="600" height="700" alt="EMP HOME SCREEN" src="https://github.com/user-attachments/assets/b8709286-d55d-4eb4-9055-0e8fc8ca0290" />

**ABOUT US SCREEN**
<img width="600" height="700" alt="EMP ABOUT US SCREEN" src="https://github.com/user-attachments/assets/49f736ed-c243-40e9-b0f4-518547411f03" />

**6 MONTH COURSES**
<img width="600" height="700" alt="EMP 6 MONTH COURSE SCREEN" src="https://github.com/user-attachments/assets/6540c41a-261d-49e8-8925-386aaa7521d1" />

**6 WEEK COURSES**
<img width="700" height="700" alt="EMP 6 WEEK COURSE SCREEN" src="https://github.com/user-attachments/assets/6dc618fa-9e8c-4a57-bf60-3cf126b6913f" />

**DESCRIPTION SCREEN**
<img width="600" height="700" alt="EMP DESCRIPTION SCREEN" src="https://github.com/user-attachments/assets/482fdd05-bddc-4e3c-a762-d32ebf0f877e" />

**FEE CALCULATOR SCREEN**
<img width="600" height="700" alt="EMP FEE CALCULATOR SCREEN" src="https://github.com/user-attachments/assets/35baaada-6cd8-4996-a6df-dc498c4afba9" />

**FEE CALCULATOR DISCOUNT SCREEN**
<img width="880" height="1077" alt="EMP FEE CALCULATOR DISCOUNT SCREEN" src="https://github.com/user-attachments/assets/426a97d0-0371-49b6-848c-e4e99e5a79db" />

**LOCATIONS SCREEN**
<img width="600" height="700" alt="EMP LOCATIONS SCREEN" src="https://github.com/user-attachments/assets/db7ba479-8169-415f-a401-8ddf4ebb2c4e" />

**MAP SCREEN**
<img width="600" height="700" alt="EMP MAP SCREEN" src="https://github.com/user-attachments/assets/236ddf6a-cc68-4117-b949-1eda441c2fc9" />

**QUOTATION SCREEN**
<img width="600" height="700" alt="EMP QUOTATION SCREEN" src="https://github.com/user-attachments/assets/9eff503a-414c-4007-b1c3-119cf92c0af7" />


## Technical Specifications

### Development Requirements
- **Minimum SDK**: API 21 (Android 5.0)
- **Target SDK**: API 34 (Android 14)
- **Programming Language**: Kotlin
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

## Project Architecture

### Activity Structure
```
MainActivity.kt              - Home screen with navigation cards
AboutScreen.kt              - Company information and mission statement
SixMonthCourses.kt          - Professional learnership courses listing
SixWeekCourses.kt           - Short skills training courses listing
FeeCalculator.kt            - Course fee calculation functionality
Locations.kt                - Training center locations display
QuoteScreen.kt              - Daily inspirational quotes feature
CourseDetailActivity.kt     - Generic course detail screen template
FirstAidDetail.kt           - First Aid course specific details
SewingDetail.kt             - Sewing course specific details
LifeSkillsDetail.kt         - Life Skills course specific details
LandscapingDetail.kt        - Landscaping course specific details
ChildMindingDetail.kt       - Child Minding course specific details
CookingDetail.kt            - Cooking course specific details
```

### Layout File Organization
```
activity_main.xml           - Home screen layout structure
about_screen.xml           - About us page layout
courses_list.xml           - Courses list container layout
item_course.xml            - Individual course item layout
course_detail.xml          - Course detail page layout
fee_calculator.xml         - Calculator interface layout
locations.xml              - Locations page layout
quote_card.xml             - Quote card component layout
quote_screen.xml           - Quote screen layout
```

### Data Management
```
Course.kt                  - Data class for course information structure
CourseAdapter.kt           - RecyclerView adapter for courses display
QuoteSharer.kt             - Utility class for quote sharing functionality
```

## Layout Design Architecture

### Main Activity (activity_main.xml)
- **Header Section**: Gradient background with application title and menu navigation
- **Navigation Grid**: 2x2 grid layout of category cards (About, 6-Month, 6-Week, Calculator)
- **Quote Section**: Inspirational quote display with SMS/Email sharing capabilities
- **Status Bar**: Custom status bar implementation with time and battery indicators

### About Screen (about_screen.xml)
- **Hero Section**: Gradient header with back navigation and title
- **Content Area**: ScrollView containing mission statement, statistics, and service offerings
- **Card Components**: Mission card with gradient background styling
- **Image Integration**: Growth and empowerment thematic imagery

### Courses List (courses_list.xml)
- **Header Bar**: Consistent back button and dynamic title display
- **RecyclerView**: Container implementation for course items using CardView
- **Responsive Design**: Adaptive layout for various screen sizes

### Course Item (item_course.xml)
- **Card Layout**: Elevated card design with rounded corners
- **Information Display**: Course name, description, fee structure, and duration
- **Clickable Interface**: Entire card configured for navigation interaction

### Course Detail (course_detail.xml)
- **ScrollView**: Implementation for detailed content scrolling
- **Info Cards**: Duration and fee information in separate card components
- **Structured Layout**: Clear information hierarchy with descriptions and details
- **Back Navigation**: Consistent back button placement across screens

### Fee Calculator (fee_calculator.xml)
- **Header**: Gradient background with calculator title
- **Checkbox Sections**: Organized selection by course duration (6-month vs 6-week)
- **Total Display**: Prominent total amount card with gradient background
- **Menu Integration**: Consistent menu button placement throughout application

### Locations (locations.xml)
- **Header**: Gradient background with location section title
- **Location Cards**: Individual cards for each city (Johannesburg, Cape Town, Durban)
- **Contact Information**: Complete address, phone, email, and operating hours
- **Action Buttons**: Call and Directions functionality for each location
- **Image Integration**: City-specific imagery for visual context

### Quote System (quote_card.xml & quote_screen.xml)
- **Card Design**: Gradient background with inspirational text display
- **Sharing Options**: SMS and Email sharing button implementation
- **Clean Layout**: Centered text alignment with proper spacing

## Color Scheme Implementation

### Primary Colors (res/values/colors.xml)
```xml
<color name="primary_green">#32CD32</color>
<color name="dark_green">#228B22</color>
<color name="darker_green">#006400</color>
<color name="gold">#FFD700</color>
<color name="orange">#FF8C00</color>
<color name="blue">#1E90FF</color>
<color name="dark_blue">#0056B3</color>
<color name="red">#FF6347</color>
<color name="dark_red">#DC143C</color>
<color name="background_light">#f8f9fa</color>
<color name="white">#FFFFFF</color>
<color name="black">#000000</color>
<color name="text_dark">#2D3748</color>
<color name="quote_bg_color">#F0F8FF</color>
<color name="primary_color">#3F51B5</color>
```

### Gradient Drawables
- **header_gradient**: Green gradient implementation for headers
- **about_card_gradient**: Blue gradient for about section cards
- **six_month_gradient**: Professional course specific gradient
- **six_week_gradient**: Skills training specific gradient
- **calculator_gradient**: Calculator-specific gradient design
- **status_bar_gradient**: Status bar background gradient

## Course Catalog

### 6-Month Courses (R1500 each)
1. **First Aid Training**
   - Comprehensive first aid and emergency response training
   - CPR and resuscitation technique instruction
   - Industry-recognized certification preparation

2. **Child Minding**
   - Professional childcare training program
   - Child development theories and practical application
   - Safety procedures and educational activity planning

3. **Cooking**
   - Culinary arts training curriculum
   - Food preparation techniques and nutrition education
   - Menu planning and kitchen safety protocols

4. **Landscaping**
   - Garden and landscape design principles
   - Plant selection and maintenance techniques
   - Hardscaping implementation methods

5. **Life Skills**
   - Personal development training
   - Communication and problem-solving skills
   - Financial literacy education

### 6-Week Courses (R750 each)
1. **Sewing**
   - Basic sewing skill development
   - Pattern reading and garment construction
   - Basic alterations and repairs

2. **Communication Skills**
   - Effective communication techniques
   - Verbal and written communication skills
   - Professional etiquette training

## Installation Instructions

### Prerequisites
1. Android Studio (latest stable version)
2. Android SDK API 21 or higher
3. Gradle 8.0+ build system

### Setup Procedure

1. **Create New Project**
   - Create new Android project in Android Studio
   - Select "Empty Views Activity" template
   - Set minimum SDK to API 21
   - Set package name: vcmsa.ci.empoweringthenation

2. **Add Dependencies**
   - Open `app/build.gradle` file
   - Add required dependencies as specified
   - Sync project with Gradle files

3. **Directory Structure Implementation**
   ```
   app/src/main/
   ├── java/vcmsa/ci/empoweringthenation/
   ├── res/
   │   ├── drawable/           # All images and gradient resources
   │   ├── layout/             # Complete XML layout files
   │   ├── menu/               # main_menu.xml navigation
   │   └── values/             # colors.xml, strings.xml resource files
   ```

4. **Resource File Integration**
   - Copy all XML layout files to `res/layout/` directory
   - Create `res/menu/main_menu.xml` for navigation menu structure
   - Create `res/values/colors.xml` with color definitions
   - Add all drawable resources to `res/drawable/` directory

5. **Kotlin Source Files**
   - Copy all Kotlin activity files to `java/vcmsa/ci/empoweringthenation/`
   - Verify package names match: `package vcmsa.ci.empoweringthenation`

6. **AndroidManifest.xml Configuration**
   - Add all activity declarations to AndroidManifest.xml
   - Include necessary permissions for SMS and network functionality
   - Configure application theme and icon settings

### Required Image Assets

**Course Images:**
- `growth.jpg` - Educational and team environment setting
- `first_aid.jpg` - Medical training scenario
- `sewing.jpg` - Sewing machine and fabric materials
- `landscaping.jpg` - Garden and plant maintenance
- `life_skills.jpg` - Office and professional environment
- `child_minding.jpg` - Childcare and nursery setting
- `cooking.jpg` - Kitchen and cooking preparation

**Location Images:**
- `joburg.jpg` - Johannesburg cityscape
- `capetown.jpg` - Cape Town cityscape  
- `durban.jpg` - Durban cityscape

**Icon Images:**
- `ic_arrow_back.png` - Back navigation arrow icon
- `graduation3.png` - Graduation ceremony icon
- `ic_course.png` - Course representation icon
- `coins5.png` - Currency and calculator icon
- `about_screen.png` - About section icon

**Gradient Drawable Resources:**
Create these XML files in `res/drawable/` directory:
- `header_gradient.xml`
- `about_card_gradient.xml`
- `six_month_gradient.xml`
- `six_week_gradient.xml`
- `calculator_gradient.xml`
- `status_bar_gradient.xml`
- `circle_button_bg.xml`
- `action_button_bg.xml`
- `quote_background.xml`

## Key Feature Implementation

### Navigation System
- **PopupMenu**: Consistent menu implementation across all activities
- **Intent Navigation**: Seamless screen transition management
- **Back Button Handling**: Proper activity stack management

### RecyclerView Implementation
- **CourseAdapter**: Handles both 6-month and 6-week course displays
- **ViewHolder Pattern**: Efficient view recycling for performance
- **Click Listeners**: Item click handling for detail navigation

### Fee Calculator Logic
- **Real-time Calculation**: Dynamic total updates on checkbox changes
- **Price Mapping**: Correct pricing structure for different course types
- **Visual Feedback**: Checkbox state changes with smooth animation

### Location Services Integration
- **Phone Intent**: Direct calling functionality implementation
- **Maps Integration**: Google Maps directions integration
- **Fallback Handling**: Web maps implementation for Google Maps unavailability

### Quote Sharing System
- **SMS Sharing**: Pre-formatted message with quote content
- **Email Sharing**: Email intent with subject and body configuration
- **Error Handling**: Toast messages for failed sharing attempts

## Design System Specifications

### Typography Hierarchy
- **Headers**: 26sp bold (primary titles), 24sp bold (section headers)
- **Body Text**: 16sp regular, 15sp secondary information
- **Labels**: 14sp subtle, 16sp bold for important information display
- **Buttons**: 14sp-16sp with bold weight for action items

### Spacing and Layout
- **Padding**: Consistent 16dp-25dp margin implementation
- **Card Elevation**: 4dp-15dp for visual depth hierarchy
- **Corner Radii**: 8dp-22dp for rounded element styling
- **Line Spacing**: 1.4-1.7 multipliers for optimal readability

### Interactive Elements
- **Buttons**: Gradient backgrounds with white text contrast
- **Checkboxes**: Standard Material Design with proper spacing
- **Cards**: Elevated design with shadow effects and rounded corners
- **Images**: Center-cropped with maintained aspect ratios

## Testing Protocol

### Manual Testing Checklist
- Navigation functionality between all application screens
- Back button operation across all activities
- Menu dropdown appearance and navigation accuracy
- Calculator total updates with checkbox interactions
- Phone call initiation from location interface buttons
- Maps functionality from direction buttons with coordinate accuracy
- Image display correctness without distortion
- Scrolling performance on all scrollable screens
- Quote sharing functionality via SMS and Email
- Course details display accuracy for all course types
- RecyclerView course information display correctness

### Device Compatibility Testing
- Testing on various Android devices (phones and tablets)
- Responsiveness verification across different screen sizes
- Performance assessment on older Android versions (API 21+)
- Orientation testing in both landscape and portrait modes

## Deployment Procedure

### Debug Build Process
1. Connect Android device or initialize emulator
2. Execute "Run" command in Android Studio
3. Select target deployment device
4. Automatic application installation

### Release Build Generation
1. Generate signed APK/Bundle in Android Studio
2. Navigate to Build > Generate Signed Bundle/APK
3. Create keystore if required
4. Build release version for distribution

## Troubleshooting Guide

### Common Implementation Issues

**Images Not Displaying Correctly:**
- Verify all image files are properly located in `res/drawable/`
- Confirm file name accuracy (case-sensitive verification)
- Ensure supported image formats (JPG, PNG, WebP)

**Layout Inflation Errors:**
- Validate all XML layout files are in correct directory structure
- Check all referenced drawable resources exist
- Confirm custom attributes are properly defined

**Navigation Functionality Issues:**
- Verify all activities are registered in AndroidManifest.xml
- Check Intent declarations and extra data passing accuracy
- Ensure package name consistency throughout application

**Calculator Update Malfunctions:**
- Verify checkbox IDs match between layout and Kotlin files
- Check price mapping logic in FeeCalculator.kt
- Confirm OnCheckedChangeListener proper configuration

**Gradle Build Errors:**
- Execute clean and rebuild project (Build > Clean Project)
- Verify dependency version compatibility
- Sync project with Gradle files
- Invalidate caches and restart (File > Invalidate Caches)

### Performance Optimization Recommendations
- Implement appropriate image sizes for different screen densities
- Utilize view recycling in adapter implementations
- Consider Glide/Picasso integration for image loading in production
- Optimize gradient drawables for performance efficiency

## Support Resources

For technical support or implementation questions:
1. Consult Android Studio documentation and system logs
2. Verify all file paths and naming convention adherence
3. Test on physical device if emulator issues occur
4. Review LogCat output for runtime errors and warnings

## License Information

This project is developed for educational purposes and community skill development initiatives. All course content and organizational branding are property of Empowering the Nation organization.
