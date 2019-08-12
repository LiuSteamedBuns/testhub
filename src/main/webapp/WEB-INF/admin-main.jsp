<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.getContextPath()}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<link
	href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<style type="text/css">
.s_color {
	color: #FFFFFF;
}

#upload {
				margin-top: 8px;
				}
</style>
</head>
<body>
				<nav class="navbar navbar-inverse">
												  <div class="container-fluid">
																			  <div id="navbar" class="navbar-collapse collapse">

																															   <div class="navbar-header">
				<span class="navbar-brand">${username}</span>
			</div>
			<ul class="nav navbar-nav navbar-left">
				<li><a class="a_left s_color"
					href="${pageContext.request.getContextPath()}/outLogin">退出登录</a></li>
			</ul>
			<!--   <ul class="nav navbar-nav navbar-right">
			<li><button id="upload" class="a_right  btn-danger">上传文件</button> </li>
          </ul>
          <form class="navbar-form navbar-right s_color" id="uploadForm" enctype="multipart/form-data">
          <input id="file" type="file" name="file" /> 
          </form> -->
		</div>
	</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-xs-6 col-md-offset-6">
				<button class="btn-default list_btn_all" onclick="list_btn_all()">查看</button>
				&nbsp;&nbsp;
				<button class=" btn-default" onclick="findAdminWithoutUsed()">未使用</button>
				<button class=" btn-default" onclick="findAdminWithUsed()">已使用</button>
				&nbsp;&nbsp;
				<%--  			<button class="btn-info btn-warming"><a href="${pageContext.request.getContextPath()}/excel_downAdmin">导出</a></button> 	--%>
				<button class="btn-danger btn-default" id="phone_del_all_btn">删除</button>
				&nbsp;&nbsp;
				<button class="btn-info btn-default" onclick="updateToUsed()">标记已使用</button>
				<button class="btn-info btn-default" onclick="updateToNotUsed()">标记未使用</button>
				<%-- 		<button class="btn-danger btn-default"><a href="${pageContext.request.getContextPath()}/emptyUserDataById">清空数据</a></button> --%>
			</div>
		</div>
		<br>

	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<select>
					<option value=""></option>
					<option value="2">centos</option>
					<option value="3">debain</option>
				</select>
				<ul class="nav nav-sidebar navli">
					<form class="navbar-form navbar-left s_color" id="uploadForm"
						enctype="multipart/form-data">
						<input id="file" type="file" name="file" />
					</form>
					<br>
					<br>
                    <select>
                        <option value=""></option>
                        <option value="tab_phone_1">表格一</option>
                        <option value="tab_phone_2">表格二</option>
                        <option value="tab_phone_3">表格三</option>
                        <option value="tab_phone_4">表格四</option>
                        <option value="tab_phone_5">表格五</option>
                        <option value="tab_phone_6">表格六</option>
                        <option value="tab_phone_7">表格七</option>
                        <option value="tab_phone_8">表格八</option>
                        <option value="tab_phone_9">表格九</option>
                    </select>

                    <li><input type="radio" name="tablename" >表格一</li>
					<li><input type="radio" name="tablename" value="tab_phone_2">表格二</li>
					<li><input type="radio" name="tablename" value="tab_phone_3">表格三</li>
					<li><input type="radio" name="tablename" value="tab_phone_4">表格四</li>
					<li><input type="radio" name="tablename" value="tab_phone_5">表格五</li>
					<li><input type="radio" name="tablename" value="tab_phone_6">表格六</li>
					<li><input type="radio" name="tablename" value="tab_phone_7">表格七</li>
					<li><input type="radio" name="tablename" value="tab_phone_8">表格八</li>
					<li><input type="radio" name="tablename" value="tab_phone_9">表格九</li>
					<li><input type="radio" name="tablename" value="tab_phone_10">表格十</li>
					<li><button id="upload" class="a_right s_color btn-danger">上传文件</button>
					</li>

				</ul>
			</div>
			<div class="col-md-5 col-md-offset-2 main">

				<div class="table-responsive">

					<table class="table table-striped text-center " id="phone_table">
						<thead>
							<tr>
								<th class="info text-center"><input type="checkbox"
									id="check_all"></th>
								<th class="info text-center">序号</th>
								<th class="info text-center">电话号码</th>
								<th class="info text-center">状态</th>
								<th class="info text-center">操作</th>
							</tr>
						</thead>
						<tbody></tbody>
					</table>
				</div>
				<div class="row col-md-offset-3" id="page_info_area"></div>
				<div class="row col-md-offset-2" id="page_nav_area"></div>
			</div>
		</div>
	</div>

	<div class="row" id="page_info_area"></div>
	<div class="row col-md-offset-3" id="page_nav_area"></div>
	</div>


	<script type="text/javascript">
		var currentPage;
		$("#upload").click(function() {
			var formData = new FormData($('#uploadForm')[0]);
			$.ajax({
				type : 'post',
				url : "${pageContext.request.getContextPath()}/upload_excel",
				data : formData,
				cache : false,
				processData : false,
				contentType : false,
				success : (function(result) {
					alert(result.msg);
				}),
				error : (function() {
					alert("上传失败");
				})
			});
		})

	 
		
		
		
		
		
		
		
		
		function list_btn_all() {
			/* $.ajax({
				url:"${pageContext.request.getContextPath()}/teleList.action",
				data:"pn=1",
				type:"GET",
				success:function(result){
					console.log(result);
					//1解析并显示数据
					build_phone_table(result);
					//2.显示分页信息
					build_page_info(result);
					//3.显示分页条数据
					build_page_nav(result);
				}	
			}); */
			to_page(1);
		}

		function to_page(pn) {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/teleList",
				data : "pn=" + pn,
				type : "GET",
				success : function(result) {
					//1解析并显示数据
					build_phone_table(result);
					//2.显示分页信息
					build_page_info(result);
					//3.显示分页条数据
					build_page_nav(result);
				}
			});
		}

		function to_pageNotUsed(pn) {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/telListNotUsed",
				data : "pn=" + pn,
				type : "GET",
				success : function(result) {
					//1解析并显示数据
					build_phone_table(result);
					//2.显示分页信息
					build_page_info(result);
					//3.显示分页条数据
					build_page_navNotUsed(result);
				}
			});
		}

                    function to_pageUsed(pn) {
                        $.ajax({
                            url : "${pageContext.request.getContextPath()}/telListUsed",
                            data : "pn=" + pn,
                            type : "GET",
                            success : function(result) {
                                //1解析并显示数据
                                build_phone_table(result);
                                //2.显示分页信息
                                build_page_info(result);
                                //3.显示分页条数据
                                build_page_navUsed(result);
				}
			});
		}

		//循环数据表格
		function build_phone_table(result) {
			//phone_table tbody
			$("#phone_table tbody").empty();
			var phonelist = result.extend.PageInfo.list;
			$
					.each(
							phonelist,
                                function(index, item) {
                                    var checkboxTd = $("<td><input type='checkbox' class='check_item'></td>");
                                    var pidTd = $("<td></td>").append(item.pid);
                                    var phoneTd = $("<td></td>").append(
                                        item.telephone);
                                    var statusTd = $("<td></td>").append(
                                        item.status_id == 0 ? "未使用" : "已使用");
                                    /* var editBtn = $("<button></button>").addClass("btn btn-primary brn-sm")
                                    .append($("<span></span>").addClass("glyphicon glyphicon-pencil").append("编辑")); */
                                    var delBtn = $("<button></button>")
										.addClass(
												"btn btn-danger brn-sm del_btn")
										.append(
												$("<span></span>")
														.addClass(
																"glyphicon glyphicon-trash")
														.append("删除"));
								delBtn.attr("del-pid", item.pid);
								/* var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn); */
								$("<tr></tr>").append(checkboxTd).append(pidTd)
										.append(phoneTd).append(statusTd)
										.append(delBtn).appendTo(
												"#phone_table tbody");
							});
		}

		//构建分页数据
		function build_page_info(result) {
			//page_info_area
			$("#page_info_area").empty();
			$("#page_info_area").append(
					"当前" + result.extend.PageInfo.pageNum + "页,总"
							+ result.extend.PageInfo.pages + "页数,总"
							+ result.extend.PageInfo.total + "条记录").addClass(
					"col-md-offset-3");
			currentPage = result.extend.PageInfo.pageNum;
		}
		/*      -------------------------------------------- 查询所有分页-------------------------------------------------          */
		//构建分页条
		function build_page_nav(result) {
			//page_nav_area
			$("#page_nav_area").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.PageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				firstPageLi.click(function() {
					to_page(1);
				});
				prePageLi.click(function() {
					to_page(result.extend.PageInfo.pageNum - 1);
				});
			}
			ul.append(firstPageLi).append(prePageLi);
			$.each(result.extend.PageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.PageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				numLi.click(function() {
					to_page(item);
				});
				ul.append(numLi);
			});

			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
			if (result.extend.PageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				nextPageLi.click(function() {
					to_page(result.extend.PageInfo.pageNum + 1);
				})
				lastPageLi.click(function() {
					to_page(result.extend.PageInfo.pages);
				})
			}
			ul.append(nextPageLi).append(lastPageLi);
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav_area");
		}

		/*      -------------------------------------------- 查询所有分页-------------------------------------------------          */

		/*      --------------------------未使用--------------- 查询所有分页----------------未使用-------------------------------          */

		//构建未使用的分页条
		function build_page_navNotUsed(result) {
			//page_nav_area
			$("#page_nav_area").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.PageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				firstPageLi.click(function() {
					to_pageNotUsed(1);
				});
				prePageLi.click(function() {
					to_pageNotUsed(result.extend.PageInfo.pageNum - 1);
				});
			}
			ul.append(firstPageLi).append(prePageLi);
			$.each(result.extend.PageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.PageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				numLi.click(function() {
					to_pageNotUsed(item);
				});
				ul.append(numLi);
			});

			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
			if (result.extend.PageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				nextPageLi.click(function() {
					to_pageNotUsed(result.extend.PageInfo.pageNum + 1);
				})
				lastPageLi.click(function() {
					to_pageNotUsed(result.extend.PageInfo.pages);
				})
			}
			ul.append(nextPageLi).append(lastPageLi);
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav_area");
		}
		/*      -------------------------未使用--------------- 查询所有分页----------------未使用--------------------------          */

		/*      ----------------------------已使用--------------- 查询所有分页---------------已使用----------------------------          */
		//构建已使用的分页条
		function build_page_navUsed(result) {
			//page_nav_area
			$("#page_nav_area").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.PageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				firstPageLi.click(function() {
					to_pageUsed(1);
				});
				prePageLi.click(function() {
					to_pageUsed(result.extend.PageInfo.pageNum - 1);
				});
			}
			ul.append(firstPageLi).append(prePageLi);
			$.each(result.extend.PageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.PageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				numLi.click(function() {
					to_pageUsed(item);
				});
				ul.append(numLi);
			});

			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
			if (result.extend.PageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				nextPageLi.click(function() {
					to_pageUsed(result.extend.PageInfo.pageNum + 1);
				})
				lastPageLi.click(function() {
					to_pageUsed(result.extend.PageInfo.pages);
				})
			}
			ul.append(nextPageLi).append(lastPageLi);
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav_area");
		}

		/*      ---------------------------已使用--------------- 查询所有分页----------------已使用-------------------------          */

		$(document)
				.on(
						"click",
						".del_btn",
						function() {
							var phoneNum = $(this).parents("tr").find(
									"td:eq(2)").text();
							var pid = $(this).attr("del-pid");
							//	alert($(this).parents("tr").find("td:eq(0)").text());
							if (confirm("确认删除【" + phoneNum + "】吗?")) {
								$
										.ajax({
											url : "${pageContext.request.getContextPath()}/telePhone/"
													+ pid,
											type : "DELETE",
											succuss : function(result) {
												alert(result.msg);
												
											}
										});
							}
						});

		$("#check_all").click(function() {
			$(".check_item").prop("checked", $(this).prop("checked"));
		});
		$(document)
				.on(
						"click",
						".check_item",
						function() {
							var flag = $(".check_item:checked").length == $(".check_item").length;
							$("#check_all").prop("checked", flag);
						});

		$("#phone_del_all_btn")
				.click(
						function() {
							var phoneNum = "";
							var pids = "";
							$.each($(".check_item:checked"), function() {
								phoneNum += $(this).parents("tr").find(
										"td:eq(2)").text()
										+ ",";
								pids += $(this).parents("tr").find("td:eq(1)")
										.text()
										+ "-";
							});
							phoneNum = phoneNum.substring(0,
									phoneNum.length - 1);
							pids = pids.substring(0, pids.length - 1);
							if (confirm("确认删除【" + phoneNum + "】吗?")) {
								$.ajax({
											url : "${pageContext.request.getContextPath()}/telePhone/"
													+ pids,
									type : "DELETE",
											success : function(result) {
												alert(result.msg);
												/* to_page(currentPage); */
											}
										});
							}
						});

		function updateToUsed() {
			var phoneNum = "";
			var pids = "";
			$.each($(".check_item:checked"), function() {
				phoneNum += $(this).parents("tr").find("td:eq(2)").text();
				pids += $(this).parents("tr").find("td:eq(1)").text() + "-";
			});
			phoneNum = phoneNum.substring(0, phoneNum.length - 1);
			pids = pids.substring(0, pids.length - 1);
			if (confirm("确认标记【" + phoneNum + "】为已使用吗?" + "Pid" + pids)) {
				$.ajax({
							url : "${pageContext.request.getContextPath()}/updateToUsed",
							async : true,
							datatype : "json",
							data : {
								"pids" : pids
							},
							type : "POST",
							success : function(result) {
								alert(result.msg);
							}
						});
			}
		}

		function updateToNotUsed() {
			var phoneNum = "";
			var pids = "";
			$.each($(".check_item:checked"), function() {
				phoneNum += $(this).parents("tr").find("td:eq(2)").text();
				pids += $(this).parents("tr").find("td:eq(1)").text() + "-";
			});
			phoneNum = phoneNum.substring(0, phoneNum.length - 1);
			pids = pids.substring(0, pids.length - 1);
			if (confirm("确认标记【" + phoneNum + "】为未使用吗?" + "Pid" + pids)) {
				$.ajax({
							url : "${pageContext.request.getContextPath()}/updateToNotUsed",
							async : true,
							datatype : "json",
							data : {
								"pids" : pids
							},
							type : "POST",
							success : function(result) {
								alert(result.msg);
							}
						});
			}
		}

		function findAdminWithoutUsed() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/telListNotUsed",
				/* data:"pn="+1, */
				type : "GET",
				success : function(result) {
					$("#page_nav_area").empty();
					//1解析并显示数据
					build_phone_table(result);
					//2.显示分页信息
					build_page_info(result);
					//3.显示分页条数据
					build_page_navNotUsed(result);
				}
			});
		}
		function findAdminWithUsed() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/telListUsed",
				/* 	data:"pn="+pn, */
				type : "GET",
				success : function(result) {
					//1解析并显示数据
					build_phone_table(result);
					//2.显示分页信息
					build_page_info(result);
					//3.显示分页条数据
					build_page_navUsed(result);
				}
			});
		}
	</script>
</body>
</html>