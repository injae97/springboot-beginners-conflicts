package com.boot.sailing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCon {

	@GetMapping("/rest")
	public String doRest() {
		String strHtml = "";
		
        strHtml = "<html>\n" +
                  "<head>\n" +
                  " <meta charset=\"UTF-8\">\n" +
                  " <title>ȸ�� ���� ����Ʈ</title>\n" +
                  "</head>\n" +
                  "<body>\n" +
                  "<h1> �� ȸ�� ���� ����Ʈ </h1>\n" +
                  "<h1>  HTML -> Servlet  </h1>\n" +
                  "<a href='./index.html'>�� Home </a>\n" +
                  "<p>\n" +
                  "<table style='width: 400px;'>\n"+
                  "<tr style='height: 40px'>\n"+
                  "<th>No</th>\n"+
                  "<th align='center'>�̸�</th>\n"+
                  "<th align='center'>����</th>\n"+
                  "<th align='center'>�������</th>\n"+
                  "</tr>\n";
        
		return strHtml;
	}
}
