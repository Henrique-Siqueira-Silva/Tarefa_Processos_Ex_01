package view;

import javax.swing.JOptionPane;

import controller.IdentificaOS;

public class mainEX01 {
	public static void main(String[] args) {
		IdentificaOS m = new IdentificaOS();
		String os = "";
		int opc = 0;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"ESCOLHA A OPS \n 1 = Identifica SO \n 2 = Mostrar IPV4 \n 3 = Ping Google \n 9 = FIM"));
			switch (opc) {
			case 1:
				os = m.os();
				System.out.println(os);
				System.out.println("");
				break;

			case 2:
				m.ip(os, "cmd /c ipconfig", "ip addr");
				break;
				
			case 3:
				m.ping(os, "ping -4 -n 10 www.google.com.br", "ping -4 -c 10 www.google.com.br");
				break;
				
			case 9:
				System.out.println("FIM DO PROGRAMA");
				break;

			}
		}
	}
}
