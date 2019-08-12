<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user-title</title>
<script type="text/javascript"
	src="${pageContext.request.getContextPath()}/static/jquery-3.3.1/jquery-3.3.1.min.js">
	
</script>
<link
	href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<style type="text/css">
.s_color {
	color: #fff;
}

.sidebar {
	margin: 2px;
	background-color: #f1f1f1;
}

#uploadTxt {
	margin-top: 8px;
}

.table-responsive {
	margin: 0px 20px;
}

.ddgg {
	margin: 0px 20px;
}

a {
	color: #fff;
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

			<!-- <ul class="nav navbar-nav navbar-right">
				<li><button id="uploadTxt" class="a_right s_color btn-danger">上传话术</button> </li>
	        </ul>
	        <form class="navbar-form navbar-right s_color" id="uploadFile" enctype="multipart/form-data">         
	        <input id="file" type="file" name="file" />        
       		</form>  -->

			<form name="Form2" class="navbar-form navbar-right"
				action="${pageContext.request.getContextPath()}/springUpload"
				method="post" enctype="multipart/form-data">
				<input type="file" class="s_color" name="file"> <input
					type="submit" value="上传话术" />
			</form>

		</div>
	</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-xs-8 col-md-offset-3">
				<button class="btn-default list_btn_all" onclick="list_btn_all()">查看</button>
				&nbsp;&nbsp;
				<button class=" btn-default" onclick="findWithoutUsed()">未使用</button>
				<button class=" btn-default" onclick="findWithUsed()">已使用</button>
				&nbsp;&nbsp;
				<button title="仅支持13W内的数据导出" class="btn-info btn-warming"
					onclick="exceldown()">导出</button>
				&nbsp;&nbsp;
				<button class="btn-info btn-default" onclick="updateToUsed()">标记已使用</button>
				<button class="btn-info btn-default" onclick="updateToNotUsed()">标记未使用</button>
				&nbsp;&nbsp;
				<button class="btn-danger btn-default" id="clearData">清空数据</button>
				<button class="btn-warning btn-default" onclick="listtxtall()">查看话术</button>				
				<button class="btn-warning btn-default" onclick="cardSend()">卡发明细</button>
			</div>
		</div>
		<br>

	</div>

	
 
		<div class="bgcent ">
		
		
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-2 sidebar">
					<form class="navbar-form navbar-left" id="uploadForm"
						enctype="multipart/form-data">
						<input id="file" type="file" name="file" />
					</form>
					<br>
					<br>
					<ul class="nav nav-sidebar navli">
						<li><button id="upload" class="a_right btn-danger">上传数据</button>
						</li>
						<li><input type="radio" name="tablename" value="a1">a1</li>
						<li><input type="radio" name="tablename" value="a2">a2</li>
						<li><input type="radio" name="tablename" value="a3">a3</li>
						<li><input type="radio" name="tablename" value="a4">a4</li>
						<li><input type="radio" name="tablename" value="a5">a5</li>
						<li><input type="radio" name="tablename" value="a6">a6</li>
						<li><input type="radio" name="tablename" value="a7">a7</li>
						<li><input type="radio" name="tablename" value="a8">a8</li>
						<li><input type="radio" name="tablename" value="a9">a9</li>
						<li><input type="radio" name="tablename" value="a10">a10</li>

						<li><input type="radio" name="tablename" value="a11">a11</li>
						<li><input type="radio" name="tablename" value="a12">a12</li>
						<li><input type="radio" name="tablename" value="a13">a13</li>
						<li><input type="radio" name="tablename" value="a14">a14</li>
						<li><input type="radio" name="tablename" value="a15">a15</li>
						<li><input type="radio" name="tablename" value="a16">a16</li>
						<li><input type="radio" name="tablename" value="a17">a17</li>
						<li><input type="radio" name="tablename" value="a18">a18</li>
						<li><input type="radio" name="tablename" value="a19">a19</li>
						<li><input type="radio" name="tablename" value="a20">a20</li>

						<li><input type="radio" name="tablename" value="a21">a21</li>
						<li><input type="radio" name="tablename" value="a22">a22</li>
						<li><input type="radio" name="tablename" value="a23">a23</li>
						<li><input type="radio" name="tablename" value="a24">a24</li>
						<li><input type="radio" name="tablename" value="a25">a25</li>
						<li><input type="radio" name="tablename" value="a26">a26</li>
						<li><input type="radio" name="tablename" value="a27">a27</li>
						<li><input type="radio" name="tablename" value="a28">a28</li>
						<li><input type="radio" name="tablename" value="a29">a29</li>
						<li><input type="radio" name="tablename" value="a30">a30</li>

						<li><input type="radio" name="tablename" value="a31">a31</li>
						<li><input type="radio" name="tablename" value="a32">a32</li>
						<li><input type="radio" name="tablename" value="a33">a33</li>
						<li><input type="radio" name="tablename" value="a34">a34</li>
						<li><input type="radio" name="tablename" value="a35">a35</li>
						<li><input type="radio" name="tablename" value="a36">a36</li>
						<li><input type="radio" name="tablename" value="a37">a37</li>
						<li><input type="radio" name="tablename" value="a38">a38</li>
						<li><input type="radio" name="tablename" value="a39">a39</li>
						<li><input type="radio" name="tablename" value="a40">a40</li>

						<li><input type="radio" name="tablename" value="a41">a41</li>
						<li><input type="radio" name="tablename" value="a42">a42</li>
						<li><input type="radio" name="tablename" value="a43">a43</li>
						<li><input type="radio" name="tablename" value="a44">a44</li>
						<li><input type="radio" name="tablename" value="a45">a45</li>
						<li><input type="radio" name="tablename" value="a46">a46</li>
						<li><input type="radio" name="tablename" value="a47">a47</li>
						<li><input type="radio" name="tablename" value="a48">a48</li>
						<li><input type="radio" name="tablename" value="a49">a49</li>
						<li><input type="radio" name="tablename" value="a50">a50</li>

						<li><input type="radio" name="tablename" value="a51">a51</li>
						<li><input type="radio" name="tablename" value="a52">a52</li>
						<li><input type="radio" name="tablename" value="a53">a53</li>
						<li><input type="radio" name="tablename" value="a54">a54</li>
						<li><input type="radio" name="tablename" value="a55">a55</li>
						<li><input type="radio" name="tablename" value="a56">a56</li>
						<li><input type="radio" name="tablename" value="a57">a57</li>
						<li><input type="radio" name="tablename" value="a58">a58</li>
						<li><input type="radio" name="tablename" value="a59">a59</li>
						<li><input type="radio" name="tablename" value="a60">a60</li>




					</ul>
				</div>
				<div class="row col-md-5 main">
					<div class="table-responsive">
						<table class="table table-striped text-center " id="phone_table">
							<thead>
								<tr>
									<th class="info text-center"><input type="checkbox"
										id="check_all"></th>
									<th class="info text-center">序号</th>
									<th class="info text-center">电话号码</th>
									<th class="info text-center">状态</th>
								</tr>
							</thead>
							<tbody></tbody>
						</table>
					</div>
					<div class="row col-md-offset-1" id="page_info_area"></div>
					<div class="row col-md-offset-1" id="page_nav_area"></div>
				</div>

				<div class="row col-md-4 tab-right">
					<div class="table-responsive ">
						<table class="table   text-center " id="file_table">
							<thead>
								<tr>
									<th class="info text-center">序号</th>
									<th class="info text-center">文件名称</th>
									<th class="info text-center">上传时间</th>
									<th class="info text-center">导出</th>
									<th class="info text-center">删除</th>
								</tr>
							</thead>
							<tbody></tbody>
						</table>
					</div>
				</div>
			
					
			
				
					
					







			</div>
		</div>

	</div>
	<script type="text/javascript">
		var tablename;
		var currentPage;

		$("#upload")
				.click(
						function() {
							var formData = new FormData($('#uploadForm')[0]);
							tablename = $('input:radio:checked').val();
							console.log(tablename);
							if (tablename != null) {
								formData.append("tablename", tablename);
								$
										.ajax({
											type : "post",
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
							} else {
								alert("请先选择表名");
							}
						})

		function exceldown() {
			tablename = $('input:radio:checked').val();
			console.log(tablename);
			if (tablename != null) {
				window.location.href = "${pageContext.request.getContextPath()}/excel_down?tablename="
						+ tablename;
			} else {
				alert("请先选择表名");
			}
		}

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
			tablename = $('input:radio:checked').val();
			console.log(tablename);
			if (tablename != null) {
				$
						.ajax({
							url : "${pageContext.request.getContextPath()}/teleListWithEmpno",
							datatype : 'json',
							data : {
								"pn" : pn,
								"tablename" : tablename
							},
							type : "GET",
							success : function(result) {
								//1解析并显示数据
								build_phone_table(result);
								//2.显示分页信息
								build_page_info_record(result);
								//3.显示分页条数据
								build_page_nav(result);
							}
						});
			} else {
				alert("请先选择表名");
			}
		}

		function to_pageNotUsed(pn) {
			tablename = $('input:radio:checked').val();
			console.log(tablename);
			if (tablename != null) {
				$
						.ajax({
							url : "${pageContext.request.getContextPath()}/teleListWithoutUsed",
							data : {
								"pn" : pn,
								"tablename" : tablename
							},
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
			} else {
				alert("请先选择表名");
			}
		}

		function to_pageUsed(pn) {
			tablename = $('input:radio:checked').val();
			console.log(tablename);
			if (tablename != null) {
				$
						.ajax({
							url : "${pageContext.request.getContextPath()}/teleListWithUsed",
							data : {
								"pn" : pn,
								"tablename" : tablename
							},
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
			} else {
				alert("请先选择表名");
			}
		}

		function findWithoutUsed(pn) {
			tablename = $('input:radio:checked').val();
			console.log(tablename);
			if (tablename != null) {
				$
						.ajax({
							url : "${pageContext.request.getContextPath()}/teleListWithoutUsed",
							data : {
								"pn" : pn,
								"tablename" : tablename
							},
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
			} else {
				alert("请先选择表名");
			}
		}

		function findWithUsed(pn) {
			tablename = $('input:radio:checked').val();
			console.log(tablename);
			if (tablename != null) {
				$
						.ajax({
							url : "${pageContext.request.getContextPath()}/teleListWithUsed",
							data : {
								"pn" : pn,
								"tablename" : tablename
							},
							type : "GET",
							success : function(result) {
								//1解析并显示数据
								$("#page_nav_area").empty();
								build_phone_table(result);
								//2.显示分页信息
								build_page_info(result);
								//3.显示分页条数据
								build_page_navUsed(result);
							}
						});
			} else {
				alert("请先选择表名");
			}
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
								checkboxTd.attr("update-pid", item.pid);
								var pidTd = $("<td></td>").append(item.pid);
								var phoneTd = $("<td></td>").append(
										item.telephone);
								var statusTd = $("<td></td>").append(
										item.status_id == 0 ? "未使用" : "已使用");
								/* var editBtn = $("<button></button>").addClass("btn btn-primary brn-sm")
								.append($("<span></span>").addClass("glyphicon glyphicon-pencil").append("编辑")); */
								/* 	var delBtn = $("<button></button>").addClass("btn btn-danger brn-sm del_btn")
									.append($("<span></span>").addClass("glyphicon glyphicon-trash").append("删除")); */
								/* delBtn.attr("del-pid",item.pid); */
								/* var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn); */
								$("<tr></tr>").append(checkboxTd).append(pidTd)
										.append(phoneTd).append(statusTd)
										/* 	.append(delBtn) */
										.appendTo("#phone_table tbody");
							});
		}
		//构建分页数据
		function build_page_info(result) {
			//page_info_area
			$("#page_info_area").empty();
			$("#page_info_area").append(
					"当前" + result.extend.PageInfo.pageNum + "页,总"
							+ result.extend.PageInfo.pages + "页数录,总"
							+ result.extend.PageInfo.total + "条记录").addClass(
					"col-md-offset-3");
			currentPage = result.extend.PageInfo.pageNum;
			console.log(currentPage);
		}

		function build_page_info_record(result) {
			//page_info_area
			$("#page_info_area").empty();
			$("#page_info_area").append(
					"总" + result.extend.PageInfo.total + "条记录,未使用"
							+ result.extend.notusedcount + "条记录,已使用"
							+ result.extend.usedcount + "条记录").addClass(
					"col-md-offset-3");
			currentPage = result.extend.PageInfo.pageNum;
			console.log(currentPage);
		}

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

		function updateToUsed() {
			var phoneNum = "";
			var pids = "";
			tablename = $('input:radio:checked').val();
			console.log(tablename);
			$.each($(".check_item:checked"), function() {
				phoneNum += $(this).parents("tr").find("td:eq(2)").text();
				pids += $(this).parents("tr").find("td:eq(1)").text() + "-";
			});
			phoneNum = phoneNum.substring(0, phoneNum.length - 1);
			pids = pids.substring(0, pids.length - 1);
			if (confirm("确认标记【" + phoneNum + "】为已使用吗?")) {
				$
						.ajax({
							url : "${pageContext.request.getContextPath()}/updateToUsed",
							async : true,
							datatype : "json",
							data : {
								"pids" : pids,
								"tablename" : tablename
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
			tablename = $('input:radio:checked').val();
			console.log(tablename);
			$.each($(".check_item:checked"), function() {
				phoneNum += $(this).parents("tr").find("td:eq(2)").text();
				pids += $(this).parents("tr").find("td:eq(1)").text() + "-";
			});
			phoneNum = phoneNum.substring(0, phoneNum.length - 1);
			pids = pids.substring(0, pids.length - 1);
			if (confirm("确认标记【" + phoneNum + "】为未使用吗?" + "Pid" + pids)) {
				$
						.ajax({
							url : "${pageContext.request.getContextPath()}/updateToNotUsed",
							async : true,
							datatype : "json",
							data : {
								"pids" : pids,
								"tablename" : tablename
							},
							type : "POST",
							success : function(result) {
								alert(result.msg);
							}
						});
			}
		}

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

		$("#clearData")
				.click(
						function() {
							tablename = $('input:radio:checked').val();
							console.log(tablename);
							if (tablename != null) {
								if (confirm("确认删除【" + tablename + "】的数据吗?")) {
									$
											.ajax({
												url : "${pageContext.request.getContextPath()}/emptyUserDataById",
												type : "POST",
												datatype : "json",
												data : {
													"tablename" : tablename
												},
												success : function(result) {
													alert(result.msg);
												}
											});
								}
							} else {
								alert("请先选择表");
							}
						});

		function build_txt_table(result) {
			//phone_table tbody
			$("#file_table tbody").empty();
			var txtlist = result.extend.list;
			$.each(txtlist, function(index, item) {
				var indexTd = $("<td></td>").append(index);
				var txtnameTd = $("<td></td>").append(item.txtname);
				var adddateTd = $("<td></td>").append(item.adddate);
				var downBtn = $("<button></button>").addClass(
						"btn btn-primary brn-sm downBtn").append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-pencil").append("下载"));
				var editTd = $("<td></td>").append(downBtn);
				downBtn.attr("downFile", item.txtname);
				var delBtn = $("<button></button>").addClass(
						"btn btn-danger brn-sm del_file").append(
						$("<span></span>")
								.addClass("glyphicon glyphicon-trash").append(
										"删除"));
				var detTd = $("<td></td>").append(delBtn);
				delBtn.attr("del-file", item.txtname);
				/*  var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);  */
				$("<tr></tr>").append(indexTd).append(txtnameTd).append(
						adddateTd).append(editTd).append(detTd).appendTo(
						"#file_table tbody");
			});
		}

		function listtxtall() {
			$.ajax({
				url : "${pageContext.request.getContextPath()}/listTxtByempno",
				type : 'GET',
				success : function(result) {
					console.log(result);
					build_txt_table(result);
				}

			});
		}

		$(document).on("click", ".del_file", function() {
			var txtname = $(this).parents("tr").find("td:eq(1)").text();
			console.log(txtname);
			//	alert($(this).parents("tr").find("td:eq(0)").text());
			if (confirm("确认删除【" + txtname + "】吗?")) {
				$.ajax({
					url : "${pageContext.request.getContextPath()}/fileDelete",
					type : "POST",
					datatype : 'json',
					data : {
						"txtname" : txtname
					},
					succuss : function(result) {
						alert(result.msg);
					}
				});
			}
		});

		$(document)
				.on(
						"click",
						".downBtn",
						function() {
							var txtname = $(this).parents("tr")
									.find("td:eq(1)").text();
							console.log(txtname);
							window.location.href = "${pageContext.request.getContextPath()}/downloadTxt?txtname="
									+ txtname;
						});

		/* $(document).on("click",".del_btn",function(){
		var phoneNum = $(this).parents("tr").find("td:eq(2)").text();
		var pid = $(this).attr("del-pid");
		//	alert($(this).parents("tr").find("td:eq(0)").text());
			if(confirm("确认删除【"+phoneNum+"】吗?")){
				$.ajax({
					url:"${pageContext.request.getContextPath()}/telePhone/"+pid,
					type:"DELETE",
					succuss:function(result){
						alert(result.msg);
						to_page(currentPage);
					}
				});
			}	
		}); */
		function cardSend() {
			 
				window.location.href = "${pageContext.request.getContextPath()}/cardSendDetail";
			 
		}
		
		
	
		/* 开发结束 */
	</script>
</body>
</html>