package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.text.AbstractDocument.Content;

public class IdentificaOS {

	public IdentificaOS() {
		super();
	}

	public String os() {

		String os = System.getProperty("os.name");
		return os;

	}

	public void ip(String os, String IpWin, String IpLinux) {
		if (os == "") {
			System.out.println("Primeiro Identifique o Sistema Operacional");

		} else {
			if (os.contains("dows")) {
				try {
					Process p = Runtime.getRuntime().exec(IpWin);
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha = buffer.readLine();
					BufferedReader buffer2 = new BufferedReader(leitor);
					String linha2 = buffer2.readLine();

					while (linha != null) {
						linha = buffer.readLine();
						if (linha.contains("Adaptador")) {
							linha2 = linha;

						}
						if (linha.contains("IPv4")) {
							System.out.println(linha2);
							System.out.println(linha);
						}
					}
					buffer.close();
					fluxo.close();
					leitor.close();
				} catch (Exception e) {
					String msgErro = e.getMessage();
					System.err.println();
				}
			} else {
				try {
					Process p = Runtime.getRuntime().exec(IpLinux);
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha = buffer.readLine();
					BufferedReader buffer2 = new BufferedReader(leitor);
					String linha2 = buffer2.readLine();
					while (linha != null) {
						linha = buffer.readLine();
						if (linha.contains("Adaptador")) {
							linha2 = linha;

						}
						if (linha.contains("IPv4")) {
							System.out.println(linha2);
							System.out.println(linha);
						}
					}
					buffer.close();
					fluxo.close();
					leitor.close();
				} catch (Exception e) {
					String msgErro = e.getMessage();
					System.err.println(msgErro);
				}
			}

		}
	}

	public void ping(String os, String PingWin, String PingLinux) {
		if (os == "") {
			System.out.println("Primeiro Identifique o Sistema Operacional");

		} else {
			if (os.contains("dows")) {
				try {
					Process p = Runtime.getRuntime().exec(PingWin);
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha = buffer.readLine();
					BufferedReader buffer2 = new BufferedReader(leitor);
					String linha2 = buffer2.readLine();

					while (linha != null) {
						linha = buffer.readLine();
						if (linha.contains("M�dia")) {
							System.out.println(linha);
						}
					}
					buffer.close();
					fluxo.close();
					leitor.close();
				} catch (Exception e) {
					String msgErro = e.getMessage();
					System.err.println();
				}
			} else {
				try {
					Process p = Runtime.getRuntime().exec(PingLinux);
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha = buffer.readLine();
					while (linha != null) {
						linha = buffer.readLine();
						if (linha.contains("M�dia")) {
							System.out.println(linha);
						}
					}
					buffer.close();
					fluxo.close();
					leitor.close();
				} catch (Exception e) {
					String msgErro = e.getMessage();
					System.err.println(msgErro);
				}
			}

		}
	}

}
