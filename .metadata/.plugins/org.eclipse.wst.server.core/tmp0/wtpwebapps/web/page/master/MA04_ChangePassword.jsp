<!DOCTYPE html>
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

.backplane {
	/* Rectangle 4283 */
	position: absolute;
	width: 80%;
	height: 100%;
	left: 0px;
	top: 0px;
	background: linear-gradient(136.16deg, #042153 5.45%, #1DA1B0 60.18%);
}

.topbar {
	/* Rectangle 4284 */
	position: absolute;
	width: 85%;
	height: 100%;
	left: 15%;
	background: #f5f5f9;
}

.table {
	margin-top: 4%;
	border-collapse: separate;
	border-radius: 20px;
}

.inthebox {
	margin-left: 10%;
	margin-right: 10%;
	width: 80%;
	background: #e8ffff;
	top: 20%;
	border-radius: 15px;
}

/* Color of the links BEFORE scroll */
.navbar-scroll .nav-link, .navbar-scroll .navbar-toggler-icon,
	.navbar-scroll .navbar-brand {
	color: #262626;
}

/* Color of the navbar BEFORE scroll */
.navbar-scroll {
	background-color: #FFC017;
}

/* Color of the links AFTER scroll */
.navbar-scrolled .nav-link, .navbar-scrolled .navbar-toggler-icon,
	.navbar-scroll .navbar-brand {
	color: #262626;
}

/* Color of the navbar AFTER scroll */
.navbar-scrolled {
	background-color: #fff;
}

/* An optional height of the navbar AFTER scroll */
.navbar.navbar-scroll.navbar-scrolled {
	padding-top: auto;
	padding-bottom: auto;
}

.navbar-brand {
	font-size: unset;
	height: 3.5rem;
}
</style>
<style type="text/css">
</style>

<body>
	<script type="text/javascript">
		function submitEnter() {
			if (checkKeyEnter() == true)
				submitFormLogin();
		}
		function checkKeyEnter() {
			if (event.keyCode == 13)
				return true;
		}

		function submitFormInit(mode) {
			document.loginForm.mode.value = mode;
			document.loginForm.submit();

		}
		function submitFormEdit(id, mode) {
			document.loginForm.mode.value = mode;
			document.loginForm.id.value = id;
			document.loginForm.submit();
		}
		function submitFormRemove(id) {
			bootbox.dialog({
				title : 'ยืนยันการลบข้อมูล',
				message : 'คุณต้องการยืนยันการลบข้อมูลนี้ใช่หรือไม่',
				buttons : {
					Cancel : {
						label : 'ยกเลิก',
						className : "btn-default",
						callback : function() {
						}
					},
					success : {
						label : 'ตกลง',
						className : "btn-danger",
						callback : function() {
							document.loginForm.mode.value = 'delete';
							document.loginForm.id.value = id;
							document.loginForm.submit();
						}
					}
				}
			});
		}
	</script>

	<%@ include file="/page/inc_menu.jsp"%>

	<div class="topbar">
		<!-- Navbar -->
		<%@ include file="/page/inc_header.jsp"%>

		<!-- Navbar -->

		<div class="inthebox">
		


		</div>



	</div>


</body>


<script src="js/jquery.min.js"></script>
<script src="js/popper.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>

</html>
