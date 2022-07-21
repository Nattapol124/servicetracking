<!DOCTYPE html>
<%@page contentType="text/html; charset=utf-8"%>
<%@taglib uri="/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/tld/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/tld/c.tld" prefix="c"%>

<%@ include file="/page/inc_header_script.jsp"%>



<body>

<script language="javascript" type="text/javascript">
	$(document).ready(function() {
		
		jQuery.ajaxSetup({
			  beforeSend: function() {
			     $('#loader').show();
			  },
			  complete: function(){
			     $('#loader').hide();
			  },
			  success: function() {}
		});
	
		$("#eduForm").validate({
			rules: {
				un: "required",
				pw: "required",
			},
			highlight: function(element) {
	            $(element).closest('.form-control').addClass('has-error-input');
	        },
	        unhighlight: function(element) {
	            $(element).closest('.form-control').removeClass('has-error-input');
	        },
	        errorElement: 'span',
	        errorClass: 'has-error-block',
	        errorPlacement: function(error, element) {},
	      	submitHandler: function(form) {
	      		document.forms[0].mode.value = 'login';
		   	 	document.forms[0].submit();
			   	
			}
		});
		
// 	i	$('#un').focus();
	});
	
	function submitEnter() {
		if (checkKeyEnter() == true) submitFormLogin();
	}
	
	function checkKeyEnter(){
		   if(event.keyCode==13) return true;
		}
	

	function submitFormLogin() {
		$("#eduForm").submit();
		
// 		document.forms[0].action = 'index.htm?mode=login';
// 		 	document.forms[0].submit();
	}
	
	
	
</script>
<style type="text/css">

	
	img{
		left : 100px;
		position: absolute;
		top: 150px;
	}
	html,body{
	    position: relative;
	    height: 100%;
	}
	body {
		background: linear-gradient(45.3deg, #40408D 0%, #548FC5 96.5%), linear-gradient(0deg, #40408D, #40408D), linear-gradient(0deg, #CCCCFE, #CCCCFE), linear-gradient(0deg, #302988, #302988), linear-gradient(0deg, #232378, #232378), linear-gradient(180deg, rgba(197, 84, 146, 0.5) 2.31%, rgba(77, 33, 150, 0.536563) 41.85%, rgba(0, 0, 153, 0.56) 83.08%);
		
	}
	label{
		color: #fff	; /* #ff6e7b */
		font-family: pridi, pridien;
		font-weight: bold;
		position: absolute;
		left: 110px;
		top : 450px;
		font-sizet : 2vw;
		
	}
		
	#main-login {
		position: absolute;
		right:20px;
		min-width: 400px;
		min-height: 350px; 
		width: 50%;
		height: 25%;
	    margin: 40px auto 20px;
	    background-color: #ffffff;
	    padding: 60px 0px 350px 0px;
	    -webkit-border-radius: 8px;
		-moz-border-radius: 8px;
		-ms-user-select: none;
		border-radius: 8px;
		box-shadow: 0 0 10px rgba(0, 0, 0, 0.3) !important;
		
	}
	.login-title {
		color: #000; /* #ff6e7b */
		font-family: pridi, pridien;
		font-size: 1.8em;
		font-weight: bold;
	}
	.login-box {
		margin-top: 25px;

	}
	
	.login-box a {
		color: #999;
		text-decoration: underline;
	}
	.login-box a:hover, .login-box a:focus {
		color: '#f57c00';
		text-decoration: underline;
	}

</style>

<html:form action="/index" styleId="eduForm">
<html:hidden property="mode"/>
	
	<div class="container">
		<div class="row" style="margin-top:10px">
			<div id="main-login">
				<div class="col-sm-12" style="min-width: 300px;">
					<div style="text-align: center;margin-top: 50px;">
					</div>
					<div style="text-align: center;margin-top: 5px;">

						<div class="login-box">
							
							<div class="form-group">
								<div class="col-sm-10" style="margin: 0 auto;float: none;">
									<html:text property="un" maxlength="75" onkeypress="submitEnter();" styleClass="form-control" styleId="un" placeHolder="ชื่อผู้ใช้งาน" />
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-10" style="margin: 0 auto;float: none;">
									<html:password property="pw" maxlength="75" onkeypress="submitEnter();" styleClass="form-control" styleId="pw" placeHolder="รหัสผ่าน"/>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-10" style="margin: 0 auto;float: none;">
									<button type="button" class="btn btn-blue btn-sm" style="width:100%;" onclick="submitFormLogin();">เข้าสู่ระบบ</button>
								</div>
							</div>
							
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</html:form>

</body>
</html>