Targeting specific web server for testing
==========================================

## What is this repository?

This is a small [Katalon Studio](https://www.katalon.com/) project for demonstration purpose. You can clone this project out onto your pc
and run it with your Katalon Studio.

This project is developed with Katalon Studio version 5.4.2

This project is developed in order to answer to the question raised in the Katalon Forum: https://forum.katalon.com/discussion/7518/targeting-a-specific-web-server-for-testing


The original question raised was:

>Presently my company has eight web servers in its Production environment.
If I want to verify that deployment, right now it's a manual effort to set a specific server IP in local HOST file, and then perform the validation.  
>
>Is there a way to automate this in Katalon?  Ideally I'd like to have a test case that could target a specific server, based on IP address.

## Solution

This demo shows you how to:

1. You create a GlobalVariable named `hostname` in the `default` [Execution Profile](https://docs.katalon.com/pages/viewpage.action?pageId=13697476). You set a valid DNS host name or a IP address to the `GlobalVariable.hostname` of the `default` profile.
2. You can create multiple profiles. If you have 8 web servers to test, then you want to create 8 profiles. One profile for each machine. You want to create GlobalVariable named `hostname` in each profiles. You want to set valid DNS host name or IP addresses. ![create profile with host name](https://github.com/kazurayam/KatalonDiscussion7518/blob/master/docs/create_profile_with_hostname.png "create profile with hostname")
3. You create a test case which opens browser and let it nagivate to the URL refering to the `GlobalVarialbe.hostname`. See the test case source at https://github.com/kazurayam/KatalonDiscussion7518/blob/master/Scripts/TC1/Script1529627764306.groovy
4. When you run the test case, you have a option to choose a Profile to apply to the test case execution. In other words, you can switch the  `hostname` with the value specified in the Profile you chosen. In the top right corner of Katalon Studio UI you find a button to choose Profile. ![choose profile to apply](https://github.com/kazurayam/KatalonDiscussion7518/blob/master/docs/choose_profile_to_apply.png "choose profile to apply")
