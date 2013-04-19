<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>项目管理系统 by www.mycodes.net</title>
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
html { overflow-x: auto; overflow-y: auto; border:0;} 
-->
</style>

<link href="../css/css.css" rel="stylesheet" type="text/css" />
<script type="text/JavaScript">

</script>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
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

</SCRIPT>

<body>
<form name="fom" id="fom" method="post" action="">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
 
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="62" background="../images/nav04.gif">
          
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
          <td>
          
          <s:iterator value="packages" status="st">
          
          	<table class="package_details" width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
	         
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                   <td height="20" colspan="15" align="center" bgcolor="#EEEEEE" class="tablestyle_title"> 包裹信息</td>  </tr>
                  <tr>
				    <td width="15%" height="20" align="right" bgcolor="#FFFFFF">包裹ID:</td>
                    <td width="85%" align="left" bgcolor="#FFFFFF"><s:property value="packageId" /></td>
                    </tr>
                  <tr>
				    <td height="20" align="right" bgcolor="#FFFFFF">所属终端ID:</td>
                    <td bgcolor="#FFFFFF"><s:property value="terminalId" /></td>
                    </tr>
                  <tr>
				   <td height="20" align="right" bgcolor="#FFFFFF">用户手机号码:</td>
                    <td bgcolor="#FFFFFF"><s:property value="userPhone" /></td>
                    </tr>
                  <tr>
				    <td align="right" bgcolor="#FFFFFF">快件单号:</td>
                    <td bgcolor="#FFFFFF"><s:property value="parcelId" /></td>
                    </tr>
                  <tr>
				    <td align="right" bgcolor="#FFFFFF">箱子ID:</td>
                    <td bgcolor="#FFFFFF"><s:property value="boxId" /></td>
                    </tr>
                  <tr>
				    <td align="right" bgcolor="#FFFFFF">保存时间:</td>
                    <td bgcolor="#FFFFFF"><s:property value="storeTime" /></td>
                    </tr>
                  <tr>
				    <td align="right" bgcolor="#FFFFFF">取出时间:</td>
                    <td bgcolor="#FFFFFF">懒得告诉你！内厕版不提供，公厕版再做！</td>
                    </tr>
                  <tr>
                    <td align="right" bgcolor="#FFFFFF">包裹状态:</td>
                    <td bgcolor="#FFFFFF">应该是未取！</td>
                  </tr>
                  <tr>
                    <td align="right" bgcolor="#FFFFFF">备注:</td>
                    <td bgcolor="#FFFFFF">看毛看啊</td>
                  </tr>
                 
                 
                </table></td>
              </tr>
            </table>
            <!-- next table -->
            
            </s:iterator>
            
            
                      
          
            
            
            <!-- end Next table -->
            </td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="../images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
                <TD colspan="2" align="center" height="50px"><input type="button" name="Submit2"
								value="返回" class="button" onclick="window.history.go(-1);" />
							</td>
              </tr>
          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>
