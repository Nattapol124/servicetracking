<%@page contentType="text/html; charset=utf-8"%>
<%@taglib uri="/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/tld/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/tld/c.tld" prefix="c"%>
<%@taglib uri="/tld/fn.tld" prefix="fn"%>

<!--sidebar start-->
<aside>
	<div id="sidebar" class="nav-collapse">
		<!-- sidebar menu start-->
		<ul class="sidebar-menu">
			<%-- <li>
				<a href="master.htm?mode=init">
					<img class="imgFrame" align="center" style="height: 24px;width: 24px;" src="${pageContext.request.contextPath}/ui/img/icons/i_home_blue_64.png">&nbsp;
					<span>หน้าหลัก</span>
				</a>
			</li> --%>
			<li>
				<a style="width: 24px;height: 24px;" class="imgFrame" href="index.htm?mode=home">
					<span>ข้อมูลคำถาม</span>
				</a>
			</li>
			<li>
				<a style="width: 24px;height: 24px;" class="imgFrame" href="index.htm?mode=something">
					<span>something</span>
				</a>
			</li>
		</ul>
   		<!-- sidebar menu end -->
		
	</div>
</aside>
