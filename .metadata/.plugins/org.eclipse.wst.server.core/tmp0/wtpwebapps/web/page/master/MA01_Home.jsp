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
tr td:first-child {
  position:relative;
}

a:before {
  content: '';
  position:absolute;
  left: 0;
  top: 0;
  bottom: 0;
  display: block;
  width: 400px;
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
		function searchData() {
			var input, filter, table, tr, td, i, txtValue;
			input = document.getElementById("search");
			filter = input.value.toUpperCase();
			table = document.getElementById("userData");
			tr = table.getElementsByTagName("tr");

			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td")[1];
				if (td) {
					txtValue = td.textContent || td.innerText;
					if (txtValue.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					} else {
						tr[i].style.display = "none";
					}
				}
			}
		}
		
		
	</script>

	<%@ include file="/page/inc_menu.jsp"%>

	<div class="topbar">
		<!-- Navbar -->
		<%@ include file="/page/inc_header.jsp"%>

		<!-- Navbar -->

		<div class="inthebox">

			<html:form action="/login" styleId="eduForm"
				styleClass="form-horizontal form-validate">
				<html:hidden property="mode" />
				<html:hidden property="id" />
				<div class="form-group">
					<div class="col-sm-offset-3 col-sm-8">
						<button class="btn btn-primary" type="button"
							onclick="submitFormInit('showtable')">
							<i class="fa fa-users" aria-hidden="true"></i>
							&nbsp;ดูรายชื่อบัญชีทั้งหมด
						</button>
						<button class="btn btn-primary" type="button"
							onclick="submitFormInit('showProject')">
							<i class="fa fa-users" aria-hidden="true"></i>
							&nbsp;ดูโปรเจคทั้งหมด
						</button>
						<input type="text" id="search" onkeyup="searchData()"
							placeholder="Search for names..">
					</div>
				</div>



				<logic:present name="loginForm" property="resultList">
					<logic:notEmpty name="loginForm" property="resultList">
						<table id="userData" cellspacing="0" width="100%"
							class="table align-middle mb-0">
							<a>
								<thead>
									<tr>
										<th class="text-center">ลำดับ</th>
										<th class="text-center">ชื่อผู้ใช้</th>
										<th class="text-center">ชื่อจริง</th>
										<th class="text-center">นามสกุล</th>
										<th class="text-center">เมล</th>
										<th class="text-center">เบอร์</th>
									</tr>
								</thead>
							<tbody>
								<logic:iterate id="item" name="loginForm" property="resultList"
									indexId="index">
									<tr>
										<td align="center"><%=index + 1%></td>
										<td align="center"><a href="login.htm?mode=initChangeUserData">${item.username}</a></td>
										<td align="center">${item.user_firstname}</td>
										<td align="center">${item.user_lastname}</td>
										<td align="center">${item.user_email}</td>
										<td align="center">${item.user_phone}</td>
									</tr>
								</logic:iterate>

							</tbody>
						</table>
					</logic:notEmpty>
				</logic:present>

				<logic:present name="loginForm" property="resultProjectList">
					<logic:notEmpty name="loginForm" property="resultProjectList">
						<table id="userData" cellspacing="0" width="100%"
							class="table align-middle mb-0">
							<a>
								<thead>
									<tr>
										<th class="text-center">รหัสโปรเจค</th>
										<th class="text-center">ชื่อโปรเจค</th>
										<th class="text-center">รหัสบริษัท</th>
										<th class="text-center">ชื่อบริษัท</th>
									</tr>
								</thead>
								<tbody>
									<logic:iterate id="item" name="loginForm"
										property="resultProjectList" indexId="index">
										<tr>
											<td align="center">${item.id}</td>
											<td align="center">${item.project_name}</td>
											<td align="center">${item.id_customer.id}</td>
											<td align="center">${item.id_customer.company_name}</td>
										</tr>
									</logic:iterate>

								</tbody>
						</table>
					</logic:notEmpty>
				</logic:present>


			</html:form>
		</div>
</body>


<script src="js/jquery.min.js"></script>
<script src="js/popper.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>

</html>
