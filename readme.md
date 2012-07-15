## About

This is a phonegap (cordova) plugin for Android that allows you to launch the android settings screen from within your application by calling an Android intent.

This is my first attempt at writing an Android plugin, so may not be the finest piece of code but it works for me!

Licenesed under the MIT license.

The code has been kept simple. Please feel free to modify and use for your own purposes.

## To Use

copy myIntent.java into src/com.phonegap.plugins.myIntent

put myIntent.js into assets/www

Include the javascript file in your index.html page, after phonegap/cordova js
```html
    <script type="text/javascript" charset="utf-8" src="myintent.js"></script>
```
Include the plugin in plugins.xml
```xml
    <plugin name="myIntent" value="com.phonegap.plugins.myIntent.myIntent"/>
```
Then to launch just call the following in your javascript 
```js
    window.plugins.myIntent.showSettings();
```