# FileUpload_AutoIt
uploading file using AutoIT

## This script is used to test the following
```
1.launch the browser and executes the GUI command scripted using AutoIT 
2.GUI command scripted for automating the file upload scenario
```
## Pre-requisites
```
1.Install AutoIT 3.3.14.2
2.Install SciTE  
```
## AutoIT locator
![](https://github.com/antonysam/FileUpload_AutoIt/blob/master/Images/Filename_field.JPG)<br/>

![](https://github.com/antonysam/FileUpload_AutoIt/blob/master/Images/AutoIT(Frozen).JPG)<br/>

![](https://github.com/antonysam/FileUpload_AutoIt/blob/master/Images/open_button.JPG)

```
Using the Finder tool need to locate the element present in the Window GUI
It displays the control information details within the dialog box
```
Script
![](https://github.com/antonysam/FileUpload_AutoIt/blob/master/Images/AutoITScript(SciTE).JPG)
## AutoIT Script explanation
```
ControlFocus( classname, text, controlid)---> focusess on a particular element
Sleep(millisecond)--->delay
ControlSetText(classname, text, Controlid, newtext)--->set the text need to be given in the focussed element
ControlClick(classname, text, button)--->clicks on the button by the given button name
```

## Compilation & intergertion with test script
```
1.After compiling the script able to get .exe file 
2.Runtime.getRuntime().exec("Desktop\\AutoIT Script\\Fileupload.exe");
```
