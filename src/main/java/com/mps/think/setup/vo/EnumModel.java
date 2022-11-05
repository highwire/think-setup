package com.mps.think.setup.vo;

public class EnumModel {
	public static enum Currency {

	    USD("USD"),INR("INR"),POUND("POUND"),EURO("EURO");

	    private final String displayCurrency;

	    Currency(String displayCurrency) {
	        this.displayCurrency = displayCurrency;
	    }

	    public String getDisplayName() {
	        return displayCurrency;
	    }
	}

	public static enum DateFormat  {

		MMDDYY("MMDDYY"),DDMMYY("DDMMYY"),YYMMDD("YYMMDD");

	    private final String displayDateFormat;

	    DateFormat(String displayDateFormat) {
	        this.displayDateFormat = displayDateFormat;
	    }

	    public String getDisplayName() {
	        return displayDateFormat;
	    }
	}
	
	public static enum TimeZone  {

		IST("IST"),AEST("AEST"),ACST("ACST"),AWST("AWST"),PDT("PDT"),MST("MST"),
		MDT("MDT"),CST("CST"),CDT("CDT"),EST("EST"),EDT("EDT"),AST("AST"),ADT("ADT"),
		NDT("NDT"),BST("BST"),HST("HST"),HDT("HDT"),AKDT("AKDT");

	    private final String displayTimeZone;

	    TimeZone(String displayTimeZone) {
	        this.displayTimeZone = displayTimeZone;
	    }

	    public String getDisplayName() {
	        return displayTimeZone;
	    }
	}


}
