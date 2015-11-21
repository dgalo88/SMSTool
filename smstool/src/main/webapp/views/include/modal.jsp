<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="modal fade" id="modalConfirm" tabindex="-1" role="dialog" aria-labelledby="modalTitle" aria-hidden="true" style="display: none;">
	<div class="modal-dialog">
		<div class="modal-content">
			<br>
			<div class="modal-body text-center" id="modalText"></div>
			<div class="modal-footer">
				<button type="button" class="btn btn-danger" data-dismiss="modal" id="deny"><spring:message code="smstool.button.no" text="No"/></button>
				<button type="button" class="btn btn-primary" id="confirm"><spring:message code="smstool.button.yes" text="Yes"/></button>
			</div>
		</div>
	</div>
</div>