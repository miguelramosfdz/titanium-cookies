/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.polancomedia.cookies;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;

import android.webkit.CookieManager;

@Kroll.module(name="Android", id="com.polancomedia.cookies")
public class AndroidModule extends KrollModule
{

	// Standard Debugging variables
	private static final String TAG = "CookiesModule";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public AndroidModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		//Log.d(TAG, "inside onAppCreate");
		// put module init code that needs to run when the application is created
	}

	// Methods
	@Kroll.method
	public String getCookies(String siteUrl){  

	    CookieManager cookieManager = CookieManager.getInstance();
	    String cookies = cookieManager.getCookie(siteUrl);       
            
	    return cookies; 
	}

}
