package com.mps.think.setup.vo;

public class EnumModelVO {
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
	public static enum OrderClasses  {

		SAMPLE_1("SAMPLE_1"),SAMPLE_2("SAMPLE_2"),SAMPLE_3("SAMPLE_3");

	    private final String displayOrderClasses;

	    OrderClasses(String displayOrderClasses) {
	        this.displayOrderClasses = displayOrderClasses;
	    }

	    public String getDisplayName() {
	        return displayOrderClasses;
	    }
	}
	
	public static enum StartType  {

		ANY_TIME_START("ANY_TIME_START"),VOLUME_GROUP_START("VOLUME_GROUP_START"),DATA_BASED_WITH_ISSUES("DATA_BASED_WITH_ISSUES")
	    ,DATA_BASED_WITH_NO_ISSUES("DATA_BASED_WITH_NO_ISSUES"),DATA_BASED_WITH_UNITS("DATA_BASED_WITH_NO_ISSUES"),
		DATE_BASED_WITH_UNITS("DATE_BASED_WITH_UNITS"), UNIT_BASED_NO_TIME("UNIT_BASED_NO_TIME"),ANY("ANY");

	    private final String displayStartType;

	    StartType(String displayStartType) {
	        this.displayStartType = displayStartType;
	    }

	    public String getDisplayName() {
	        return displayStartType;
	    }
	}
	
	public static enum InstallmentTerm  {

		MONTHLY("MONTHLY"),YEARLY("YEARLY"),HALF_YEARLY("HALF_YEARLY");

	    private final String displayInstallmentTerm;

	    InstallmentTerm(String displayInstallmentTerm) {
	        this.displayInstallmentTerm = displayInstallmentTerm;
	    }

	    public String getDisplayName() {
	        return displayInstallmentTerm;
	    }
	}

}
