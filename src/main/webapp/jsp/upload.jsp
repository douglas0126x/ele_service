<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>大象云服务管理</title>
</head>
<body>

<%-- ${pageContext.request.contextPath} --%>

<form action="${pageContext.request.contextPath}/upload/file_springmvc" method="post" enctype="multipart/form-data">
        <div align="center">
        
            <fieldset style="width:80%">
                <legend>上传文件</legend><br/>
                    <div align="left">上传文件1</div>
                    <div align="left">
                        <input type="file" name="file1"/>
                    </div>
                    <div align="left">上传文件2</div>
                    <div align="left">
                        <input type="file" name="file2"/>
                    </div>
                    <div>
                        <div align='left'>上传文件说明1</div>
                        <div align='left'><input type="text" name="description1"/></div>
                    </div>
                    <div>
                        <div align='left'>上传文件说明2</div>
                        <div align='left'><input type="text" name="description2"/></div>
                    </div>
                    <div>
                        <div align='left'>
                            <input type='submit' value="上传文件"/>
                        </div>
                    </div>
            </fieldset>
        </div>
    </form>



</body>
</html>