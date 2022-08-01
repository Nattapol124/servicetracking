<%@page contentType="text/html; charset=utf-8"%>
<%@taglib uri="/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/tld/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/tld/c.tld" prefix="c"%>
<%@taglib uri="/tld/fn.tld" prefix="fn"%>


<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>

<script language="javascript" type="text/javascript">

	function logout() {
		Swal.fire({
			  title: 'Are you sure?',
			  text: "You want to logout!",
			  icon: 'warning',
			  showCancelButton: true,
			  confirmButtonColor: '#3085d6',
			  cancelButtonColor: '#d33',
			  confirmButtonText: 'Yes'
			}).then((result) => {
				if(result.isConfirmed){
					document.forms[0].action = 'index.htm?mode=index';
					document.forms[0].submit();	
				}
			    
			  })
	}
</script>

<style type="text/css">

.header {
	position: fixed;
	left: 0;
	right: 0;
	z-index: 1002;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.176) !important;
	background-color: #00afda;
	background: -webkit-linear-gradient(left, #00afda, #1b5dab);
	background: -o-linear-gradient(right, #00afda, #1b5dab);
	background: -moz-linear-gradient(right, #00afda, #1b5dab);
	background: linear-gradient(to right, #00afda, #1b5dab);
}
</style>
<header class="header">
	<div class="top-nav notification-row">
        <ul class="nav pull-right top-menu">
	      	<div class="top-nav notification-row">
				<!-- notificatoin dropdown start-->
		        <ul class="nav pull-right top-menu">
					<!-- user login dropdown start-->
					<li class="dropdown">
						<a href="#" style="z-index: 900;text-align: right;">
							<span class="username">${SSUser.firstname}</span>
						</a>
						<a href="#" style="font-size:15px;font-family: pridi;top: -16px;margin-bottom: -19px;z-index: 100;">
							${SSUser.userPosition.name}
						</a>
					</li>
					<!-- logout-->
			      	<li class="dropdown topbar-user pull-right">
						<a href="#" onclick="logout()" style="color: #fff;margin-top: 10px;" title="ออกจากระบบ">
<!-- 							<i class="fa fa-sign-out" style="font-size: 20px;"></i> -->
							<span style="font-size:16px;font-family: pridi;">ออกจากระบบ</span>
						</a>
					</li>
		          	<!-- logout-->
		          	
				</ul>
			<!-- notificatoin dropdown end-->
			</div>
          	
		</ul>
	</div>
</header>
<%@ include file="/page/inc_menu.jsp"%>
