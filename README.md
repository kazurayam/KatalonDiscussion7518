Targeting specific web server for testing
==========================================

## What is this repository?

This is a small [Katalon Studio](https://www.katalon.com/) project for demonstration purpose. You can clone this project out onto your pc
and run it with your Katalon Studio.

This project is developed with Katalon Studio version 5.4.2

The original question raised was:

>Presently my company has eight web servers in its Production environment.
If I want to verify that deployment, right now it's a manual effort to set a specific server IP in local HOST file, and then perform the validation.  
>
>Is there a way to automate this in Katalon?  Ideally I'd like to have a test case that could target a specific server, based on IP address.

## Solution

This demo shows you how to:

1. You create a GlobalVariable named `hostname` in the `default` [Execution Profile](https://docs.katalon.com/pages/viewpage.action?pageId=13697476). You set a valid DNS host name or a IP address to the `GlobalVariable.hostname` of the `default` profile.
2. You can create multiple profiles. If you have 8 web servers to test, then you want to create 8 profiles. One profile for each machine. You want to create GlobalVariable named `hostname` in each profiles. You want to set valid DNS host name or IP addresses.
3. You create a test case which opens browser and let it nagivate to the URL refering to the `GlobalVarialbe.hostname`. See the test case source at 
