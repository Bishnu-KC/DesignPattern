package pom.b.structural.f.proxy.dp;

public class ProxyPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OfficeInternetAccess access = new ProxyInternetAccess("Bishnu K C");  
        access.grantInternetAccess(); 

	}

}
