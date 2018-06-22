[![Walinns Logo](https://walinns.com/wp-content/uploads/2018/02/walinns.png)](https:walinns.com)


Walinns Android SDK  

Real-time Mobile Analytics Platform. Walinns helps the app marketers to analyze and measure how users are using your mobile apps. 

## Features of Walinns Analytics 

1. User Enagement 
2. Conversion Funnels
3. User Behavioral Segments
4. Customer Retention
5. Push Notifications


For more information check out our [website](https://walinns.com "Walinns") and [documentation](https://walinns.com/docs/ "Walinns Technical Documentation").

## Getting Started

1. Sign Up

    [Sign up](https://app.walinns.com/sign-up) for a free account.  
    
2.  Install the SDK
### Android Studio / Gradle     
        
    We publish the sdk to jcenter and mavenCentral as an `aar` file. Just declare it as dependency in your `build.gradle` file.     
        
        dependencies {      
             compile 'com.walinns.walinnsapi:walinnsapi:1.0.1'
        }       

    ### Manual Install

    Copy the included WalinnsAndroidSDK.jar file to your projects libs directory. Add this JAR file as a dependency for your Android app project.
    
  3. Add Your Walinns Project Credentials
 
 Paste the below code snippet outside the <application></application> tags. 
 
 <uses-permission android:name="android.permission.INTERNET"/>
 <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
 <uses-permission android:name="android.permission.BLUETOOTH" />
 <uses-permission android:name="android.permission.GET_ACCOUNTS" />
 <uses-permission android:name="android.permission.GET_TASKS"/>
 <uses-permission android:name="android.permission.READ_PROFILE"/>
 <uses-permission android:name="android.permission.READ_CONTACTS"/>
 <uses-permission android:name="android.permission.READ_PHONE_STATE"/>
 <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
 <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
 <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>

    add the following inside the `<application>
    
    <service android:name="com.walinns.walinnsapi.WAService" android:enabled="true" android:exported="true"></service>
    
    </application>` tags of your AndroidManifest.xml:. 
  
    
    
  4. Initialize the Walinns SDK 
  
In the onCreate() of your main activity, add the below code snippet and replace your "PROJECT_TOKEN" with your token created in step 1.
  
    WalinnsAPI.getInstance().initialize(this,"PROJECT_TOKEN");
  
    
   5. Documentation 
   
   Please see our [full documentation here](httpss://walinns.com/docs/) for more information how to track sessions, screen name and events. 
   
   ## Example Usage
Checkout the example StarterProject.
