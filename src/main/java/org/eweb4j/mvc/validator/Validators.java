package org.eweb4j.mvc.validator;

public interface Validators {
	static String REQUIRED = "required";
	static String INT = "int";
	static String SIZE = "size";
	static String LENGTH = "length";
	static String FORBID = "forbid";
	static String ENUM = "enum";
	static String DATE = "date";
	static String EMAIL = "email";
	static String CHINESE = "chinese";
	static String ZIP = "zip";
	static String URL = "url";
	static String ID_CARD = "idCard";
	static String PHONE = "phone";
	static String QQ = "qq";
	static String IP = "ip";
	static String REGEX = "regex";
	static String EQUALS = "equals";
	static String UPLOAD = "upload";
	
	static String EQUALS_TO_PARAM = "to";
	static String MIN_SIZE_PARAM = "minSize";
	static String MAX_SIZE_PARAM = "maxSize";
	static String MIN_LENGTH_PARAM = "minLength";
	static String MAX_LENGTH_PARAM = "maxLength";
	static String FORBID_WORD_PARAM = "forbidWord";
	static String ENUM_WORD_PARAM = "enumWord";
	static String REGEX_PARAM = "regex";
	static String DATE_FORMAT_PARAM = "format";
	
	static String UPLOAD_MAX_REQ_SIZE = "maxRequestSize";
	static String UPLOAD_MAX_MEMORY_SIZE = "maxMemorySize";
	static String UPLOAD_MAX_FILE_SIZE = "maxFileSize";
	static String UPLOAD_TMP_DIR = "tmpDir";
	static String UPLOAD_SUFFIX = "suffix";
	
	static String UPLOAD_MAX_REQ_SIZE_MSG = "maxRequestSizeMsg";
	static String UPLOAD_MAX_MEMORY_SIZE_MSG = "maxMemorySizeMsg";
	static String UPLOAD_MAX_FILE_SIZE_MSG = "maxFileSizeMsg";
	static String UPLOAD_SUFFIX_MSG = "suffixMsg";
	
	static String ALERT_LOC = "alert";
	static String OUT_LOC = "out";
	static String DWZ_JSON_LOC = "dwzJson";
	static String JAVASCRIPT_LOC = "javaScript";
	static String DEFAULT_LOC = "";
}
