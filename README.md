# Android屏幕适配

# Step 1. Add the JitPack repository to your build file
  Add it in your root build.gradle at the end of repositories:
  
    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
  
# Step 2. Add the dependency

    dependencies {
            implementation 'com.github.sinothk:AndroidScreenMatch:1.0.0920'
    }
    
# Use in xml:
    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        android:orientation="vertical"
        tools:context=".MainActivity">
        <TextView
            android:layout_width="@dimen/dp_90"
            android:layout_height="@dimen/dp_70"
            android:background="@color/colorPrimary"
            android:gravity="center"
            android:text="Hello World!"
            android:textColor="#FFF"
            android:textSize="@dimen/sp_16" />
    </LinearLayout>
