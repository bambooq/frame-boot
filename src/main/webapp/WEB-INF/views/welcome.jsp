<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@page contentType="text/html; charset=utf-8" %>
<%
	String path = request.getContextPath();
%>
<html>
<head>
<meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no"/>
<meta name="keywords" content=""/>
<meta name="description" content=""/>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta http-equiv="pragma" content="no-cache"/> 
<meta http-equiv="cache-control" content="no-cache"/> 
<meta http-equiv="expires" content="0"/>
	<meta content="text/html;charset=UTF-8"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<link href="<%=path%>/resources/bootstrap/css/bootstrap.css" rel="stylesheet"/>
	<link href="<%=path%>/resources/bootstrap/css/bootstrap-theme.css" rel="stylesheet"/>
</head>
<body>
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title">访问model</h3>
    </div>
    <div class="panel-body">
        <span></span>
    </div>
</div>

<div>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">列表</h3>
        </div>
        <div class="panel-body">
            <ul class="list-group">
                <li class="list-group-item">
                    <span></span>
                    <span></span>
                    <button class="btn">获得名字</button>
                </li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>