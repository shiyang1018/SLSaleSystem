package org.slsale.common;
/*
 * mybatis防止sql注入工具栏
 */
public class SQLTools {
	/*
	 * mybatis模糊查询的时候防止sql注入（字符替换）
	 */
	public static String transfer(String keyword){
		if(keyword.contains("%")||keyword.contains("_")){
			keyword = keyword.replaceAll("\\\\", "\\\\\\\\")
					.replaceAll("\\%", "\\\\%")
					.replaceAll("\\_", "\\\\_");
		}
		return keyword;
	}
}
