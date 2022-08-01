<%@page contentType="text/html; charset=utf-8"%>
<%@taglib uri="/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/tld/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/tld/c.tld" prefix="c"%>
<%@taglib uri="/tld/fn.tld" prefix="fn"%>
<<<<<<< HEAD
<%@ include file="/page/inc_header_script.jsp"%>

<style>
.login-userpic img {
	width: 100%;
	height: 100%;
	-webkit-border-radius: 50% !important;
	-moz-border-radius: 50% !important;
	border-radius: 50% !important;
	border: 2px solid #337ab7;
}
.student-dialog .modal-dialog {
	width: 900px;
}
=======


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
					document.forms[0].mode.value = 'index';
					document.forms[0].submit();	
				}
			    
			  })
	}
	
	function detail(){
		document.forms[0].mode.value = "user";
		document.forms[0].submit();
	}
</script>

<style type="text/css">

>>>>>>> bank
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
<<<<<<< HEAD
<style type="text/css">
<script src="https://example.com/fontawesome/v6.1.1/js/all.js" data-auto-replace-svg="nest"></script>

</style>
<nav class="navbar navbar-expand-lg navbar-light bg-light ">
  <!-- Container wrapper -->
  <div class="container">
    <!-- Navbar brand -->
    <!-- Search form -->
  
    <!-- Toggle button -->
    <button class="navbar-toggler" type="button" data-mdb-toggle="collapse"
      data-mdb-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
      aria-label="Toggle navigation">
      <i class="fas fa-bars"></i>
    </button>

    <!-- Collapsible wrapper -->
    <div class="collapse navbar-collapse" id="navbarSupportedContent" style="margin-right:30px;">
      <!-- Left links -->
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
        
        
        <li class="nav-item dropdown">
          <a
            class="nav-link dropdown-toggle d-flex align-items-center"
            href="#"
            id="navbarDropdownMenuLink"
            role="button"
            data-mdb-toggle="dropdown"
            aria-expanded="false"
          >
            <span class="">${SSUser.username}</span>
            <img
              src="https://mdbootstrap.com/img/Photos/Avatars/img%20(9).jpg"
              class="rounded-circle"
              height="30"
              alt=""
              loading="lazy"
            />
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <li><a class="dropdown-item" href="login.htm?mode=initProfile">My profile</a></li>
            <li><a class="dropdown-item" href="login.htm?mode=initChange">Change Password</a></li>
            <li><a class="dropdown-item" href="login.htm?mode=index">Logout</a></li>
          </ul>
        </li>
      </ul>
      <!-- Left links -->
    </div>
    <!-- Collapsible wrapper -->
  </div>
  <!-- Container wrapper -->
</nav>
	
<!--header end-->

=======
<header class="header">
	<div class="top-nav notification-row">
        <ul class="nav pull-right top-menu">
	      	<div class="top-nav notification-row">
				<!-- notificatoin dropdown start-->
		        <ul class="nav pull-right top-menu">
					<!-- user login dropdown start-->
					<li class="dropdown">
						<a href="#" onclick="detail()" style="z-index: 900;text-align: right;">
							<span class="username">${SSUser.firstname}</span>
						</a>
						<a href="#" onclick="detail()" style="font-size:15px;font-family: pridi;top: -16px;margin-bottom: -19px;z-index: 100;">
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
>>>>>>> bank
