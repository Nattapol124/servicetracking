<!DOCTYPE html>
<%@page contentType="text/html; charset=utf-8"%>
<%@taglib uri="/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/tld/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/tld/c.tld" prefix="c"%>
<%@taglib uri="/tld/fn.tld" prefix="fn"%>

<%@ include file="/page/inc_header_script.jsp"%>


<body>
<script type="text/javascript">
	function submitId(mode) {
		document.forms[0].mode.value = mode;
	    document.forms[0].submit();
	}
	
	function add(){
		document.forms[0].mode.value = "requestBtn";
		document.forms[0].submit();
	}
	
</script>

<style type="text/css">
h2{
	margin-top:50px;
}

.center {
	allign:center;
}

tr:hover .hover{
	background-color:black;
}
	
</style>
	<html:form action="/index" styleId="eduForm">
	<html:hidden property="mode"/>
	<section class="ftco-section">
		<%@ include file="/page/inc_header.jsp"%>
		<div class="container">
			<div class="row justify-content-center">
				<div class="text-center col-lg-12">
					<button onclick="add()">รายงานปัญหา</button>
					<h2>ตารางการส่งคำร้องเรียน</h2>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="table-wrap">
					<logic:present name="indexForm" property="resultList">
					<logic:notEmpty name="indexForm" property="resultList">
						<table class="table table-striped">
						  <thead>
						    <tr>
						      <th>NO.</th>
						      <th class = "text-center">ผู้แจ้งเรื่อง</th>
						      <th class = "text-center">ผู้รับผิดชอบ</th>
						      <th class = "text-center">สถานะ</th>
<!-- 						      <th>ประเภท</th> -->
<!-- 						      <th>โครงการ</th> -->
<!-- 						      <th>หัวข้อ</th> -->
<!-- 						      <th>รายละเอียด</th> -->
<!-- 						      <th>วันที่ส่งคำร้อง</th> -->
<!-- 						      <th>ไฟล์</th> -->
						    </tr>
						  </thead>
						  <tbody>
						  	
								<logic:iterate id="item" name="indexForm" property="resultList" indexId="index">
								<tr class="hover">
								<td><%= index+1 %></td>
								<td align="center">${item.user.nickname }</td>
								<td align="center">${item.userproc.id }</td>
								<c:if test="${item.request_status.id eq '1' }">
									<td align="center"><a href="#collapseExample" class="btn btn-warning" data-toggle="collapse">${item.request_status.name }</a></td>
								</c:if>
								<p class="collapse" id="collapseExample">
								  
								    damn
								  </p>
								
								
								<c:if test="${item.request_status.id eq '2' }">
									<td align="center"><a href="#" class="btn btn-warning">${item.request_status.name }</a></td>
								</c:if>
								
								<c:if test="${item.request_status.id eq '3' }">
									<td align="center"><a href="#" class="btn btn-warning">${item.request_status.name }</a></td>
								</c:if>
								
								<c:if test="${item.request_status.id eq '4' }">
									<td align="center"><a href="#" class="btn btn-success">${item.request_status.name }</a></td>
								</c:if>
								
								<c:if test="${item.request_status.id eq '5' }">
									<td align="center"><a href="#" class="btn btn-danger">${item.request_status.name }</a></td>
								</c:if>
								
								
<%-- 								<td>${item.request_type.name }</td> --%>
<%-- 								<td>${item.project.name }</td> --%>
<%-- 								<td>${item.title }</td> --%>
<%-- 								<td>${item.remark }</td> --%>
<%-- 								<td>${item.date }</td> --%>
<%-- 								<td>${item.file }</td> --%>
								</tr>
								</logic:iterate>
						    	
						  </tbody>
						</table>
					</logic:notEmpty>
					</logic:present>
					</div>
				</div>
			</div>
		</div>
	</section>
	

	<script src="js/jquery.min.js"></script>
  <script src="js/popper.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/main.js"></script>

	
	</html>
	</html:form>
</body>
