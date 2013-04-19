<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>boxList</title>
</head>
<body>
	<table>
		<s:iterator value="boxes" status="st">
		<s:if test="#st.count%3==1">
		<tr>
		</s:if>
		
		<td>
			<s:if test="boxStatus==0"> 未使用</s:if>
			<s:else>使用中</s:else>			
			<s:property value="boxNum" />
		</td>	
		<td>
			<s:property value="boxTypeName"/>
		</td>	
		<td>
			<a href="getPackageDetailsByBoxNumAction?boxNum=<s:property value="boxNum"/>">详情</a>
		</td>		
		<s:if test="#st.count%3==0">
		</tr>
		</s:if>

			
		</s:iterator>
	</table>
</body>
</html>
