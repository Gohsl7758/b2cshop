<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'list.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<META name=GENERATOR content="MSHTML 8.00.7601.17514">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<LINK rel=stylesheet type=text/css href="../css/style.css">
</head>

<body>
<s:debug></s:debug>
	<DIV id=header class=wrap>
		<DIV id=logo>
			<IMG src="../images/logo.gif">
		</DIV>
	</DIV>
	<DIV id=navbar class=wrap>
		<DL class="search clearfix">
			<FORM id=sform method=post action=search.action>
				<DT>
					<UL>
						<LI class=bold>房屋信息</LI>
						<LI>标题：<INPUT class=text type=text name=title> <LABEL
							class=ui-blue><INPUT onclick=doSearch() value=搜索房屋
								type=submit name=search></LABEL>
						</LI>
					</UL>
				</DT>
				<DD>
					<UL>
						<LI class=first>价格</LI>
						<LI><SELECT name=price>
								<OPTION selected value="1">不限</OPTION>
								<OPTION value=0-100>100元以下</OPTION>
								<OPTION value=100-200>100元—200元</OPTION>
								<OPTION value=200-1000000>200元以上</OPTION>
						</SELECT></LI>
					</UL>
				</DD>
				<DD>
					<UL>
						<LI class=first>房屋位置</LI>
						<LI><SELECT id=street name=street_id>
								<OPTION selected value="1">不限</OPTION>
								<s:iterator value="street_idname">
									<option value=<s:property value="id"/>>
										<s:property value="name"/>
									</option>
								</s:iterator>
								
								
						</SELECT></LI>
					</UL>
				</DD>
				<DD>
					<UL>
						<LI class=first>房型</LI>
						<LI><SELECT name=type_id>
								<OPTION selected value="1">不限</OPTION>
								<s:iterator value="id_name">
									<option value=<s:property value="id"/>>
										<s:property value="name"/>
									</option>
									
								</s:iterator>
						</SELECT></LI>
					</UL>
				</DD>
				<DD>
					<UL>
						<LI class=first>面积</LI>
						<LI><SELECT name=floorage>
								<OPTION selected value="1">不限</OPTION>
								<OPTION value=0-40>40以下</OPTION>
								<OPTION value=40-500>40-500</OPTION>
								<OPTION value=500-1000000>500以上</OPTION>
						</SELECT></LI>
					</UL>
				</DD>
			</FORM>
		</DL>
	</DIV>
	<DIV class="main wrap">
		<TABLE class=house-list>
			<TBODY>
				<s:iterator value="houselist">
					<TR class=odd>
					<TD class=house-thumb><span><A href="details.htm"
							target="_blank"><img src="../images/thumb_house.gif"
								width="100" height="75" alt=""></a></span></TD>
					<TD>
						<DL>
							<DT>
								<A href="details.htm" target="_blank"><s:property value="title"/></A>
							</DT>
							<DD>
								<s:property value="Street.name"/>,<s:property value="floorage"/>平米<BR>联系方式：123456789
							</DD>
						</DL>
					</TD>
					<TD class=house-type><s:property value="Types.name"/></TD>
					<TD class=house-price><SPAN><s:property value="price"/></SPAN>元/月</TD>
				</TR>	
				</s:iterator>
				
				
				
			</TBODY>
		</TABLE>
		<DIV class=pager>
			<UL>
				<LI class=current><A href="#">首页</A></LI>
				<LI><A href="#">上一页</A></LI>
				<LI><A href="#">下一页</A></LI>
				<LI><A href="#">末页</A></LI>
			</UL>
			<SPAN class=total>1/2页</SPAN>
		</DIV>
	</DIV>
	<DIV id=footer class=wrap>
		<DL>
			<DT>嘀嗒租房 © 2018 河北地大 京ICP证1000001号</DT>
			<DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD>
		</DL>
	</DIV>
</body>
</html>
