
# Unstability warnings:
- We got various reports for VMWARE being NOT detected
- Latest versions of Memu Player is undetected ([more info](https://github.com/Back-X/anti-vm/issues/3))
- Some real environments are detected as virtual ([more info](https://github.com/Back-X/anti-vm/issues/4))
- Hyper-visor won't be detected
Please use it on your own risk.

 <p align=center>
<h1 align=center>Anti Virtual Machine</h1><p align=center>
Detect virtual machines with simplest codes</p>
<p align=center>  
<a href=http://graysuit.github.io><img src="https://img.shields.io/discord/873544368982720593?style=for-the-badge&label=discord" /></a>
<img title="Open Source" src="https://img.shields.io/badge/Open%20Source-%E2%99%A5-red?style=for-the-badge" >
<a href=LICENSE><img src="https://img.shields.io/github/license/Back-X/anti-vm?style=for-the-badge" ></a>
<img src="https://img.shields.io/github/stars/Back-X/anti-vm?style=for-the-badge">  
<img src="https://img.shields.io/github/forks/Back-X/anti-vm?style=for-the-badge">
</p>  

## Why we need universal way ?
Malware are now more clever than before. Before running, they check whether environment is virtual or real. 
But big problem they face, how to get an uinversal way to detect every type of VM ?
Most common is to search and match values from win32. But this method is static and for a limited versions of VMs. What if there are 1000+ VM manufacturers ? then you would have to write a code to match 1000+ VM signatures. But its time waste. Even after sometime, there would be new other VMs launched and your script would be wasted.

<p><b>Hybrid analysis</b></p>
<img src=https://www.hybrid-analysis.com/file-inline/6066cafb89aba91a2115c14b/screenshot/screen_1.png width=500 height=300>

<p><b>Any run sandbox</b></p>
<img src=http://content.any.run/tasks/874cd411-5996-4e93-83d8-fdc72e95215a/download/screens/5827ffa9-9b60-4d40-be97-b8e18afa2ba0/image.jpeg width=500 height=300>

## Codes
Based upon tests, I have made tiny programs to detect windows and android VMs.

[Android code](android/anti-vm.b4a)

[Windows code](windows/anti-vm.cs)  

[Releases](https://github.com/Back-X/anti-vm/releases/tag/1)

## Stability
It is tested on many environments and is very stable.
- Detects Visrtualbox 
- Detects Vmware 
- Detects Windows Server 
- Detects RDP 
- Detects Virustotal 
- Detects [any.run](https://app.any.run/tasks/874cd411-5996-4e93-83d8-fdc72e95215a) 
- Detects [hybrid-analysis.com](https://www.hybrid-analysis.com/sample/3718df5b2fa478987b2bc5ea2fc260798b5bfa98814125e57b6f2ea4d10117a0/6066cafb89aba91a2115c14b) 
etc...
## Warnings
- Windows VM detection code can't detect hardware based VM's (like Hyper-V that accelerates in hardware e.g github workflow VPS), nor it supposed to. 
- Android VM detection code will detect tablet without radio as VM.

## Contact
- Facebook: **[gray.programmerz.5](https://fb.com/messages/t/gray.programmerz.5)**
- Email: **[hackrefisher@gmail.com](mailto:hackrefisher@gmail.com)**
- Website: **[tiplava](http://tiplava.blogspot.com)**
- Discord: **[Cody](http://graysuit.github.io)**
# I Love ALLAH + Holy Prophet + Islam and Pakistan.
