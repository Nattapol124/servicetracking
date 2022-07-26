<%@page contentType="text/html; charset=utf-8"%>
<%@taglib uri="/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/tld/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/tld/c.tld" prefix="c"%>
<%@taglib uri="/tld/fn.tld" prefix="fn"%>
<%@ include file="/page/inc_header_script.jsp"%>
<style type="text/css">
html, body {
	height: 100%;
	width: 100%;
}

n	
	.backplane {
	/* Rectangle 4283 */
	position: absolute;
	width: 80%;
	height: 100%;
	left: 0px;
	top: 0px;
	background: linear-gradient(136.16deg, #042153 5.45%, #1DA1B0 60.18%);
}
</style>
<div class="backplane">
	<!--sidebar start-->
	<div class="d-flex flex-column flex-shrink-0 p-3 text-white bg-faded"
		style="height: 100%;">
		<a href="#"
			class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
			<svg class="bi me-2" width="40" height="32">
				<use xlink:href="#bootstrap"></use></svg> <img
			src="https://www.gtt2004.com/img/GTT_WHITE.png" width=17%;></img>
		</a>
		<hr>
		<ul class="nav nav-pills flex-column mb-auto">
			<li class="nav-item"><a href="login.htm?mode=login"
				class="nav-link active" aria-current="page"> <svg
						xmlns="http://www.w3.org/2000/svg" width="20" height="20"
						fill="currentColor" class="bi bi-house" viewBox="1 1 16 16">
		  <path fill-rule="evenodd"
							d="M2 13.5V7h1v6.5a.5.5 0 0 0 .5.5h9a.5.5 0 0 0 .5-.5V7h1v6.5a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 13.5zm11-11V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z" />
		  <path fill-rule="evenodd"
							d="M7.293 1.5a1 1 0 0 1 1.414 0l6.647 6.646a.5.5 0 0 1-.708.708L8 2.207 1.354 8.854a.5.5 0 1 1-.708-.708L7.293 1.5z" />
		</svg> Home
			</a></li>
			<li><a href="login.htm?mode=initAddUser"
				class="nav-link text-white"> <svg class="bi me-2" width="16"
						height="16">
						<use xlink:href="#speedometer2"></use></svg> Dashboard
			</a></li>
			<li><a href="#" class="nav-link text-white"> <svg
						class="bi me-2" width="16" height="16">
						<use xlink:href="#table"></use></svg> Orders
			</a></li>

		</ul>
		<hr>
		<div class="dropdown">
			<a href="login.htm?mode=index" class="nav-link text-white">LOGOUT</a>
		</div>
	</div>
</div>