//@pp0236

import javax.swing.JOptionPane;

import com.sun.jna.platform.win32.Ole32;
import com.sun.jna.platform.win32.COM.Wbemcli;
import com.sun.jna.platform.win32.COM.Wbemcli.IWbemClassObject;
import com.sun.jna.platform.win32.COM.WbemcliUtil;

public class App {
	public static void main(String... args) {
		boolean IsVM = isVM();
		JOptionPane.showConfirmDialog(null, "You are using " + (IsVM ? "Virtual" : "Real") + " Environment", "Universal VM Detector", -1);
	}
	
	// base on https://stackoverflow.com/a/55660327
	public static boolean isVM() {
		int count = 0;
		
		Ole32.INSTANCE.CoInitializeEx(null, Ole32.COINIT_MULTITHREADED);
		Wbemcli.IWbemServices svc = WbemcliUtil.connectServer("ROOT\\CIMV2");
		
		Wbemcli.IEnumWbemClassObject enumerator = svc.ExecQuery("WQL", "SELECT * FROM Win32_PortConnector", Wbemcli.WBEM_FLAG_FORWARD_ONLY/* | Wbemcli.WBEM_FLAG_RETURN_IMMEDIATELY sometime will return nothing*/, null);
		IWbemClassObject[] result;
		while (true) {
			result = enumerator.Next(0, 1);
			if (result.length == 0) break;

			++count;
			result[0].Release();
		}
		enumerator.Release();
		svc.Release();
		Ole32.INSTANCE.CoUninitialize();
		
		return count == 0;
	}
}
