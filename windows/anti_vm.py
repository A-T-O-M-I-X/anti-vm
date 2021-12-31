#@pp0236

import wmi

isVM = len(wmi.WMI().Win32_PortConnector()) == 0
print("You are using " + ("Virtual" if isVM else "Real") + " Environment")