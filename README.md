![Small Thermostat](https://raw.githubusercontent.com/fxstein/smartthings-smartlib/master/smartlib.png) SmartThings-SmartLib
====================

A re-useable library for SmartThings SmartApps. Born out of the need to share re-useable code across various SmartApps. These are various best practices for how to operationalize and instrument your SmartApp.

You are encouraged to contribute your own re-useable functions and helpers.

This library is licensed as [Apache V2](https://github.com/fxstein/smartthings-smartlib/blob/master/LICENSE "Apache V2 License") and hosted on github: https://github.com/fxstein/smartthings-smartlib


SmartLib Library
================

These are some of the primitives included in the library:

Logging
-------

To better support debugging and operationalization here are some logging helpers to be used instead of

```
code example
```

Conversions
-----------

Commonly required data type conversions when building Apps for SmartThings

```
code example
```

Installation
------------

*Describe install and setup required for the SmartLib library*


Developer Tools
===============

When developing SmartApps and custom devices for SmartThings in Groovy there are some useful tools to help with productivity and where the online IDE falls short.

* First consider using [github](github.com "GitHub") for your primary repository of all your work. Track changes, label versions and allow others to contribute through pull requests.

* Depending on your platform install and setup the github client: [Mac](https://mac.github.com "Github for Mac") | [Windows](https://windows.github.com "GitHub for Windows")

* The development team at github open-sourced their howgrown highly flexible and extensible editor: [Atom](atom.io "Atom - A hackable text editor for the 21st Century")

* In order to add groovy support to Atom simply add [Groovy Language Support](https://atom.io/packages/language-groovy "Groovy Language Support for Atom")

Should not take more than 5-10 minutes to get you up and running.  

How to Develop for SmartThings
------------------------------

Leverage the tool set of your choice or the selection listed above for all your edit, version control, issue tracking and collaboration and simply Copy/Paste your App Code into the [SmartThings Online IDE](https://graph.api.smartthings.com/ide/app/editor "SmartThings Developer IDE")

*Wishlist: RESTful API to allow a developer to upload and publish the source code for an App*

Useful Resources
----------------

These are some useful resources that will help you develop better SmartThings Apps and device drivers.

### Icons

Always looking for a suitable icon for your app. SmartThings provides a decent list of icons that can be used as a starting point. It easily allows you to replace the ugly default icon and select a more appropriate one.

Thanks to Brian Steere (@Dianoga SmartThings Community) there is a useful icon explorer that allows you to browse some example icons as used by SmartThings:
[SmartThings Shared Icons](http://scripts.3dgo.net/smartthings/icons/ "SmartThings Shared Icons on AWS")

In order to use any of the icons for your SmartApp simple browse the collection and copy/paste the link into your app. The Icons displayed are the larger 2x sizes.

Thermostat Example:

![Thermostat](https://s3.amazonaws.com/smartthings-device-icons/Home/home1-icn@2x.png)

```
https://s3.amazonaws.com/smartthings-device-icons/Home/home1-icn@2x.png
```

In order to get the smaller size simply drop the `@2x` from the file name:

```
https://s3.amazonaws.com/smartthings-device-icons/Home/home1-icn.png
```

Small Thermostat Example:

![Small Thermostat](https://s3.amazonaws.com/smartthings-device-icons/Home/home1-icn.png)

To host your own icons and images simply add them to your github repository and reference them through the raw image url like this:

```
https://raw.githubusercontent.com/fxstein/smartthings-smartlib/master/smartlib@2x.png
https://raw.githubusercontent.com/fxstein/smartthings-smartlib/master/smartlib.png
```
![SmartLib](https://raw.githubusercontent.com/fxstein/smartthings-smartlib/master/smartlib@2x.png)
![SmartLib Small](https://raw.githubusercontent.com/fxstein/smartthings-smartlib/master/smartlib.png)


### Markdown Cheatsheet

In order to write nicely written Markdown documents there is a great resource available here on github that gives lots of examples of how to structure a Markdown Document (Thanks to @adam-p):

[Markdown Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet "adam-p's Markdown Cheatsheet")


**To be continued...**
