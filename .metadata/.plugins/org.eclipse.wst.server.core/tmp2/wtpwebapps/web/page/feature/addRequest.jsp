<!DOCTYPE html>
<%@page contentType="text/html; charset=utf-8"%>
<%@taglib uri="/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/tld/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/tld/c.tld" prefix="c"%>

<%@ include file="/page/inc_header_script.jsp"%>

<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>

<script language="javascript" type="text/javascript">

	function addss() {
// 		console.log("addssaddssaddssaddss");
// 		Swal.fire({
// 			  title: 'Are you sure?',
// 			  text: "You want to add request!",
// 			  icon: 'warning',
// 			  showCancelButton: true,
// 			  confirmButtonColor: '#3085d6',
// 			  cancelButtonColor: '#d33',
// 			  confirmButtonText: 'Yes'
// 			}).then((result) => {
// 				if(result.isConfirmed){
// 					document.forms[0].mode.value = "addRequest";
// 					document.forms[0].submit();
// 				}else{
// 					document.forms[0].mode.value = "request";
// 					document.forms[0].submit();
					
// 				}
			    
// 			  })
	}
	function back() {
		document.forms[0].mode.value = "getRequest";
		document.forms[0].submit();
	}
</script>

<body>
<html:form action="/index" styleId="eduForm">
<html:hidden property="mode"/>
<%-- 	<%@ include file="/page/inc_header.jsp"%> --%>
		<h2>รายงานปัญหา</h2>

         <div>
         <label>ชื่อโครงการ</label>
         <input type = "text" name = "project" />
         </div>
         
         <div>
         <label>ปัญหา</label>
         <input type = "text" name = "title" />
         </div>
         
        <div>
        <label>Select a file to upload: </label>
         <input type = "file" name = "file" size = "50" accept=".pdf, .png, .jpg, .jpeg"/>
        </div>
        
        <div>
        <label>ปัญหาที่เกิด</label>
         <input type = "text" name = "remark" />
        </div>
         
         <button>upload file</button>
         <button onclick="back()">back</button>

 </html>
</html:form>   

</body>
