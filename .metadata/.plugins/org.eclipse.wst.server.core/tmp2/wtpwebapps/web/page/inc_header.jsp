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
	      	<li class="dropdown topbar-user pull-right">
				<a href="#" style="color: #fff;margin-top: 10px;" style="width:100%;" onclick="logout()">ออกจากระบบ</button>
			</li>
          	
		</ul>
	</div>
</header>
<%@ include file="/page/inc_menu.jsp"%>
