# Duration View

Duration View allows you to create views to depict durations of time.

For example, if you wish to display a duration split into Days, Hours, Mins and Secs, you just need to set the values and DurationView will do the rendering for you.

![alt text](https://github.com/rayzone107/DurationView/blob/master/Image%201.png) . . . . . ![alt text](https://github.com/rayzone107/DurationView/blob/master/Image%202.png) 

<h3>Sample App</h3>

Download the Demo app on Google Play Store:

<a href='https://play.google.com/store/apps/details?id=com.rachitgoyal.durationview'><img alt='Get it on Google Play' src='https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png' width="160" height="65"></a>

<h2>Installation</h2>

<h3>Gradle</h3>

Add JitPack in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
        ...
		maven { url 'https://jitpack.io' }
    }
}
```

Add it as a dependency in your app's build.gradle file
```
dependencies {
    implementation 'com.github.rayzone107:durationview:1.00'
}
```

<h2>How to use</h2>

<b>Add a DurationView to your XML layout</b>

Below are the default values for all the properties
```xml
<com.rachitgoyal.durationitem.DurationView
        android:id="@+id/duration_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        
        app:dv_days="0"                         \\ Integer Value for 1st Numerical Section
        app:dv_hours="0"                        \\ Integer Value for 2st Numerical Section
        app:dv_mins="0"                         \\ Integer Value for 3rd Numerical Section
        app:dv_secs="0"                         \\ Integer Value for 4th Numerical Section
        app:dv_number_text_size="12sp"          \\ Text Size of above values

        app:dv_show_days="true"                 \\ Whether to show 1st Section or not
        app:dv_show_hours="true"                \\ Whether to show 2nd Section or not
        app:dv_show_mins="true"                 \\ Whether to show 3rd Section or not
        app:dv_show_secs="true"                 \\ Whether to show 4th Section or not

        app:dv_show_labels="true"               \\ Whether to show labels or not
        app:dv_days_label="DAYS"                \\ String label for 1st section
        app:dv_hours_label="HOURS"              \\ String label for 2nd section
        app:dv_mins_label="MINS"                \\ String label for 3rd section
        app:dv_secs_label="SECS"                \\ String label for 4th section
        app:dv_label_position="bottom"          \\ Can be 'top' or 'bottom'
        app:dv_label_text_size="18sp"           \\ Label text size
        app:dv_label_vertical_padding="6dp"     \\ Padding between label and numbers

        app:dv_text_color="#000000"             \\ Color that will be applied to all text, if below values are not set
        app:dv_number_color="#000000"           \\ Color that will be all numbers, if not individually set
        app:dv_label_color="#000000"            \\ Color that will be all labels, if not individually set
                                           
        app:dv_days_color="#000000"             \\ Days Text Color, will override text_color and number_color
        app:dv_hours_color="#000000"            \\ Hours Text Color, will override text_color and number_color
        app:dv_mins_color="#000000"             \\ Mins Text Color, will override text_color and number_color
        app:dv_secs_color="#000000"             \\ Secs Text Color, will override text_color and number_color

        app:dv_days_label_color="#000000"       \\ Days Label Text Color, will override text_color and label_color
        app:dv_hours_label_color="#000000"      \\ Hours Label Text Color, will override text_color and label_color
        app:dv_mins_label_color="#000000"       \\ Mins Label Text Color, will override text_color and label_color
        app:dv_secs_label_color="#000000"       \\ Secs Label Text Color, will override text_color and label_color

        app:dv_show_dividers="false"            \\ Whether to show dividers between views
        app:dv_divider_color="#000000"          \\ Divider color
        app:dv_divider_top_bottom_margin="4dp"  \\ Divider top and bottom margin from view edges
        app:dv_divider_width="2dp" />           \\ Divider width
```

> Note that `"wrap_content"` might not function properly. `wrap_content` and `match_parent` might work the same way. Either set absolute dimensions in dp, or set `match_parent` with limited available area (within a ViewGroup).


These values can also be set programatically.

```java

        DurationView durationView = findViewById(R.id.duration_view);
        
        durationView.setDays(rnd.nextInt(100));
        durationView.setHours(rnd.nextInt(24));
        durationView.setMins(rnd.nextInt(60));
        durationView.setSecs(rnd.nextInt(60));
        durationView.setDaysColor(Color.BLACK);
        durationView.setHoursColor(Color.BLACK);
        durationView.setMinsColor(Color.BLACK);
        durationView.setSecsColor(Color.BLACK);
        durationView.setDaysLabelColor(Color.BLACK);
        durationView.setHoursLabelColor(Color.BLACK);
        durationView.setMinsLabelColor(Color.BLACK);
        durationView.setSecsLabelColor(Color.BLACK);
        
        durationView.setLabelTextSize(10f);
        durationView.setNumberTextSize(18f);
        
        durationView.setShowDividers(true);
        durationView.setDividersColor(Color.BLACK);
        durationView.setDividersMargin(2f);
        durationView.setDividersWidth(2f);

```

<h2>Contribution</h2>

Any kind of contribution will be appreciated; feel free to create a pull request or file issues on the issue tracker.
