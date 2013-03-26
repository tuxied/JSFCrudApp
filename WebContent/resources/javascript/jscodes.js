function closeDialogIfSucess(xhr, status, args, dialogWidget, dialogId) {
	if (args.validationFailed || args.KEEP_DIALOG_OPENED) {
		jQuery('#'+dialogId).effect("bounce", {times : 4, distance : 20}, 100);
	} else {
		dialogWidget.hide();
	}
}

function validate(xhr, status, args, dialogWidget) {
	alert("h1");
	if (args.validationFailed) {
		alert("h2 validate failed");
		jQuery('#'+dialogId).effect("bounce", {times : 4, distance : 20}, 100);
	} else {
		alert("h else");
		dialogWidget.hide();
	}
}