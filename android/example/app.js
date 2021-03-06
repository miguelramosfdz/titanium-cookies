// This is a test harness for your module

// open a single window
var win = Ti.UI.createWindow({
	title : 'Test Cookie Module'
});
win.open();

var monster = require('com.polancomedia.cookies');

var webview = Ti.UI.createWebView({
	url : 'http://github.com/adampax'
});

webview.addEventListener('load', function(e) {
	var url = e.url;
	
	Ti.API.info('fetch cookies for: ' + url);
	var cookieString = monster.getCookie(url);

	Ti.API.info('cookieString: ' + cookieString);

	parseCookie(cookieString);
});

win.add(webview);

//example of how to parse the cookie string
function parseCookie(str) {
	if (str !== null) {

		var list = str.split("; ");
		
		for (var i = 0; i < list.length; i++) {
			var cookie = list[i];
			var p = cookie.indexOf("=");
			
			var name = cookie.substring(0, p);
			var value = cookie.substring(p + 1);
			
			Ti.API.info('name: ' + name + ' value: ' + value);
		}
		alert('Retrieved ' + list.length + ' name/values');
	}
}
