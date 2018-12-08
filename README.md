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
