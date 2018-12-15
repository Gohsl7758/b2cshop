# b2cshop
struts2+hibernate
发现的问题：
１.住房信息提交时只能提交不能更新。
２.查询住房信息时候查询不到相应的信息，如：
  查询属于住房１的街道１信息时不能查询到街道１的信息
解决方法：
１.在hibernate.hbm.xml中添加<property name="hibernate.current_session_context_class">thread</property>以开启事务
２.
  １.后期发现数据库数据发生了错误
  ２.禁止懒加载，查找到住房１的信息的同时查询街道１的信息。
待解决的问题：
  １．其他相应功能
  ２.前台页面的展示
  
  实现分页
  １.需要pageinfo实例
    １.jsp向action传递对象
        1 action要有这个对象和set get方法
        2 jsp可以直接调用这个对象和对象属性　如p.pageIndex
    ２.重定向传值
        <action name="login" class="cn.hgu.action.LoginAction">
			<result name="success" type="redirectAction">
				<param name="actionName">list</param>
				<param name="namespace">/</param>
				<param name="p.pageIndex">${pageindex}</param>
			</result>
			<result name="error">error.jsp</result>
		</action>
    
    <action name="list" class="cn.hgu.action.listAction">
			<result name="success">list.jsp</result>
		</action>
  2.<s:set name="" value="">
    set标签可以在jsp页面中设置值并用${}取出值
  3.${}
    ${ }这个是el表达式（表达式语言）
可以从上下文中得到值。
    <s:set name="pageNo" value="1"></s:set>
    	<LI><A href="list?p.pageIndex=${pageNo-1}">上一页</A></LI>
				<LI><A href="list?p.pageIndex=${pageNo+1}">下一页</A></LI>
    ${}还能从struts.xml配置文件中获取action中的值，要求action中有相应属性的set get 方法
    <result name="success" type="redirectAction">
				<param name="actionName">list</param>
				<param name="namespace">/</param>
				<param name="p.pageIndex">${pageindex}</param>
			</result>
