//////////////////////////////////////////////////////////////////////////////
// Licensing: This is released under the MIT License
// Original author: A Loxley
// Feel free to modify as you see fit
// PLEASE DO NOT REMOVE THIS LICENSING INFORMATION
//////////////////////////////////////////////////////////////////////////////
// Version 1.0.0
// Build 120715.1
//////////////////////////////////////////////////////////////////////////////
var myIntent = function() {
};

myIntent.prototype.showSettings = function() {
    PhoneGap.exec(null, null, "myIntent", "showSettings", []);
};

PhoneGap.addConstructor(function() {
    PhoneGap.addPlugin("myIntent", new myIntent());
    PluginManager.addService("myIntent", "com.phonegap.plugins.myIntent.myIntent");
});
