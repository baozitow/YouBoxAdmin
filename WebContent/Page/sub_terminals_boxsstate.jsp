<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Youbox后台管理内厕版</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.tabfont01 {	
	font-family: "宋体";
	font-size: 9px;
	color: #555555;
	text-decoration: none;
	text-align: center;
}
.font051 {font-family: "宋体";
	font-size: 12px;
	color: #333333;
	text-decoration: none;
	line-height: 20px;
}
.font201 {font-family: "宋体";
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}
.button {
	font-family: "宋体";
	font-size: 14px;
	height: 37px;
}


ul,li {
	list-style-type: none;
	list-sytle: none;
	float: left;
}
html { overflow-x: auto; overflow-y: auto; border:0;} 
-->
</style>

<link href="css/css.css" rel="stylesheet" type="text/css" />
<script type="text/JavaScript">

</script>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<SCRIPT language=JavaScript>
function sousuo(){
	window.open("gaojisousuo.htm","","depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}
function selectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			obj[i].checked = true;
		}
	}
}

function unselectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			if (obj[i].checked==true) obj[i].checked = false;
			else obj[i].checked = true;
		}
	}
}

function link(){
    document.getElementById("fom").action="xiangmu.htm";
   document.getElementById("fom").submit();
}

function btn_box_open(){
    alert("口令打开");
}





</SCRIPT>

<body>
<form name="fom" id="fom" method="post" action="">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
 
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="62" background="images/nav04.gif">
          
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
		 </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">

        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
	         
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                   <td height="20" colspan="15" align="center" bgcolor="#EEEEEE" class="tablestyle_title">模拟箱子使用表</td>  </tr>
                  <tr>
				      <table width="100%" border="3" align="center" cellpadding="5" cellspacing="5">
				      <s:iterator value="boxes" status="st">
				      <s:if test="#st.count%3==1">
				          <tr>
				      </s:if>
				      <s:if test="boxStatus==0">
				          <td style="background:#fff;text-align:center;margin:0 auto">箱号：<s:property value="boxNum" />号   类型：<s:property value="boxTypeName"/>

				          </td>
				      </s:if>
				      <s:if test="boxStatus==5">
				          <td style="background:#FFFF00;text-align:center;margin:0 auto">箱号：<s:property value="boxNum" />号   类型：<s:property value="boxTypeName"/>

				          </td>
					 </s:if>
					<s:if test="boxStatus==1">				          
				          <td style="background:#33FF00;text-align:center;margin:0 auto">箱号：<s:property value="boxNum" />号   类型：<s:property value="boxTypeName"/>
				         <a href="getPackageDetailsByBoxNumAction?boxNum=<s:property value="boxNum"/>">快件详情</a>
				         	<a href="setBoxAvailableAction?boxNum=<s:property value="boxNum" />&terminalId=<s:property value="terminalId" />">口令打开</a>
				          </td>
				    </s:if>
						<s:if test="#st.count%3==0">
				          </tr>
				    </s:if>
						</s:iterator>

				          

				      </table>
                  </tr>
                </table></td>
              </tr>
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
              
                <TD colspan="2" align="center" height="50px"><input type="button" name="Submit2"
								value="返回" class="button" onclick="window.history.go(-1);" />
							</td>
              </tr>
              
              <tr>
              
                <ul><li>使用中</li><li><div style="display:block;float:left;height:10px;width:10px;background:#33FF00 ;border:1px solid #7F9DB9"></div></li>
                <li style="margin-left:10px">故障</li><li><div style="display:block;float:left;height:10px;width:10px;background:#FFFF00 ;border:1px solid #7F9DB9"></div></li>
                <li style="margin-left:10px">未使用</li><li><div style="display:block;float:left;height:10px;width:10px;background:#fff ;border:1px solid #7F9DB9"></div></li></ul>
              </tr>
          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>
