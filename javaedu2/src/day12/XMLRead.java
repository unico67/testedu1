package day12;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLRead {

	public static void main(String[] args) {
		try {

			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory
					.newDocumentBuilder();
			Document document = documentBuilder
					.parse("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=11680640");
			NodeList nameList = document.getElementsByTagName("wfKor");
			Node name = nameList.item(0);
			String textContent = name.getTextContent();
			System.out.println(textContent);
		} catch (Exception e) {
			System.out.println("오류 : " + e.getMessage());
		}

	}

}
