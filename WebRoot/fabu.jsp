<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'fabu.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<LINK rel=stylesheet type=text/css href="../css/style.css">
</head>

<body>
	<DIV id=header class=wrap>
		<DIV id=logo>
			<IMG src="../images/logo.gif">
		</DIV>
	</DIV>
	<DIV id=regLogin class=wrap>
		<DIV class=dialog>
			<DL class=clearfix>
				<DT>新房屋信息发布</DT>
				<DD class=past>填写房屋信息</DD>
			</DL>
			<DIV class=box>
				<FORM id=add_action method=post name=add.action action="fabu.action">
					<DIV class=infos>
						<TABLE class=field>
							<TBODY>
								<TR>
									<TD class=field>标 题：</TD>
									<TD><INPUT id=add_action_title class=text type=text
										name=title></TD>
								</TR>
								<TR>
									<TD class=field>户 型：</TD>
									<TD>
									<SELECT class=text name=type_id>
												<OPTION
												selected value=1000>一室一厅
												</OPTION>
												
									</SELECT>
												</TD>
								</TR>
								<TR>
									<TD class=field>面 积：</TD>
									<TD><INPUT id=add_action_floorage class=text type=text
										name=floorage></TD>
								</TR>
								<TR>
									<TD class=field>价 格：</TD>
									<TD><INPUT id=add_action_price class=text type=text
										name=price></TD>
								</TR>
								<TR>
									<TD class=field>房产证日期：</TD>
									<TD><INPUT class=text type=text name=houseDate></TD>
								</TR>
								<TR>
									<TD class=field>位 置：</TD>
									<TD>区：<SELECT class=text name=district_id><OPTION
												selected value=1004>海淀区</OPTION></SELECT> 街：<SELECT class=text
										name=street_id><OPTION selected value=1001>中关村大街</OPTION></SELECT>
									</TD>
								</TR>
								<!-- 
						<tr>
							<td class="field">坐  标：</td>
							<td><input type="text" class="text" name="point" />
							</td>
						</tr>
						-->
								<!--  <tr>
							<td class="field">Y 坐  标：</td>
							<td><input type="text" class="text" name="point.y" /></td>
						</tr>-->
								<TR>
									<TD class=field>联系方式：</TD>
									<TD><INPUT id=add_action_contact class=text type=text
										name=contact></TD>
								</TR>
								<TR>
									<TD class=field>详细信息：</TD>
									<TD><TEXTAREA name=description></TEXTAREA></TD>
								</TR>
							</TBODY>
						</TABLE>
						<DIV class=buttons>
							<INPUT value=立即发布 type=submit>
						</DIV>
					</DIV>
				</FORM>
			</DIV>
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
