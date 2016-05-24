<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Main content -->
	<section class="content">
		<!-- Premium row -->

		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="box box-warning">
					<form role="form" method="post">
						<div class="box-header with-border">
							<div class='user-block'>
								<!-- <img class='img-circle' src='dist/img/user2-160x160.jpg' alt='user image'>
                                <span class='username'><a href="#">Jonathan Burke Jr.</a></span> -->
								<input type="text" name='user_id' class="form-control"
									placeholder="Writer">
							</div>
							<!-- /.user-block -->
						</div>
						<!-- /.box-header -->
						<div class="box-body">
							<!-- textarea -->
							<div class="form-group">
								<textarea class="form-control" name="body" rows="3"
									placeholder="What's on your mind?"></textarea>
							</div>
						</div>
						<!-- /.box-body -->
						<div class="box-footer">
							<!--  <div class="btn btn-warning btn-file">
                                <i class="fa fa-image"></i>
                                <input type="file" accept="image/*" name="attachment">
                            </div> -->
							<button type="submit" class="btn btn-success pull-right">Post</button>
						</div>
						<!-- /.box-footer -->
					</form>
				</div>
				<!-- /.box -->
			</div>
			<!-- /.col -->
		</div>
		<!-- /.row -->

	</section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@ include file="../include/footer.jsp"%>