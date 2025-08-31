TSHIAMO NKGE - ST10473572



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

### App Screens
1. **Home Screen**: Main navigation with course categories
2. **About Us**: Mission, vision, and company information
3. **6-Month Courses**: Professional learnership programs (R1500 each)
4. **6-Week Courses**: Short skills training programs (R750 each)
5. **Fee Calculator**: Interactive pricing calculator
6. **Locations**: Three training centers across South Africa

## Screenshots



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
MainActivity.kt - Home screen with navigation cards
AboutScreen.kt - Company information and mission
SixMonthCourses.kt - Professional learnership courses
SixWeekCourses.kt - Short skills training courses
FeeCalculator.kt- Fee calculation functionality
Locations.kt - Training center locations
```

### Layouts
```
activity_main.xml           - Home screen layout
activity_about.xml          - About us page layout
activity_six_month_courses.xml - 6-month courses layout
activity_six_week_courses.xml  - 6-week courses layout
activity_feecalculator.xml     - Calculator interface layout
activity_locations.xml      - Locations page layout
```

### Resources

#### Colors (`res/values/colors.xml`)
```xml
<color name="primary_green">#32CD32</color>
<color name="dark_green">#228B22</color>
<color name="gold">#FFD700</color>
<color name="orange">#FF8C00</color>
<color name="blue">#1E90FF</color>
<color name="red">#FF6347</color>
<color name="background_light">#f8f9fa</color>
```

#### Drawable Resources
- **Gradients**: Header backgrounds, card backgrounds
- **Shapes**: Button backgrounds, rounded corners
- **Icons**: Navigation icons, star ratings
- **Images**: Course images, location images

## Course Offerings

### 6-Month Courses (R1500 each)
1. **First Aid**
   - Wounds and bleeding management
   - Burns and fractures treatment
   - Emergency scene management
   - CPR techniques

2. **Sewing**
   - Types of stitches
   - Threading a sewing machine
   - Garment alterations
   - Sewing buttons, zips, and hems

3. **Landscaping**
   - Indigenous and exotic plants knowledge
   - Garden layout aesthetics
   - Plant shapes, colors, and design principles

### 6-Week Courses (R750 each)
1. **Life Skills**
   - Opening bank accounts
   - Basic labour law rights
   - Reading and writing literacy
   - Numeric literacy

2. **Child Minding**
   - Birth to 6-month baby care
   - 7-month to 1-year old care
   - Toddler development needs
   - Educational toy usage

3. **Cooking**
   - Nutritional requirements
   - Protein, carbohydrate, and vegetable knowledge
   - Meal planning strategies
   - Food preparation and cooking techniques

## Installation Instructions

### Prerequisites
1. Android Studio (latest version)
2. Android SDK API 21 or higher
3. Gradle 8.0+

### Setup Steps

1. **Clone or Create Project**
   ```bash
   # Create new Android project in Android Studio
   # Choose "Empty Activity" template
   # Set minimum SDK to API 21
   ```

2. **Add Dependencies**
   - Open `app/build.gradle`
   - Add required dependencies listed above
   - Sync project

3. **Create Directory Structure**
   ```
   app/src/main/
   ├── java/com/example/empoweringthenation/
   ├── res/
   │   ├── drawable/
   │   ├── layout/
   │   ├── menu/
   │   └── values/
   ```

4. **Add Resource Files**
   - Copy all XML layout files to `res/layout/`
   - Copy all drawable resources to `res/drawable/`
   - Copy colors.xml to `res/values/`
   - Copy main_menu.xml to `res/menu/`

5. **Add Activity Files**
   - Copy all Kotlin activity files to your package directory
   - Ensure package names match your project

6. **Register Activities**
   - Update `AndroidManifest.xml` with all activities:
   ```xml
   <activity android:name=".AboutScreen" />
   <activity android:name=".SixMonthCourses" />
   <activity android:name=".SixWeekCourses" />
   <activity android:name=".FeeCalculator" />
   <activity android:name=".Locations" />
   ```

### Required Images

Add these images to `res/drawable/`:

**Course Images:**
- `about.jpg` - Educational/team setting
- `first_aid.jpg` - Medical training scene
- `sewing.jpg` - Sewing machine/fabric
- `landscaping.jpg` - Garden/plants
- `life_skills.jpg` - Office/professional setting
- `child_minding.jpg` - Childcare/nursery
- `cooking.jpg` - Kitchen/cooking

**Location Images:**
- `johannesburg_image.jpg` - Johannesburg cityscape
- `cape_town_image.jpg` - Cape Town cityscape  
- `durban_image.jpg` - Durban cityscape

**Navigation Images:**
- `about_image.jpg` - Team/education thumbnail
- `six_month_image.jpg` - Professional training thumbnail
- `six_week_image.jpg` - Skills training thumbnail
- `calculator_image.jpg` - Calculator/finance thumbnail

## Key Features Implementation

### Navigation System
- **Menu Integration**: PopupMenu in all activities
- **Back Navigation**: Consistent back button behavior
- **Intent-based Navigation**: Seamless screen transitions

### Scrollable Content
- **ScrollView Implementation**: Smooth vertical scrolling
- **CardView Layout**: Material Design card components
- **Responsive Design**: Adapts to different screen sizes

### Interactive Calculator
- **Real-time Calculation**: Updates total as courses are selected
- **Checkbox Integration**: Visual feedback for selections
- **Animation Effects**: Scale animations for total amount updates

### Location Services
- **Phone Integration**: Direct calling functionality
- **Maps Integration**: Google Maps directions
- **Contact Information**: Complete location details

## Design System

### Color Scheme
- **Primary**: Green gradients (#32CD32 to #228B22)
- **Secondary**: Blue gradients (#1E90FF to #0056B3)
- **Accent**: Gold gradients (#FFD700 to #FF8C00)
- **Alert**: Red gradients (#FF6347 to #DC143C)

### Typography
- **Headers**: Playfair Display (serif)
- **Body Text**: Montserrat (sans-serif)
- **Emphasis**: Bold weights for important information

### Visual Elements
- **Gradients**: Vibrant color transitions
- **Cards**: Elevated material design
- **Icons**: Emoji-based visual indicators
- **Shadows**: Depth and hierarchy

## Testing

### Manual Testing Checklist
- [ ] Navigation between all screens works
- [ ] Back buttons function correctly
- [ ] Menu dropdown appears and functions
- [ ] Calculator updates totals accurately
- [ ] Phone calls initiate from location buttons
- [ ] Maps open from direction buttons
- [ ] All images display correctly
- [ ] Scrolling works smoothly on all screens

### Device Testing
- Test on various Android devices (phones/tablets)
- Verify responsiveness across screen sizes
- Check performance on older Android versions (API 21+)

## Deployment

### Debug Build
1. Connect Android device or start emulator
2. Click "Run" in Android Studio
3. Select target device
4. App installs automatically

### Release Build
1. Generate signed APK in Android Studio
2. Build > Generate Signed Bundle/APK
3. Create keystore if needed
4. Build release version

## Troubleshooting

### Common Issues

**Images Not Displaying:**
- Verify image files are in `res/drawable/`
- Check file names match exactly (lowercase, no spaces)
- Ensure image formats are supported (JPG, PNG, JPEG)

**Navigation Not Working:**
- Verify all activities are registered in AndroidManifest.xml
- Check Intent declarations in Kotlin files
- Ensure package names are consistent

**Calculator Not Updating:**
- Verify checkbox IDs match in layout and Kotlin
- Check price mapping in FeeCalculator
- Ensure OnCheckedChangeListener is properly set

**Gradle Build Errors:**
- Clean and rebuild project
- Check dependency versions for compatibility
- Sync project with Gradle files

## Support

For technical support or questions about implementation:
1. Check Android Studio documentation
2. Verify all file paths and names
3. Test on physical device if emulator issues occur
4. Review LogCat for runtime errors

## License

This project is for educational purposes and community skill development.

